package day10;

import java.util.Scanner;

public class BoardService {
//	클래스 멤버
//	1. 멤버변수
//	2. 생성자
//	3. 메소드/멤버함수
//		1. 등록 함수 boardAdd , 실행조건 : 주메뉴에서 1입력시 , 매개변수 : 입력객체 / 게시물목록[] , 반환값 : 없음
	void boardAdd( Scanner sc , Board[] boards ) {
		System.out.print("제목 : ");		String title = sc.next();
		System.out.print("내용 : ");		String content = sc.next();
		System.out.print("작성자 : ");	String writer = sc.next();
//		=============== 생성자를 이용한 객체 생성 ===============
		Board board = new Board( title , content , writer );
		for( int index = 0 ; index < boards.length ; index++ ) {
			if( boards[index] == null ) {
				boards[index] = board;
				break;
			}
		} // for end
	} // m end
//		2. 출력 함수 boardPrint , 실행조건 : 주메뉴에서 2입력시 , 매개변수 : 게시물목록[] , 반환값 : 없음
	void boardPrint( Board[] boards ) {
		
	} // m end
}