package day13.boardProgram8.view;

import java.util.Scanner;

import day13.boardProgram8.controller.BoardController;
import day13.boardProgram8.model.dto.BoardDto;

public class BoardView {
//	+ 싱글톤
	private BoardView() {}
	private static BoardView instance = new BoardView();
	public static BoardView getInstance() {
		return instance;
	}
//	- 싱글톤 end

//	+ 멤버변수( 입력객체 : 모든 메소드에서 사용하기 위해서 )
	private Scanner scan = new Scanner(System.in);
	
//	1. 메인페이지 입출력 메소드
	public void index() {
		while(true) {
			System.out.print(" [메인 페이지] 1.글등록 2.글출력 : ");
			int choose = scan.nextInt();
			if( choose == 1 ) { write(); }
			else if( choose == 2 ) { findAll(); }
		} // w end
		
	} // f end
//	2. 글쓰기 입출력 메소드		함수명 : 임의
	public void write() {
//		[1] 입력
		System.out.println(" [글쓰기 페이지] ");
		System.out.print(" 제목 : ");		String title = scan.next();
		System.out.print(" 내용 : ");		String content = scan.next();
		System.out.print(" 작성자 : ");	String writer = scan.next();
//		[2] 객체화
		BoardDto boardDto = new BoardDto(title, content, writer);
//		[3] 컨트롤러에게 저장할 객체를 전달하고 결과를 응답받기
		boolean result = BoardController.getInstance().write(boardDto);
//		[4]
		if( result == true ) {
			System.out.println(" [글쓰기 성공] ");
		}else {
			System.out.println(" [글쓰기 실패] ");
		}
	}
//	3. 모든 글출력 입출력 메소드	함수명 : 임의
	public void findAll(){
		System.out.println(" [모든글출력 페이지] ");
//		[1] 컨트롤러에게 모든 게시물정보를 요청하고 결과받기
		BoardDto[] result = BoardController.getInstance().findAll();
//		[2] 요청 결과 출력하기
		for( int index = 0 ; index < result.length ; index++ ) {
			BoardDto board = result[index];
			if( board != null ) {
				System.out.printf(" %d , %s , %s , %s \n" , 
						index + 1 , 
						board.getTitle() , 
						board.getContent() , 
						board.getWriter() );
			} // if end
		}
	}

}
