package day09;

import java.util.Scanner;

/*
	자바 과제8 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체 , 배열 , 메소드
	- 전화번호 , 인원수 를 입력받아서 저장/출력 구현
	- 명단 클래스 설게
	- 총 대기명단은 100개 까지 가능하다. 대기명단은 1개당 전화번호/인원수 저장수(변수) 2개 필요 , 대기명단3 --> 변수 6개 필요
*/
public class Example1 {

	public static void main(String[] args) {
		WaitingService ws = new WaitingService();
		Waiting[] waits = new Waiting[100];
		
		while(true) {
			System.out.print("1.대기 등록 2.대기 현황 : ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			if(choose == 1) {
				ws.waitAdd( sc , waits );
			}else if(choose == 2) {
				ws.waitPrint( waits );
			}
			
			
		} // w e
		
	}

}
