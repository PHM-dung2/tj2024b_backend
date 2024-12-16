package day06;

import java.util.Scanner;

/*
	자바 과제4 : 키오스크 프로그램
	- 문법 : 변수 , 연산자 , 제어문(조건문/반복문)
	- 제품은 콜라, 사이다, 환타 인 3개가 존재합니다.
	- 각 제품의 재고는 초기에 10개씩 존재한다.
	- 각 제품의 가격은 콜라 1000원 사이다 1500원 환타 2000원 가정 한다.
	- 제품을 선택시 재고 1 차감하고 장바구니에 담는다.
	- 메뉴] 1. 콜라 2. 사이다 3. 환타 4. 결제
		1. 선택시 : 콜라 선택시 콜라 재고 1 차감하고 장바구니에 담는다.
		2. 선택시 : 사이다 선택시 사이다 재고 1 차감하고 장바구니에 담는다.
		3. 선택시 : 환타 선택시 환타 재고 1 차감하고 장바구니에 담는다.
		4. 선택시 : 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력한다.
			ex) 콜라 1개 , 사이다 2개 , 환타 0개 총금액 : 4000원
		* 추가 유효성검사 : 만일 재고가 부족하면 "재고가 부족합니다" 라고 출력하시오.
		
	
*/


public class Example2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count1 = 10;
	int count2 = 10;
	int count3 = 10;
		
	while(true) {
	System.out.println("===== 메뉴 =====");
	System.out.print("1.콜라 2.사이다 3.환타 4.결제 ");
	int choose = sc.nextInt(); 
	
	
		if( choose == 1 ) {	count1--; }
		else if( count1 < 0 ) { System.out.println("재고가 부족합니다"); }
		
		if( choose == 2 ) {	count2--; }
		else if( count2 < 0 ) { System.out.println("재고가 부족합니다"); }
		
		if( choose == 3 ) {	count3--; }
		else if( count3 < 0 ) { System.out.println("재고가 부족합니다"); }
		
		if( choose == 4 ) {
			int price = (1000 * (10-count1)) + (1500 * (10-count2)) + (2000 * (10-count3));
			System.out.printf("콜라 %d개 사이다 %d개 환타 %d개 총금액 : %d원\n" , 10-count1 , 10-count2 , 10-count3 , price );
		}
	
		
	} // w e
		
		
	}

}
