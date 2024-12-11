package baekJoon;

import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); 
		int m = sc.nextInt()-45;
		
		if( m < 0 ) {
			m += 60;
			if( h == 0 ) {
				h = 23;
			}else { h--;}
		}
		System.out.println(h+" "+m);
	}

}
