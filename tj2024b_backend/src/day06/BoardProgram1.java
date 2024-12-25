package day06;

import java.util.Scanner;

/*
 
 	실습1 : 게시판 프로그램
 	 	- 문법 : 변수 , 연산자 , 제어문(조건문/반복문)
 		- 제목 , 내용 , 작성자 를 입력받아서 저장/출력/삭제/수정 구현
		- 게시물 3개 저장 하기, 게시물1개당 제목/내용/작성자 저장소(변수) 3개 필요 , 게시물3 --> 변수 9개 필요.
 	
 */

public class BoardProgram1 { // class start // 자바 모든 코드는 class안에 존재한다.

	public static void main(String[] args) { // main start // 자바의 모든 실행 코드는 main 안에서 시작된다.

//		[6-1] 변수선언 , 기본타입[ boolean byte int long float double ], 참조타입[ String Scanner 등등 ]
		String 제목1 = null;	String 내용1 = null;	String 작성자1 = null;	// null 이란? 찹조값이 없다는 뜻 , 문자열이 없다는 뜻
		String 제목2 = null;	String 내용2 = null;	String 작성자2 = null;	
		String 제목3 = null;	String 내용3 = null;	String 작성자3 = null;	
		
		while(true) { // [1] 반복문 , 무한루프 // w s
//			[2] 출력함수 , syso + 자동완성
			System.out.println("\n\n===== 게시판 프로그램 =====");
			System.out.print("1.등록C 2.출력R : ");			
//			[3] 입력함수 , 
//				1. 입력객체 : Scanner 변수명 = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
//				2. 입력객체 이용한 입력함수 : 변수명.nextXXX();
			int 선택메뉴 = sc.nextInt(); // 우리가 정의한 메뉴번호 선택받기 // - 일력받은 값저장			
//			[4] 연산자 , == 같다						
//			[5] 조건문 , if( 조건문 ){ }
			if(선택메뉴 == 1) { System.out.println(">> 1. 등록 선택했습니다."); 
				System.out.print("> 제목 : ");	String title = sc.next();	// 메세지(print) -> 입력(next) -> 저장(변수)
				System.out.print("> 내용 : ");	String content = sc.next();
				System.out.print("> 작성자 : ");  String writer = sc.next();
				// [7] 변수값에 따른 데이터 검사후 대입 // 첫번째 게시물이 비어 있으면 //	[6-2] 변수값 수정
				if( 제목1 == null ) { 제목1 = title; 내용1 = content; 작성자1 = writer; }
				else if( 제목2 == null ) { 제목2 = title; 내용2 = content; 작성자2 = writer; }
				else if( 제목3 == null ) { 제목3 = title; 내용3 = content; 작성자3 = writer; }
				else { System.out.println("** 등록 실패 : 게시물 작성공간이 부족합니다. **"); } // 그외,
				System.out.println("** 등록 성공 **");
			} // if end
			else if(선택메뉴 == 2) { 
				System.out.println(">> 2. 출력 선택했습니다."); 
//				[7-2] 변수값에 따른 데이터 검사 후 출력 // [6-3] 변수값 호출
				if( 제목1 != null ) { System.out.print(">제목 : " + 제목1 + " >내용 : " + 내용1 + " >작성자 : " + 작성자1 + "\n" ); }	// 오류가 발생하는 이유 : 변수의 초기값(처음에 변수 만들때 값을 넣는 행위-초기화) 없다.
				if( 제목2 != null ) { System.out.print(">제목 : " + 제목2 + " >내용 : " + 내용2 + " >작성자 : " + 작성자2 + "\n" ); }
				if( 제목3 != null ) { System.out.print(">제목 : " + 제목3+ " >내용 : " + 내용3 + " >작성자 : " + 작성자3 + "\n" ); }
				
//				- 오류가 발생하는 이유 : 변수의 초기값(처음에 변수 만들때 값을 넣는 행위-초기화) 없다.
//				- 지역변수가 초기값이 없으면 호출이 불가능하다.(쓰레기값-변수를 유지하기 위한 컴퓨터가 만든 임의값)	, 0 , null , " " , ' ' 모두 다르다
			} // if end
		} // w e
		
	}

}
