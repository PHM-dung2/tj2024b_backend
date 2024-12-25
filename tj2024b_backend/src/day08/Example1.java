package day08;

import java.util.Scanner;

/*
	자바 과제7 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체 , 배열
	- 전화번호 , 인원수 를 입력받아서 저장/출력 구현
	- 명단 클래스 설게
	- 총 대기명단은 100개 까지 가능하다. 대기명단은 1개당 전화번호/인원수 저장수(변수) 2개 필요 , 대기명단3 --> 변수 6개 필요
*/
public class Example1 {

	public static void main(String[] args) {

	Waiting[] waitArray = new Waiting[100];
		
	while(true) {
		System.out.print("1.대기 등록 2.대기 현황 : ");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		if( choose == 1 ) {
			System.out.println();
			System.out.println(">>> 대기명단 등록 >>>");
			System.out.print("> 전화번호 : "); String phone = sc.next();
			System.out.print("> 인원수 : "); int count = sc.nextInt();
			Waiting wait = new Waiting();
			wait.phone = phone;
			wait.count = count;
			
			boolean saveState = false;
			for( int i = 0 ; i < waitArray.length ; i++ ) {
				if( waitArray[i] == null ) {
					waitArray[i] = wait;
					saveState = true;
					break;
				} // if end
			} // for end
			
			if( saveState == true ) { System.out.println(">> 대기명단에 등록되었습니다.");}
			else { System.out.println(">> 대기명단에 등록 실패.");}
			
		}else if( choose == 2 ) {
			for( int i = 0 ; i < waitArray.length ; i++ ) {
				if( waitArray[i] != null ) {
					Waiting wait = waitArray[i];
					System.out.printf("순번 : %d 인원수 %d명 전화번호 : %s\n" , i+1 , wait.count , wait.phone);
				}else { break; }   
			} // for end
		} // if end
	} // w e
		
	}

}
