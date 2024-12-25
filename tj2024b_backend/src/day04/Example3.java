package day04;

public class Example3 {

	public static void main(String[] args) {

//		[1] 나혼자코딩!
		for( int num = 1 ; num <= 10 ; num++ ) {
			System.out.printf("안녕하세요%d\n" , num);
		}
		
//		[2] 구구단 , for중첩
		int a , b;
		for( a=1 ; a<=9 ; a++ ) {
			for( b=1 ; b<=9 ; b++ ) {
				System.out.printf("%d X %d = %d\n", a , b , a*b);
			}
		}
		
//		[3] 1분 복습
		int c , d;
		for( c=3 ; c<=7 ; c++ ) {
			for( d=1 ; d<=9 ; d++ ) {
				System.out.printf("%d X %d = %d\n", c , d , c*d);
			}
		}

//		[4] continue문 , 이후의 문장은 수행하지 않고 for문의 증감식으로 이동한다.
//		1~100까지의 홀수값들의 누적합계
		int total = 0;
		for( int num = 1 ; num <= 100 ; num++ ) {
			if( num % 2 == 0) {
				// 만약에 현재 반복되고 있는 num변수값이 나누기 2했을때 0이면 [짝수]
				continue;
			} // if end
			total += num;
		} // for end
		System.out.println("1부터 100까지 홀수의 합 : " + total);
		
//		[5] break , 가장 가까운 for/switch 문{} 을 탈출/종료 한다.
		int sum3 = 0;
		for( int num = 0 ; ; num++ ) {
			sum3 += num;
			if( sum3 >= 100 ) { break; }
			// 만약에 sum3이 100보다 이상이면 반복문 종료/탈출 한다.
		}
		
//		[1분 복습]
		int sum4 = 0;
		int num;
		for (num = 1 ; ; num++) {
			sum4 += num;
			if(sum4 >= 500) {break;}
		}
		System.out.printf("num:%d sum:%d\n" , num , sum4);
	
//		[연습문제]
//		1.
		int num1 = 10;
		int num2 = 2;
		
//			(1) if-else
		
//		char operator = '+';
//		if(operator == '+') {
//			System.out.println(num1+num2);
//		}else if(operator == '-') {
//			System.out.println(num1-num2);
//		}else if(operator == '*') {
//			System.out.println(num1*num2);
//		}else if(operator == '/') {
//			System.out.println(num1/num2);
//		}
		
//			(2) switch
//		char operator = '+';
//		switch(operator) {
//	      case '+' : 
//	    	  System.out.println(num1+num2);
//	    	  break;
//	      case '-' : 
//	    	  System.out.println(num1-num2);
//	    	  break;
//	      case '*' : 
//	    	  System.out.println(num1*num2);
//	    	  break;
//	      case '/' : 
//	    	  System.out.println(num1/num2);
//	    	  break;
//	      }
		
//		2.
//		for( int a1 = 2 ; a1 <= 9 ; a1++ ) {
//			if( a1 % 2 == 1 ) { continue; }
//			for( int b1 = 1 ; b1 <= 9 ; b1++ ) {
//				System.out.printf("%d X %d = %d\n", a1, b1, a1*b1);
//			}
//		}
		
//		3.
//		for( int a1 = 2 ; a1 <= 9 ; a1++ ) {
//			for( int b1 = 1 ; b1 <= 9 ; b1++ ) {
//				if( a1 < b1 ) { continue; }
//				System.out.printf("%d X %d = %d\n", a1, b1, a1*b1);
//			}
//		}
//		
//		4.
		for( int line = 1 ; line <= 4 ; line++ ) {
			for( int space = 1 ; space <= 4-line ; space++ ) {
				System.out.print(" ");
			}
			for( int star = 1 ; star <= line*2 -1 ; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		5.
		for( int line = 1 ; line <= 4 ; line++ ) {
			for( int space = 1 ; space <= 4-line ; space++ ) {
				System.out.print(" ");
			}
			for( int star = 1 ; star <= line*2 -1 ; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for( int line = 3 ; line >= 1 ; line-- ) {
			for( int space = 1 ; space <= 4-line ; space++) {
				System.out.print(" ");
			}
			for( int star = 1 ; star <= line*2 -1 ; star++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
