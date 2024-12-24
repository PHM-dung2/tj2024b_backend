package day12.boardprogram7;

import java.util.Scanner;

import day07.Board;

public class BoardService {
	
//	게시물등록함수
	public void boardAdd( Scanner sc , BoardDto[] boards , String loginId ) {
		System.out.print("제목 : ");		String title = sc.next();
		System.out.print("내용 : ");		String content = sc.next();
		System.out.println("작성자 : 현재 로그인된 id ");	
		BoardDto boardDto = new BoardDto( title , content , loginId );
		
		for( int i = 0 ; i < boards.length ; i++ ) {
			if( boards[i] == null ) {
				boards[i] = boardDto;
				System.out.println("게시물 등록 성공");
				break;
			} // if end
		} // for end
	} // f end
	
	public void boardPrint( BoardDto[] boards ) {
		System.out.println("순번\t작성자\t제목\t내용");
		for( int i = 0 ; i < boards.length ; i++ ) {
			if( boards[i] != null ) {
				System.out.printf(" %d \t %s \t %s \t %s \n " , 
						i + 1 , 
						boards[i].getTitle() ,
						boards[i].getContent() ,
						boards[i].getWriter() );
			} // if end
		} // for end
	} // f end
}
