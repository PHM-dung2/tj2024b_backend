package boardservice10.view;

import java.util.ArrayList;
import java.util.Scanner;
import boardservice10.controller.BoardController;
import boardservice10.model.dto.BoardDto;
import boardservice10.model.dto.CategoryDto;

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
			else if( choose == 3 ) { write(); }
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
	
//	2. 개별(1개) 게시물 조회 화면
	public void findById() {
		System.out.print(">> 게시물 번호 ");	int bno = scan.nextInt();
		BoardDto result = BoardController.getInstance().findById( bno );
		System.out.println("제목\t카테고리\t아이디\t조회수\t작성일 ");
		System.out.print( result.getBtitle() + "\t" );
		System.out.println( result.getCname() + "\t" + result.getMid() + "\t" + result.getBview() + "\t" + result.getBdate() );
		System.out.println("\n내용");
		System.out.println( result.getBcontent() );
		
		while(true) {
			System.out.print("1.뒤로가기 2.댓글작성(구현x) 3.수정 4.삭제");
			int choose = scan.nextInt();
			if( choose == 1) { break; }
			else if( choose == 2) { }
			else if( choose == 3) { update(bno); break; }
			else if( choose == 4) { delete(bno); break; }
		} // w end
		
	} // f end
	
//  3. 전체 카테고리 출력
	public void category() {
		System.out.println("===== 전체 카테고리 =====");
		System.out.println("번호\t카테고리");
		
		ArrayList<CategoryDto> result = BoardController.getInstance().category();
		for( int i = 0 ; i < result.size() ; i++ ) {
			CategoryDto categoryDto = result.get(i);
			System.out.printf("%d\t%s\n" , 
					categoryDto.getCno(),
					categoryDto.getCname()
					);
		} // for end
	} // f end
	
//	4. 게시물 쓰기
	public void write() {
		System.out.println("===== 게시물 쓰기 =====");
		category();
		System.out.print("카테고리 번호 : ");	int cno = scan.nextInt();
		System.out.print("제목 : ");			String btitle = scan.next();
		System.out.print("내용 : ");			String bcontent = scan.next();
		
		BoardDto boardDto = new BoardDto();
		boardDto.setCno(cno);
		boardDto.setBtitle(btitle);
		boardDto.setBcontent(bcontent);
		
		boolean result = BoardController.getInstance().write( boardDto );
		if( result ) { System.out.println("글쓰기 성공"); }
		else { System.out.println("글쓰기 실패"); }
	} // f end
	
//  5. 게시물 수정
	public void update(int bno) {
		System.out.println("===== 게시물 수정 =====");
		category();
		System.out.print("카테고리 번호 : ");	int cno = scan.nextInt();
		System.out.print("제목 : ");			String btitle = scan.next();
		System.out.print("내용 : ");			String bcontent = scan.next();
		
		BoardDto boardDto = new BoardDto();
		boardDto.setCno(cno);
		boardDto.setBtitle(btitle);
		boardDto.setBcontent(bcontent);
		boardDto.setBno(bno);
		
		boolean result = BoardController.getInstance().update( boardDto );
		if( result ) { System.out.println("게시물 수정 성공"); }
		else { System.out.println("작성한 회원만 수정이 가능합니다"); }
	} // f end
	
//	6. 게시물 삭제
	public void delete(int bno) {
		System.out.println("===== 게시물 삭제 =====");
		System.out.println("정말 삭제하시겠습니까?");
		System.out.print("1.예 2.아니오 ");
		int choose = scan.nextInt();
		if( choose == 1 ) { 
			boolean result = BoardController.getInstance().delete( bno );
			if( result ) { System.out.println("게시물 삭제 성공"); }
			else { System.out.println("작성한 회원만 삭제가 가능합니다."); }
		}
	} //  f end
	
}
