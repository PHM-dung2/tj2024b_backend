package baekJoon;

import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b , b1 , b2 , b3;
		a = sc.nextInt();
		b = sc.nextInt();
		b1 = b / 100;
		b2 = (b / 10) - b1 * 10 ;
		b3 = b - (b1 * 100) - (b2 * 10);
		
		int result1 = a * b3;
		int result2 = a * b2;
		int result3 = a * b1;
		int result4 = a * b;
		
		System.out.println( result1 );
		System.out.println( result2 );
		System.out.println( result3 );
		System.out.println( result4 );
		
	}

}
