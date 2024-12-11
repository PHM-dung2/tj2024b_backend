package 문제;

import java.util.Scanner;

public class 추가문제 {

	public static void main(String[] args) {

//		[ 제어문/반복문 없이 풀이 ]
//			    문제1 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
		
				Scanner sc = new Scanner(System.in);
//				System.out.print("[문제1] 정수1 : ");
//				int 정수1 = sc.nextInt();
//				char result1 = 정수1 % 7 == 0 ? 'O' : 'X';
//				System.out.println("[문제1] 결과1 : " + result1);

//			    문제2 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 홀수 이면 'O' 아니면 'X' 출력 하시오.
				
//				System.out.print("[문제2] 정수2 : ");
//				int 정수2 = sc.nextInt();
//				char result2 = 정수2 % 2 == 1 ? 'O' : 'X';
//				System.out.println("[문제2] 결과2 : " + result2);

//			    문제3 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
				
//				System.out.print("[문제3] 정수3 : ");
//				int 정수3 = sc.nextInt();
//				char result3 = 정수3 % 7 == 0 && 정수3 % 2 == 0 ? 'O' : 'X';
//				System.out.println("[문제3] 결과3 : " + result3);

//			    문제4 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
				
//				System.out.print("[문제4] 정수4 : ");
//				int 정수4 = sc.nextInt();
//				char result4 = 정수4 % 11 == 0 || 정수4 % 2 == 0 ? 'O' : 'X';
//				System.out.println("[문제4] 결과4 : " + result4);

//			    문제5 : 두개의 정수형으로 정수를 입력받아 입력받은 값이 더 큰수 출력 하시오.
				
//				System.out.print("[문제5] 정수5 : ");
//				int 정수5 = sc.nextInt();
//				System.out.print("[문제5] 정수6 : ");
//				int 정수6 = sc.nextInt();
//				int result5 = 정수5 > 정수6 ? 정수5 : 정수6 ;
//				System.out.println("[문제5] 결과5 : " + result5);

//			    문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
//			        계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
				
//				System.out.print("[문제6] 반지름 : ");
//				int 반지름 = sc.nextInt();
//				final double 원주율 = 3.14;
//				double 원넓이 = 반지름 * 반지름 * 원주율;
//				System.out.printf("[문제6] 원넓이 : %.2f" , 원넓이);	// pirinf => 형식문자 출력

//			    문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
//			        예) 54.5   84.3 실수 2개입력시 결과는   64.2%
				
//				System.out.print("[문제7] 실수1 : ");
//				double 실수1 = sc.nextDouble();
//				System.out.print("[문제7] 실수2 : ");
//				double 실수2 = sc.nextDouble();
//				double result6 = (실수1 / 실수2) * 100;
//				System.out.printf("[문제7] 결과6 : %.1f%%", result6);
				
//			    문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
//			        계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
				
//				System.out.print("[문제8] 윗변 : ");
//				double 윗변 = sc.nextDouble();
//				System.out.print("[문제8] 밑변 : ");
//				double 밑변 = sc.nextDouble();
//				System.out.print("[문제8] 높이 : ");
//				double 높이 = sc.nextDouble();
//				double 사다리꼴넓이 = (윗변 + 밑변) * 높이 / 2;
//				System.out.printf("[문제8] 사다리꼴 넓이 : %.1f" , 사다리꼴넓이);
				
//			    문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
//			        계산식) 표준체중 계산식 = > (키 - 100) * 0.9
				
//				System.out.print("[문제9] 키1 : ");
//				int 키1 = sc.nextInt();
//				double 표준체중 = (키1 - 100) * 0.9;
//				System.out.println("[문제9] 표준체중 : " + (int)표준체중);
				
//			    문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
//			        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
				
//				System.out.print("[문제10] 키2 : ");
//				double 키2 = sc.nextDouble();
//				System.out.print("[문제10] 몸무게 : ");
//				double 몸무게 = sc.nextDouble();
//				double bmi = 몸무게 / ((키2 / 100) * (키2 / 100));
//				System.out.printf("[문제10] BMI : %.2f" , bmi);
				
//			    문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
//			        계산식) 1 inch -> 2.54cm
				
//				System.out.print("[문제11] inch : ");
//				int inch = sc.nextInt();
//				double cm = inch * 2.54;
//				System.out.printf("[문제11] " + inch + " inch : %.2fcm" , cm);
				
//			    문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 총점수 출력하시오
//			        계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
				
//				System.out.print("[문제12] 중간고사 : ");
//				double 중간고사 = sc.nextDouble() * 0.3;
//				System.out.print("[문제12] 기말고사 : ");
//				double 기말고사 = sc.nextDouble() * 0.3;
//				System.out.print("[문제12] 수행평가 : ");
//				double 수행평가 = sc.nextDouble() * 0.4;
//				double 총점수 = 중간고사 + 기말고사 + 수행평가;
//				System.out.printf("[문제12] 총점수 : %.2f" , 총점수 );
				
//			    문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
//			        int x = 10;
//			        int y = x-- + 5 + --x;
//			        printf(" x의 값 : %d , y의값 :  %d ", x, y)
				
//				x = 8 , y = 23
				
//			    문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
				
//				System.out.print("[문제14] 나이 : ");
//				int age = sc.nextInt();
//				String result7 = age >= 40 ? "중년" : age >= 20 ? "성인" : age >= 10 ? "학생" : "" ;
//				System.out.println("[문제14 결과 : " + result7);
				
//			    문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
				
//				System.out.print("[문제15] 국어 점수 : ");
//				int 국어 = sc.nextInt();
//				System.out.print("[문제15] 영어 점수 : ");
//				int 영어 = sc.nextInt();
//				System.out.print("[문제15] 수학 점수 : ");
//				int 수학 = sc.nextInt();
//				double 총점 = 국어 + 영어 + 수학;
//				double 평균 = 총점 / 3;
//				System.out.printf("[문제15] 총점 : %.0f , 평균 : %.2f " , 총점 , 평균);
				
//			    문제16 : 3개의 정수형으로 입력받아 가장 큰수 출력하시오. [ 같은 입력 값을 배제 ]
				
//				System.out.print("[문제16] 정수1 : ");
//				int 정수1 = sc.nextInt();
//				System.out.print("[문제16] 정수2 : ");
//				int 정수2 = sc.nextInt();
//				System.out.print("[문제16] 정수3 : ");
//				int 정수3 = sc.nextInt();
//				int 큰수 = 정수1 > 정수2 && 정수1 > 정수3 ? 정수1 : 정수2 > 정수1 && 정수2 > 정수3 ? 정수2 : 정수3;
//				System.out.println(큰수);
				
//			    문제17 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력 하시오
		
//				System.out.print("[문제17] 아이디 : ");
//				String id = sc.nextLine();
//				System.out.print("[문제17] 비밀번호 : ");
//				String pw = sc.nextLine();
//				String result8 = (id.equals("admin") && pw.equals("1234") ) ? "로그인성공" : "로그인실패";
//				System.out.println( result8 );
				
	}

}