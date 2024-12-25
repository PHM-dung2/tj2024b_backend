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


public class Example2답 {

	public static void main(String[] args) {
	int 콜라재고 = 10;		int 사이다재고 = 10;	int 환타재고 = 10;
	int 콜라바구니 = 0;		int 사이다바구니 = 0;	int 환타바구니 = 0;
	int 콜라가격 = 1000;	int 사이다가격 = 1500;	int 환타가격 = 2000;
		
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>> 1.콜라 2.사이다 3.환타 4.결제 ");
		int choose = sc.nextInt(); 
	
		if( choose == 1 ) {	System.out.println("콜라 선택 했습니다");
			if( 콜라재고 == 0 ) { System.out.println(">> 콜라 재고가 부족합니다.");}
			else {
				콜라재고--;
				콜라바구니++;	
			}
		}
		else if( choose == 2 ) { System.out.println("사이다 선택 했습니다");
			if( 사이다재고 == 0 ) { System.out.println(">> 사이다 재고가 부족합니다.");}
			else {
				사이다재고--;
				사이다바구니++;	
			}
		}
		else if( choose == 3 ) { System.out.println("환타 선택 했습니다");
			if( 환타재고 == 0 ) { System.out.println(">> 환타 재고가 부족합니다.");}
			else {
				환타재고--;
				환타바구니++;	
			}
		}
		else if( choose == 4 ) {
			int 총금액 = (콜라바구니*콜라가격) + (사이다바구니*사이다가격) + (환타바구니*환타가격);
			System.out.printf("콜라 %2d개 사이다 %2d개 환타 %2d개 총금액 : %d원\n" , 콜라바구니 , 사이다바구니 , 환타바구니 , 총금액 );
			콜라바구니 = 0; 사이다바구니 = 0; 환타바구니 = 0;
		}
	
	} // w e
		
		
	}

}
