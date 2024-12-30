package day06;

import java.util.Scanner;

public class Example1답 {

	public static void main(String[] args) {
	String phone1 = null; int count1 = 0;
	String phone2 = null; int count2 = 0;
	String phone3 = null; int count3 = 0;
		
	while(true) {
		System.out.print("1.대기 등록 2.대기 현황 : ");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		if( choose == 1 ) {
			System.out.println(">>> 대기명단 등록 >>>");
			System.out.print("> 전화번호 : "); String phone = sc.next();
			System.out.print("> 인원수 : "); int count = sc.nextInt();
			
			if( phone1 == null ) { phone1 = phone; count1 = count;}
			else if( phone2 == null ) { phone2 = phone; count2 = count;}
			else if( phone3 == null ) { phone3 = phone; count3 = count;}
			else { System.out.println("**대기인원이 가득찼습니다**");}
			System.out.println("**대기 등록 완료**");
		} // if end
		else if( choose == 2 ) {
			if( phone1 != null ) { System.out.printf("인원수 %d명 , 연락처 : %s \n" , count1 , phone1); }
			if( phone2 != null ) { System.out.printf("인원수 %d명 , 연락처 : %s \n" , count2 , phone2); }
			if( phone3 != null ) { System.out.printf("인원수 %d명 , 연락처 : %s \n" , count3 , phone3); }
		}
		
		sc.close();
	} // w e
	
	}

}
