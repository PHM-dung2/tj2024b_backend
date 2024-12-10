package day02;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		// JS day10 연산자 문제 10개를 자바로 풀이하기
		
		// [지문1] 국어 , 영어 , 수학 점수를 각 입력받아서 각 변수에 저장하고 총점 과 평균을 계산하여 console탭에 출력하시오.
		
		int 국어 , 영어 , 수학 , 총점 , 평균;
		Scanner sc = new Scanner(System.in);
//		System.out.print("[지문1] 국어 : ");
//		국어 = sc.nextInt();
//		System.out.print("[지문1] 영어 : ");
//		영어 = sc.nextInt();
//		System.out.print("[지문1] 수학 : ");
//		수학 = sc.nextInt();
//		총점 = 국어 + 영어 + 수학;
//		평균 = 총점 / 3;
//		System.out.println("[지문1] 총점 : " + 총점);
//		System.out.println("[지문1] 평균 : " + 평균);
		
	      
	    // [지문2] 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오.
		
//		System.out.print("[지문2] 반지름 : ");
//		int 반지름 = sc.nextInt();
//		final double 원주율 = 3.14;
//		System.out.println("[지문2] 원넓이 : " + (반지름 * 반지름 * 원주율));
	    
	    // [지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
		
//		System.out.print("[지문3] 실수1 : ");
//		double 실수1 = sc.nextDouble();
//		System.out.print("[지문3] 실수2 : ");
//		double 실수2 = sc.nextDouble();
//		double 비율 = (실수1 / 실수2) * 100;
//		System.out.println("[지문3] 비율 : " + 비율 + "%");
	      
	    // [지문4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
		
//		System.out.print("[지문4] 정수1 : ");
//		int 정수1 = sc.nextInt();
//		boolean 홀수 = 정수1 % 2 == 1 ? true : false;
//		System.out.println("[지문4] 홀수 : " + 홀수);
		
	    // [지문5] 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오.
		
//		System.out.print("[지문5] 정수2 : ");
//		int 정수2 = sc.nextInt();
//		boolean 배수7 = (정수2 % 7 == 0) ? true : false;
//		System.out.println("[지문5] 7의 배수 : " + 배수7 );
	
	    // [지문6] 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.
		
//		System.out.print("[지문4] 정수3 : ");		
//		int 정수3 = sc.nextInt();
//		boolean 홀수_배수7 = (정수3 % 2 == 0) ? false : (정수3 % 7 == 0 ) ? true : false; 
//		System.out.println("[지문6] 홀수이면서 7의 배수 : " + 홀수_배수7 );
	      
	    // [지문7] 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
	        // -> 입력 예] 356789 입력시 , 출력 예] 십만원:3장 만원:5장 천원6장 
		
//		System.out.print("[지문7] 정수4 : ");
//		int 정수4 = sc.nextInt();
//		int 십만원 = 정수4 / 100000;
//		int 만원 = (정수4 / 10000) - (십만원 * 10);
//		int 천원 = (정수4 / 1000) - (십만원 * 100) - (만원 * 10) ;
//		
//		System.out.println("[지문7] 십만원 : " + 십만원 + "장" );
//		System.out.println("[지문7] 만원 : " + 만원 + "장");
//		System.out.println("[지문7] 천원 : " + 천원 + "장");
		
	    
	    // [지문8] 1차점수 와 2차점수 각각 입력받아서 
	       // -> 총점이 150점이상이면 '합격' 아니면 '불합격' 으로 console탭에 출력하시오.
		
		System.out.print("[지문8] 점수1 : ");
		int 점수1 = sc.nextInt();
		System.out.print("[지문8] 점수2 : ");
		int 점수2 = sc.nextInt();
		int 총점2 = 점수1 + 점수2;
		String 합격여부 = (총점2 >= 150) ? "합격" : "불합격" ;
		System.out.println("[지문8] 합격여부 : " + 합격여부 );
		
	}

}
