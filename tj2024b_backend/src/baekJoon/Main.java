package baekJoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int tNum = sc.nextInt();
		int count = 0;
		int sum = 0;
		while(true) {
			int a = sc.nextInt();
			int c = sc.nextInt();
			sum += a * c;
			count++;
			if( tNum == count ) { break; }
		} // w end
		
		if( total == sum ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		} // if end
		
	}
	
}
