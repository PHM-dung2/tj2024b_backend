package day03;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
//		[ 구현 문제 , FOR문 없이 풀이 ] 
				Scanner sc = new Scanner(System.in);
//				문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
//				System.out.print("[문제1] 정수 : ");
//				int 정수1 = sc.nextInt();
//				if( 정수1 >= 90) {
//					System.out.println("[문제1] 결과 : 합격");					
//				}else {
//					System.out.println("[문제1] 결과 : 불합격");					
//				}
		
//				문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
//				System.out.print("[문제2] 점수 : ");
//				int score = sc.nextInt();
//				if( score >= 90 ) {
//					System.out.println("[문제2] 결과 : A등급");
//				}else if( score >= 80 ) {
//					System.out.println("[문제2] 결과 : B등급");
//				}else if( score >= 70 ) {
//					System.out.println("[문제2] 결과 : C등급");
//				}else {
//					System.out.println("[문제2] 결과 : 재시험");
//				}
				
//				문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
//				System.out.print("[문제3] 정수2 : ");
//				int 정수2 = sc.nextInt();
//				System.out.print("[문제3] 정수3 : ");
//				int 정수3 = sc.nextInt();
//				System.out.print("[문제3] 정수4 : ");
//				int 정수4 = sc.nextInt();
//				if(정수2 > 정수3 && 정수2 > 정수4) {
//					System.out.println("[문제3] 결과 : " + 정수2);
//				}else if(정수3 > 정수2 && 정수3 > 정수4) {
//					System.out.println("[문제3] 결과 : " + 정수3);
//				}else {
//					System.out.println("[문제3] 결과 : " + 정수4);
//				}
				
//				- 변수 사용
//				System.out.print("[문제3] 정수2 : ");
//				int 정수2 = sc.nextInt();
//				System.out.print("[문제3] 정수3 : ");
//				int 정수3 = sc.nextInt();
//				System.out.print("[문제3] 정수4 : ");
//				int 정수4 = sc.nextInt();
//				int max = 정수2; 				// 첫번째 값을 가장 큰값으로 설정하고
//				if( max < 정수3 ) { max = 정수3;}
//				if( max < 정수4 ) { max = 정수4;}
//				System.out.println( max );
				
				
//				문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
//				System.out.print("[문제4] 정수5 : ");
//				int 정수5 = sc.nextInt();
//				System.out.print("[문제4] 정수6 : ");
//				int 정수6 = sc.nextInt();
//				System.out.print("[문제4] 정수7 : ");
//				int 정수7 = sc.nextInt();
//				if(정수5 > 정수6 && 정수5 > 정수7) {
//					if(정수6 > 정수7) {
//						System.out.println("[문제4] 결과 : " + 정수7 +"/"+ 정수6 +"/"+ 정수5);
//					}else {
//						System.out.println("[문제4] 결과 : " + 정수6 +"/"+ 정수7 +"/"+ 정수5);
//					}
//				}else if(정수6 > 정수5 && 정수6 > 정수7) {
//					if(정수5 > 정수7) {
//						System.out.println("[문제4] 결과 : " + 정수7 +"/"+ 정수5 +"/"+ 정수6);
//					}else {
//						System.out.println("[문제4] 결과 : " + 정수5 +"/"+ 정수7 +"/"+ 정수6);
//					}
//				}else {
//					if(정수5 > 정수6) {
//						System.out.println("[문제4] 결과 : " + 정수6 +"/"+ 정수5 +"/"+ 정수7);
//					}else {
//						System.out.println("[문제4] 결과 : " + 정수5 +"/"+ 정수6 +"/"+ 정수7);
//					}
//				}
				
//				- 변수 사용
//				1. [입력] , 각 int 타입으로 입력받아 int형 타입 변수에 각 대입 한다.
//				System.out.print("[문제4] 정수5 : ");
//				int 정수5 = sc.nextInt();
//				System.out.print("[문제4] 정수6 : ");
//				int 정수6 = sc.nextInt();
//				System.out.print("[문제4] 정수7 : ");
//				int 정수7 = sc.nextInt();
////				2. [처리] , 3개 변수들간의 값 비교 , 오름차순:작->큰 / 내림차순:큰->작
////					(1) 비교 , 조건 3개
////						조건1. 첫번째값 > 두번째값
////						조건2. 첫번째값 > 세번째값
////						조건3. 두번째값 > 세번째값
////					(2) 스왑 , 두 변수간의 값 바꾸기 , temp변수를 활용한 두 변수간의 값 바꾸기
////						int temp = 첫번째 변수값; , 첫번째 변수명 = 두번째 변수값; 두번째 변수명 = temp값 ;
//				if( 정수5 > 정수6 ) { // 만약 첫번째값이 두번째값보다 크면 , (오름차순) 큰값 뒤로 보내기 , > 오름차순 < 내림차순
//					int temp = 정수5; 정수5 = 정수6; 정수6 = temp;
//				}
//				if( 정수5 > 정수7 ) { int temp = 정수5; 정수5 = 정수7; 정수7 = temp;}
//				if( 정수6 > 정수7 ) { int temp = 정수6; 정수6 = 정수7; 정수7 = temp;}
//				System.out.println("[문제4] 결과 : " + 정수5 + "/" + 정수6  + "/" + 정수7 );
				
//				문제5 : 가위바위보 게임 구현하기.
//				      - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
//				     - 승리자 판단과 무승부 경우의수를 출력하시오.
//				      [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
//				     [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
//				System.out.print("[문제5] 플레이어1 : ");
//				int p1 = sc.nextInt();
//				System.out.print("[문제5] 플레이어2 : ");
//				int p2 = sc.nextInt();
//				if( p1 == p2 ) {
//					System.out.println("[문제5] 결과 : 무승부");
//				}else if( (p1 == 0 && p2 == 2) || (p1 == 1 && p2 == 0) || (p1 == 2 && p2 == 1) ) {
//					System.out.println("[문제5] 결과 : 플레이어1 승리");
//				}else {
//					System.out.println("[문제5] 결과 : 플레이어2 승리");
//				}
				
//				문제6 : 윤년/평년 판단하기
//				   [ 입력조건 ] 하나의 연도를 입력 받습니다.
//				   [ 윤년/평년 조건 ]
//				   -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//				   -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
//				   -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
//				   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.
				
//				System.out.print("[문제6] 연도 : ");
//				int year = sc.nextInt();
//				if( year % 4 == 0 && year % 100 == 0 ) {
//					System.out.println("[문제6] 입력한 " + year + "년 은 평년입니다.");
//				}else {
//					System.out.println("[문제6] 입력한 " + year + "년 은 윤년입니다.");
//				}
				
//				문제7 : 주차 사용요금 계산하기
//				   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. 
//				   - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
//				   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. 
//				   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
//				   - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오.
//				System.out.print("[문제7] 입차시간 시 : ");
//				int 입차_시 = sc.nextInt();
//				System.out.print("[문제7] 입차시간 분 : ");
//				int 입차_분 = sc.nextInt();
//				System.out.print("[문제7] 출차시간 시: ");
//				int 출차_시 = sc.nextInt();
//				System.out.print("[문제7] 출차시간 분: ");
//				int 출차_분 = sc.nextInt();
//				int 입차 = (입차_시 * 60) + 입차_분;
//				int 출차 = (출차_시 * 60) + 출차_분;
//				int 요금 = (출차 - 입차) * 1000;
////				- 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류'
//				if( 출차 < 입차 ) {
//					System.out.println("[문제7]출차시간 오류");
//				}else {
//					System.out.println("[문제7] 사용요금 : " + 요금 + "원" );
//				}
				
//				문제8 : 로그인 처리
//				   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
//				   [처리출력 조건]
//				   1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
//				   2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
//				   3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
//				   [ 참고 ]
//				   1. 문자열 비교시에는 == 같다 연산자 대신에 .equals() 함수를 이용해주세요.
//				   예] 
//				      String name = scan.next();
//				      name =="admin" 대신에 name.equals( "admin" ) 사용.
				
//				System.out.print("[문제8] 아이디 : ");
//				String id = sc.next();
//				System.out.print("[문제8] 비밀번호 : ");
//				String pw = sc.next();
//				
//				if(id.equals("admin") && pw.equals("1234")) {
//					System.out.println("[문제8] 결과 : 로그인성공");
//				}else if( !id.equals("admin") ) {
//					System.out.println("[문제8] 아이디 정보가 일치하지 않습니다.");
//				}else {
//					System.out.println("[문제8] 비밀번호가 일치하지 않습니다.");
//				}
				
//				문제9 : 당첨번호 개수  찾기
//				   [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이 변수를 먼저 선언해주세요.
//				   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
//				   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
//				int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
//				System.out.print("[문제9] 번호1 : ");
//				int 번호1 = sc.nextInt();
//				System.out.print("[문제9] 번호2 : ");
//				int 번호2 = sc.nextInt();
//				System.out.print("[문제9] 번호3 : ");
//				int 번호3 = sc.nextInt();
//				int 개수 = 0;
//				if( 번호1 == 공1 ) { 개수++; }
//				if( 번호2 == 공2 ) { 개수++; }
//				if( 번호3 == 공3 ) { 개수++; }
//				System.out.println("[문제9] 결과 : " + 개수 + "개");
				
	}

}