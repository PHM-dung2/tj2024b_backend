package day03;

public class Example1 {

	public static void main(String[] args) {
			
//		연산자
		
//		[1] 대입연산자 , 왼쪽 변수 = 오른쪽변수(또는 식)
		int age = 24; // 나이를 의미하는 age변수에 값 24를 대입함.
		
		int mathScore = 10;
		int engScore = 20;
		// 수학점수와 영어점수 값을 더해서 총점을 의미하는 변수에 대입한다.
		int totalScore = mathScore + engScore; 
		
//		[2] 부호연산자 , +양수 , -음수
		int num = 10;
		System.out.println( +num ); // +10 ---> 10
		System.out.println( -num ); // -10 ---> -10 // 부호를 붙여서 출력
		System.out.println( num ); // 10 ---> =10
		
		num = -num;
//		변수 선언 : 타입 변수명 = 값; // 변수 호출 : 변수명 // 변수값 수정 : 변수명 = 새로운값
		System.out.println( num ); // -10 ---> 10
		
		
//		[3] 산술연산자 , +덧셈 -뺄셈 *곱셈 /나누기 %나머지
		System.out.println( 5 / 3 ); // 1.xxxxxxx -> 1(몫)					* int / int
		System.out.println( 5.0 / 3.0 ); // 1.6666666666666667 -> 나누기 결과	* double / double -> double
		System.out.println( (int)(5.0 / 3.0) ); // 1.6666666666666667 -> 강제타입 -> 정수
		
		int math = 90; int eng = 70;
		int total = math + eng; // 총점 구하기
		System.out.println( total ); // 총점변수의 값 출력한다.
		
		double avg = total / 2.0; // 평균 구하기
		System.out.println( avg ); // 평균변수의 값 출력한다.
		
//		[1분복습]
		int korScore = 100;
		int totalScore2 = korScore + total;
		System.out.println( totalScore2 );
		double avgScore = totalScore2 / 3.0;
		System.out.println( avgScore );
		
	}

}
