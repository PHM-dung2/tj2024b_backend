package day14.boardProgram9.view;

import java.util.ArrayList;
import java.util.Scanner;

import day14.boardProgram9.controller.BoardController;
import day14.boardProgram9.model.dto.BoardDto;

public class BoardView {
//	싱글톤
	private BoardView() {}
	private static BoardView instance = new BoardView();
	public static BoardView getInstance() {
		return instance;
	}
	
//	+ 입력객체( 현재 클래스내부의 모든 함수들에서 사용하기 위해 멤버변수에 선언 )
	private Scanner scan = new Scanner(System.in);
	
//	메소드
//	0. 메인페이지 표현 함수
	public void run() {
		while(true) {
			System.out.println("===== 게시판 프로그램 =====");
			System.out.print("게시판 1.등록(C) 2.출력(R) 3.수정(U) 4.삭제(D) ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { create(); }
			else if( choose == 2 ) { readAll(); }
			else if( choose == 3 ) { update(); }
			else if( choose == 4 ) { delete(); }
		} // w end
	} // f end
	
//	1. 게시물 쓰기 페이지 함수
	public void create() {
		System.out.println("===== 게시판 등록 =====");
		System.out.print("제목 : ");		String title = scan.next();
		System.out.print("내용 : ");		String content = scan.next();
		System.out.print("작성자 : ");		String writer = scan.next();
		BoardDto boardDto = new BoardDto( title , content , writer );
		boolean result = BoardController.getInstance().create( boardDto );
		
		if( result ) { System.out.println("[save success]"); }
		else { System.out.println("[save fail]"); }
		
		
	} // f end
	
//	2. 게시물 출력 페이지 함수
	public void readAll() {
		System.out.println("===== 게시판 출력 =====");
		System.out.println("순번 \t 제목 \t 내용 \t 작성자 ");
		ArrayList<BoardDto> result = BoardController.getInstance().readAll();
		
		for( int i = 0 ; i < result.size() ; i++ ){
			BoardDto board = result.get(i);
				System.out.printf("%d \t %s \t %s \t %s\n" , 
						i+1 , board.getTitle() , board.getContent() , board.getWriter() );
		} // for end
		
		
	} // f end
	
//	3. 게시물 수정 페이지 함수
	public void update() {
		System.out.println("===== 게시판 수정 =====");
		System.out.print("순번 : ");		int uIndex = scan.nextInt() - 1;
		System.out.print("제목 : ");		String title = scan.next();
		System.out.print("내용 : ");		String content = scan.next();
		System.out.print("작성자 : ");	String writer = scan.next();
		BoardDto boardDto = new BoardDto( title , content , writer );
		boolean result = BoardController.getInstance().update(uIndex , boardDto);
		
		if( result ) { System.out.println("[update success]"); }
		else { System.out.println("[update fail]"); }
	}
	
//	4. 게시물 삭제 페이지 함수
	public void delete() {
		System.out.println("===== 게시판 삭제 =====");
		System.out.print("순번 : ");		int dIndex = scan.nextInt() - 1;
		boolean result = BoardController.getInstance().delete(dIndex);
		
		if( result ) { System.out.println("[delete success]"); }
		else { System.out.println("[delete fail]"); }
	}
	
}
