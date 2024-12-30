package day04;

public class Example1 {

	public static void main(String[] args) {

//		p. 102 switch
		/*
			- 형태
			switch( 조건/검사대상 ) {
				case 값1 : 
					실행문; 
					break; 
			}
			
			- break : switch 종료 , 만일 break 없다면 아래 case 의 실행문이 실행된다.
		 */
//		[1]
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1 : medalColor = 'G';
			break;	// switch 종료
			case 2 : medalColor = 'S';
			break;	// switch 종료
			case 3 : medalColor = 'B';
			break;	// switch 종료
			default : medalColor = 'A';
		} 
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
		
//		[2] 각 월마다의 일수를 정하는 코드 , case문 동시에 사용하기
		
//		int month = 10;
//		int day;
//		switch( month ) {
//			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
//				day = 31;
//				break;
//			case 4 : case 6 : case 9 : case 11 :
//				day = 30;
//				break;
//			case 2 : day = 28;
//				break;
//		}
		
//		[3] '메달' 문자열 에 따른 메세지 출력코드 , case문에 문자열 사용하기
		String medal = "Gold";
		switch( medal ) {
			case "Gold" :
				System.out.println("금메달입니다");
				break;
			case "Silver" :
				System.out.println("은메달입니다");
				break;
			case "Bronze" :
				System.out.println("동메달입니다");
				break;
			default : // 그외
				System.out.println("메달이 없습니다.");
				break; // 생략가능
		}
		
//		[4] if는 조건결과의 논리(t/f) 제어 , switch는 조건결과의 값(value case) 제어
//		int score = 80;
//			switch( score >= 80 ) { } : 조건문에 논리연산 , 비교연산에 따른 논리결과 케이스가 아니다.
//			switch( score ) {
//				case score >= 80 : System.out.println("합격");
//		}
		
//		[5] 나혼자코딩! , 지문/한국어 생각 하고 조건만드는 연습 ,
		int floor = 1;
		switch(floor) {
			case 1 : System.out.println(floor + "층 피부과입니다.");
			break;
			case 2 : System.out.println(floor + "층 정형외과입니다.");
			break;
			case 3 : System.out.println(floor + "층 피부과입니다.");
			break;
			case 4 : System.out.println(floor + "층 치과입니다.");
			break;
			default : System.out.println(floor + "층 헬스클럽입니다.");
		}
		
	}

}
