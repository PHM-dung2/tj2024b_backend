package boardservice10.view;

import java.util.ArrayList;
import java.util.Scanner;
import boardservice10.controller.BoardController;
import boardservice10.model.dto.BoardDto;

public class BoardView {
//	+ 싱글톤
	private BoardView(){}
	private static BoardView instance = new BoardView();
	public static BoardView getinstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	
//	0. (로그인 했을때) 메인 메뉴 메소드
	public void index() {
		while(true) {
			findAll();
			System.out.println("1.로그아웃 2.내정보 3.게시물작성 4.게시물상세보기");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { MemberView.getInstance().logOut(); break; }
			else if( choose == 2 ) { 
				int state = MemberView.getInstance().myInfo();
				if( state == 1 ) { 
					System.out.println("탈퇴가 완료되었습니다.");
					break; 
					}
			}
			else if( choose == 3 ) {  }
			else if( choose == 4 ) { findById(); }
		} // w end
	} // f end
	
//	1. 전체 게시물 조회 화면
	public void findAll() {
		System.out.println("===== 전체 게시물 =====");
		System.out.println("번호\t카테고리\t작성자\t작성일\t\t\t제목");
		ArrayList<BoardDto> result = BoardController.getInstance().findAll();
		for( int i = 0 ; i < result.size() ; i++ ) {
			BoardDto boardDto = result.get(i);
			System.out.print( boardDto.getBno() + "\t" );
			System.out.print( boardDto.getCname() + "\t" );
			System.out.print( boardDto.getMid() + "\t" );
			System.out.print( boardDto.getBdate() + "\t" );
			System.out.print( boardDto.getBtitle() + "\n" );
		} // for 
		
	} // f end
	
//	2. 개별(1개) 게시물 조회 회면
	public void findById() {
		System.out.print(">> 게시물 번호 ");	int bno = scan.nextInt();
		BoardDto result = BoardController.getInstance().findById( bno );
		System.out.println( result.getBtitle() );
		System.out.println( result.getCname() + "\t" + result.getMid() + "\t" + result.getBview() + "\t" + result.getBdate() );
		System.out.println( result.getBcontent() );
//			-- 추후에 댓글 출력되는 코드
		
	}
	
	
}
