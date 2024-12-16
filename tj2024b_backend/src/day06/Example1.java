package day06;

import java.util.Scanner;

/*
	자바 과제3 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 연산자 , 제어문(조건문/반복문)
	- 전화번호 , 인원수 를 입력받아서 저장/출력 구현
	- 총 대기명단은 3개 까지 가능하다. 대기명단은 1개당 전화번호/인원수 저장수(변수) 2개 필요 , 대기명단3 --> 변수 6개 필요
*/

public class Example1 {
	
	public static void main(String[] args) {
	String 전화번호1 = null; int 인원수1 = 0;
	String 전화번호2 = null; int 인원수2 = 0;
	String 전화번호3 = null; int 인원수3 = 0;
		
	while(true) {
		System.out.println("\n===== 대기번호 발행 프로그램 =====");
		System.out.print("1. 등록 2. 출력 : ");
		
		Scanner sc = new Scanner(System.in);
		int 선택메뉴 = sc.nextInt();
		
		if( 선택메뉴 == 1 ) {
			System.out.println("> 1. 등록 선택했습니다.");
			System.out.print("> 전화번호 : "); String num = sc.next();
			System.out.print("> 인원수 : "); int count = sc.nextInt();
			if( 전화번호1 == null ) { 전화번호1 = num; 인원수1 = count; }
			else if( 전화번호2 == null ) { 전화번호2 = num; 인원수2 = count; }
			else if( 전화번호3 == null ) { 전화번호3 = num; 인원수3 = count; }
			else { System.out.println("** 등록 실패 : 게시물 작성공간이 부족합니다. **"); }
			System.out.println("** 등록성공 **");
		} // if end
		else if( 선택메뉴 == 2 ) {
			System.out.println("> 2. 출력 선택했습니다.");
			if( 전화번호1 != null ) { System.out.print(">전화번호 : " + 전화번호1 + " >인원수 : " + 인원수1 + "\n" );	}
			if( 전화번호2 != null ) { System.out.print(">전화번호 : " + 전화번호2 + " >인원수 : " + 인원수2 + "\n" );	}
			if( 전화번호3 != null ) { System.out.print(">전화번호 : " + 전화번호3 + " >인원수 : " + 인원수3 + "\n" );	}
		} // if end 
	} // w e
		
		
	}

}
