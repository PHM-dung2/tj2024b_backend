package day07;

import java.util.Scanner;

/*

	실습2 : 게시판 프로그램
	 	- 문법 : 변수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체
		- 제목 , 내용 , 작성자 를 입력받아서 저장/출력/삭제/수정 구현
	- 게시물 3개 저장 하기, 게시물1개당 제목/내용/작성자 저장소(변수) 3개 필요 , 게시물3 --> 변수 9개 필요.
	
*/
public class boardProgram2 {

//	main + 자동완성
	public static void main(String[] args) {
//		[1] 클래스 만들기 , 객체 생성
		Board board1 = new Board();
		Board board2 = new Board();
		Board board3 = new Board(); // 게시물 객체 3개를 생성
		
		while(true) {
			System.out.print("1.등록 2.출력 ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			if( choose == 1 ) {	System.out.println(">> 등록 선택했습니다. ");
				System.out.print("> 제목 : ");		String title = sc.next();
				System.out.print("> 내용 : ");		String content = sc.next();
				System.out.print("> 작성자 : ");	String writer = sc.next();
//				[2] 만약에 비어 있는 객체가 있으면
				if( board1.title == null ) {
					board1.title = title; board1.content = content; board1.writer = writer;
				}else if( board2.title == null) {
					board2.title = title; board2.content = content; board2.writer = writer;
				}else if( board3.title == null) {
					board3.title = title; board3.content = content; board3.writer = writer;
				}
			} // if end
			else if( choose == 2) { System.out.println(">> 출력 선택했습니다. ");
				if( board1.title != null ) { 
					System.out.println("제목 : " + board1.title + " 내용 : " + board1.content + " 작성자 : " + board1.writer );
				}
				if( board2.title != null ) { 
					System.out.println("제목 : " + board2.title + " 내용 : " + board2.content + " 작성자 : " + board2.writer );
				}
				if( board3.title != null ) { 
					System.out.println("제목 : " + board3.title + " 내용 : " + board3.content + " 작성자 : " + board3.writer );
				}
			} // if end
			
			sc.close();
		} // w e
		
	}

}
