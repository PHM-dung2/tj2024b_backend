package day07;

import java.util.Scanner;

/*
	자바 과제5 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 연산자 , 제어문(조건문/반복문)
	- 전화번호 , 인원수 를 입력받아서 저장/출력 구현
	- 총 대기명단은 3개 까지 가능하다. 대기명단은 1개당 전화번호/인원수 저장수(변수) 2개 필요 , 대기명단3 --> 변수 6개 필요
*/
public class Example1 {

	public static void main(String[] args) {
	Waiting waiting1 = new Waiting();
	Waiting waiting2 = new Waiting();
	Waiting waiting3 = new Waiting();
		
	while(true) {
		System.out.print("1.대기 등록 2.대기 현황 : ");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		if( choose == 1 ) {
			System.out.println(">>> 대기명단 등록 >>>");
			System.out.print("> 전화번호 : "); String phone = sc.next();
			System.out.print("> 인원수 : "); int count = sc.nextInt();
			
			if( waiting1.phone == null ) { waiting1.phone = phone; waiting1.count = count; }
			else if( waiting2.phone == null ) { waiting2.phone = phone; waiting2.count = count; }
			else if( waiting3.phone == null ) { waiting3.phone = phone; waiting3.count = count; }
			else { System.out.println("**대기인원이 가득찼습니다.**");}
		} // if end
		else if( choose == 2 ) {
			if( waiting1.phone != null ) {System.out.printf("인원수 %d명 전화번호 : %s\n" , waiting1.count , waiting1.phone);}
			if( waiting2.phone != null ) {System.out.printf("인원수 %d명 전화번호 : %s\n" , waiting2.count , waiting2.phone);}
			if( waiting3.phone != null ) {System.out.printf("인원수 %d명 전화번호 : %s\n" , waiting3.count , waiting3.phone);}
		}
	} // w e
		
	}

}
