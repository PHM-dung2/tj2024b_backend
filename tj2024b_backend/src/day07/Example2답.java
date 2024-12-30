package day07;

import java.util.Scanner;

/*
자바 과제6 : 키오스크 프로그램
- 문법 : 변수 , 연산자 , 제어문(조건문/반복문) , 객체
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

public class Example2답 {

	public static void main(String[] args) {
	Shopping shop1 = new Shopping(); shop1.name = "콜라"; shop1.inventory = 10; shop1.price = 1000;
	Shopping shop2 = new Shopping(); shop2.name = "사이다"; shop2.inventory = 10; shop2.price = 1500;
	Shopping shop3 = new Shopping(); shop3.name = "환타"; shop3.inventory = 10; shop3.price = 2000;
//		+ 멤버변수는 객체 생성시 초기화를 생략하면 자동으로 기본값이 대입된다.
//		+ 정수 : 0 , 실수 : 0.0 , 논리 : false , 클래스타입 : null
//		Shopping 객체 생성시 cart 멤버변수에는 자동으로 0 대입된다.
	while(true) {
	Scanner sc = new Scanner(System.in);
	System.out.print(">>> 1.콜라 2.사이다 3.환타 4.결제 ");
	int choose = sc.nextInt();
	
		if( choose == 1 ) { System.out.println("콜라 선택 했습니다.");
			if( shop1.inventory == 0 ) {System.out.println(">> 콜라 재고가 부족합니다.");}
			else { shop1.inventory--; shop1.cart++;}
		}else if( choose == 2 ) { System.out.println("사이다 선택 했습니다.");
			if( shop2.inventory == 0 ) {System.out.println(">> 사이다 재고가 부족합니다.");}
			else { shop2.inventory--; shop2.cart++;}
		}else if( choose == 3 ) { System.out.println("환타 선택 했습니다.");
			if( shop3.inventory == 0 ) {System.out.println(">> 환타 재고가 부족합니다.");}
			else { shop3.inventory--; shop3.cart++;}
		}else if( choose == 4 ) {
			int fullPrice = (shop1.cart*shop1.price) + (shop2.cart*shop2.price) + (shop3.cart*shop3.price);
			System.out.printf("콜라 %2d개 사이다 %2d개 환타 %2d개 총금액 : %d원\n" , shop1.cart , shop2.cart , shop3.cart , fullPrice );
			shop1.cart = 0; shop2.cart = 0; shop3.cart = 0;
		} // if end
		
		sc.close();
	} // w e
	
	}

}