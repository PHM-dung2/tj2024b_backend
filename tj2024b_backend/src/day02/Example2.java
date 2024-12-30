package day02; // 폴더명

public class Example2 { // 클래스 시작

	public static void main(String[] args) { // main 시작

//		1. 자동 (자료/타입)형 변환 , 묵시적 (자료/타입)형 변환
//			- 1. 메모리 크기가 작은 것 부터 큰 순으로 변환
//			- 2. 데이터의 손실이 없다.
//			byte -> short , char -> int -> long -> float -> double
		byte byteValue = 10;			// byte타입 'byteValue' 변수에 10 대입
		short shortValue = byteValue;	// short타입 'byteValue' 변수에 byte 10 대입
		int intValue = shortValue;		// int타입 'intValue' 변수에 short 10 대입
		long longValue = intValue;		// long타입 'longValue' 변수에 int 10 대입
		float floatValue = longValue;	// float타입 'floatValue' 변수에 long 10 대입
		double doubleValue = floatValue;	// double타입 'doubleValue' 변수에 float 10 대입
		System.out.println( "doubleValue : " + doubleValue); // byte에서 double 까지 자동형변환
//			연산중에 묵시적 형변환 , 연산시 피연산자중에 더 큰 타입으로 결과를 반환한다.
//				byte + byte -> int , ing 이하 byte와 short 연산 결과는 무조건 int로 반환된다.
//				byte + short -> int
//				int + int -> int
//				int + long -> long
//				int + float -> float
//				float + double -> double
//		byte b1 = 10 ; byte b2 = 20; short s1 = 30; int i1 = 40;
//		float f1 = 3.14f; double d1 = 41.25;
//		int result1 = b1 + b2;
//		int result2 = b1 + s1;
//		float result3 = i1 + f1;
//		double result4 = f1 + d1;
		
//		2. 강제 (자료/타입)형 변환 , 명시적 (자료/타입)형 변환 , 캐스팅
//			- 1. 메모리가 크기가 큰 값 부터 작은 순으로 변환
//			- 2. 데이터의 (허용범위외) 손실이 있을 수도 있다.
//			- 3. (변환할타입명)변수명
//			- 4. double -> float -> long -> int -> short -> short , char -> byte
		double value1 = 3.14;
		float value2 = (float)value1;
		long value3 = (long)value2;
		int value4 = (int)value3;
		short value5 = (short)value4;
		byte value6 = (byte)value5;
		System.out.println("byte value : " + value6); // 3.14 --> 3
		
//		+++ 자바특징중에 다형성(다양한 형식/타입을 가지는 성질)은 형변환으로 부터 표현할 수 있다.
		
//		[1뷴 복습]
		char ch1 = 'A';
		int int1 = ch1;
		System.out.println(int1); // 65 : A , 66 : B , 67 : C <-- 아스키코드표 에서 확인
		System.out.println( (int)ch1 );
		
		int ch2 = 67;
		System.out.println( (char)ch2 ); // 'C'
		
//		+ 연삱중에 강제 타입변환
		int result5 = (int)3.14 + 3;
		System.out.println(result5);
		
//		[연습문제]
		int A = 10; double B = 2.0;
		int 결과1 = A + (int)B;
		System.out.println( "결과1 : " + 결과1 );
		
		char C = '글';
		int 결과2 = C;
		System.out.println("글 정수 : " + 결과2 );				// 44544
		System.out.println("글 정수 : " + (char)(결과2+1));		// 긁
//			+ JAVA 정수로 표현하면 , 74 65 86 65
		System.out.println( (char)74 +""+ (char)65 +""+ (char)86 +""+ (char)65 );	// JAVA
		System.out.println( (char)74 + (char)65 + (char)86 + (char)65 );	// 290 , int 이하는 int값으로 더해짐
		
		char 문자2 = 'A';		// char 2바이트 , 6만개 문자 표현
		char 문자3 = 'b';		// short 2바이트 , + 32만 정도 표현
		System.out.println( 문자2 + 문자3 );	// 131 , 컴퓨터는 문자를 표현하기 위해서 정수를 사용한다.
		
	} // main 끝

} // 클래스 끝
