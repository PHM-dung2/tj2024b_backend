package day03;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
//		p.92 조건문
		
//		[1] if문
		int age = 10;
//			- 만약에 age(나이)값이 8 이상이면 출력함수 실행한다.
		if( age >= 8 ) { // if s
			System.out.println("학교에 다닙니다.");
		} // if e
		
//		[2] if ~ else문
//			- 만약에 age(나이)값이 8 이상이면 출력함수 실행한다.
		if( age >= 8 ) { // if s
			System.out.println("학교에 다닙니다.");
		}else { // 아니면( 위 조건의 반대
			System.out.println("학교에 다니지 않습니다.");
		} // if e
		
//		[3] if ~ elseif문
		int charge;
		if( age < 8 ) { // 만약에 age(나이)값이 8미만이면
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if( age < 14 ) { // 아니고 age(나이)값이 8초과 14미만 이면
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if( age < 20 ) { // 아니고 age(나이)값이 14초과 20미만 이면
			charge = 2500;
			System.out.println("중,고등학생입니다.");
//		[1분복습] , age >= 60조건 추가
		}else if( age >= 60 ) { // 아니고 age(나이)값이 60 이상이면
			charge = 0;
			System.out.println("경로우대입니다.");
		}else {	// 그외 나머지 모두
			charge = 3000;
			System.out.println("일반인입니다.");
		} // if end
		System.out.println("입장료는 " + charge + "원 입니다.");
		
//		if ~ elseif ( 다수조건에 따른 하나의 결과실행문 ) vs if if ( 다수조건에 따른 N개 결과실행문 )
		
//		[나혼자코딩]
		Scanner sc = new Scanner(System.in);
		System.out.print("[나혼자코딩] 점수 : ");
		int score = sc.nextInt();
		char grade;
		if( score >= 90 ) {
			grade = 'A';
		}else if( score >= 80 ) {
			grade = 'B';
		}else if( score >= 70 ) {
			grade = 'C';
		}else if( score >= 60 )	{
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("[나혼자코딩] 학점 : " + grade);
		
		
	}

}
