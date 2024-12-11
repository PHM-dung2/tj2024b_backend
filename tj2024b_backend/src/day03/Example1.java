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
		
//		[4] 증감연산자 , ++ --
		int num2 = 10;
		int value2;
		value2 = ++num2;	// num2 값이 1증가 한 후에 value2 변수에 대입한다.
			System.out.println( value2 ); // num2=11 , value2=11
		value2 = num2++;	// value2변수에 기존 num2 값이 먼저 대입한 후에 num값이 1증가 한다.
			System.out.println( value2 ); // value2=11 , num2=12
		value2 = --num2;	// num2 값이 1감소 한 후에 value2 변수에 대입한다.
			System.out.println( value2 ); // value2=11 , num2=11
		value2 = num2--;	// value2변수에 기존 num2 값이 먼저 대입한 후에 num값이 1감소 한다.
			System.out.println( value2 ); // value2=11 , num2=10
			
		int gameScore = 150;
		int lastScore = ++gameScore; // 변수앞에 ++가 있으므로 대입(=)보다 1증가가 우선이다.
		System.out.println( lastScore ); // 151 // [1분복습] gameScore++ 150
		
		int lastScore2 = --gameScore; // 변수앞에 --가 있으므로 대입(=)보다 1감소가 우선이다.
		System.out.println( lastScore2 ); // 150 // [1분복습] gameScore-- 151
		
//			* 사칙연산의 우선순위에 따라 *곱하기 후 +더하기 => 9
		int result1 = 3 + 3 * 2; System.out.println( result1 );
//				- 연산순서
//				1. 3 * 2 = 6			곱셈
//				2. 3 + 6 = 9			더하기
//				3. int result1 = 9		대입
//			*
		int x = 10;
		int y = x-- + 5 + --x;
//			- 연산순서
//			1. x-- + 5	 ---> 10 + 5 => 15 [ x는 +연산후 1차감] x = 9
//			2. 15 + --x  ---> 15 + 8 => 23 [ x는 +연산전 1차감] x = 8
		
		System.out.println( x ); // 8
		System.out.println( y ); // 23
		
//		[5] 비교연산자 , >초과 <미만 >=이상 <=이하 ==같다 !=다르다 , 결과는 treu 또는 false
		int myAge = 27;
		boolean value = (myAge > 25);
		System.out.println( value ); // true // ( ) 소괄호를 사용한 이유는 가독성(읽기좋게) 높이기 위해서 사용.
		
//		[6] 논리연산자 , &&논리곱 ||논리합 !부정
		int num1 = 10;
		int i = 2;
		
		boolean value3 = ( (num1 = num1 + 10) < 10 ) && ( ( i = i + 2 ) < 10 );
//							---- [단락회로평가] 여기에서 false이므로 ,     ---- 뒤에 조건은 볼 필요없으므로 코드 실행되지 않는다.
		System.out.println( value3 );	// false
		System.out.println( num1 );		// 20
		System.out.println( i );		// 4 --> 2
		
		value3 = ((num1 = num + 10) > 10) || ((i = i + 2) < 10);
//					---- [단락회로평가] 여기에서 true 이므로 ,  ---- 뒤에 조건은 볼 필요없으므로 코드 실행되지 않는다.
		System.out.println( value3 );	// true
		System.out.println( num1 );		// 30
		System.out.println( i );		// 2
		
//		[7] 복합 대입 연산자 , += 
		
//		[1분복습]
//		num1 = num1 + 5;	num1 += 5;
//		num1 = num1 + num2  num1 += num2;
				
//		[8] 조건 연산자 , 조건식 ? 참결과 : 거짓결과
		int num3 = 5 > 3 ? 10 : 20 ; // 만일 5가 3보다 크면 10대입 아니면 20 대입 한다.
		
		int fatherAge = 45;
		int motherAge = 47;
				
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println( ch ); // F
	}

}
