package baekJoon;

import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c, d , e;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("정수1 : ");
		System.out.println("정수2 : ");
		int result1 = a * b;
		int result2 = a ;
		int result3 = a ;
		
		System.out.println( result1 );
		System.out.println( result2 );
		System.out.println( result3 );
		System.out.println( result1 + (result1 * 10) + (result1 * 100) );
		
	}

}
