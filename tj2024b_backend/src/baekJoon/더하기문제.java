package baekJoon;

import java.util.Scanner;

public class 더하기문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextInt()) { // hasNextInt : 더이상 정수 반환하지 않고 t/f 로 반환
		int count = sc.nextInt();
		for( int i = 0 ; i < count ; i++ ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println( a + b );
		} // for end
		
	}
	
}

