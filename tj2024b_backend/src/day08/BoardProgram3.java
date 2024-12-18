package day08;

import java.util.Scanner;

/*

	실습3 : 게시판 프로그램
 	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체 , 배열
	- 제목 , 내용 , 작성자 를 입력받아서 저장/출력 구현
	- 게시물 클래스 설계하기
	- 게시물 최대 100개 저장 하기, 게시물1개당 객체 1개 필요 , 제목/내용/작성자 저장소(변수) 3개 필요 , 게시물3 --> 변수 9개 필요.

*/
public class BoardProgram3 {

	public static void main(String[] args) {

//		[1] 클래스 정의하기 , 게시물 타입 만들기
//		++ 동일한 클래스의 서로 다른 객체를 저장하기 위한 *배열* 선언하기
//		+ 초기화를 하지 않고 int(정수) 타입의 서로 다른 정수값 100개 저장 가능한 배열 선언 	 , 정수 0 이 100
//		int [] arr1 = new int[100];
//		+ 초기화를 하지 않고 Board(게시물) 타입의 서로 다른 객체 100개 저장 가능한 배열 선언 , null 이 100개
		Board[] boardArray = new Board[100];
		
		while(true) {
			System.out.print("1.등록 2.출력 ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			
			if( choose == 1 ) {
				System.out.println(">>등록 선택했습니다.");
				System.out.print("> 제목 : ");	String title = sc.next();
				System.out.print("> 내용 : ");	String content = sc.next();
				System.out.print("> 작성자 : ");	String writer = sc.next();
//				[2] 3개의 정보를 하나의 객체 로 만들기
				Board board = new Board(); 	// - 객체 생성
				board.title = title;		// - 객체 내 멤버변수 접근하여 멤버변수값 수정
				board.content = content;	// (객체)변수명.멤버변수
				board.writer = writer;		// .접근연산자
//				[3] 객체를 배열에 저장 , 빈공간을 찾아서 빈공간에 *1번* 저장하기
//					* 배열내 빈공간 찾기( 여러개[배열] 중에서 원하는 값 찾기 , 비교 , ==같다 )
//				3-1 : for문이 실행한 결과를 저장하는 변수
				boolean saveState = false;
				for( int index = 0 ; index < boardArray.length ; index++ ) {
					if( boardArray[index] == null ) {
						boardArray[index] = board;
						System.out.println("> 등록 성공 했습니다.");
						saveState = true;
						break; // - 가장 가까운 반복문 종료(1개만 저장해야되기 때문) // for 안에서 원하는 목표를 이뤘기 때문에
					} // if end
				} // for end
//				[4] 저장 여부 상태에 따른 출력
				if( saveState == true ) { System.out.println("> 게시물 등록 성공");}
				else { System.out.println("> 게시물 등록 실패");}
			}else if( choose == 2 ) {
				System.out.println(">>출력 선택했습니다.");
				
//				[5] 배열 내 모든 요소( 게시물 객체 )를 출력하기 , 빈 공간이 아니면
				for( int index = 0 ; index < boardArray.length ; index++ ) {
					if( boardArray[index] != null ) {
						Board board = boardArray[index];
						System.out.printf("순번 : %d 제목 : %s 내용 : %s 글쓴이 : %s\n" , 
								index+1 , board.title , board.content , board.writer);
					}else { break; }
				} // for end
			} // if end
		} // w e
		
	}

}
