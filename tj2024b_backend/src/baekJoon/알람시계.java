package baekJoon;

import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
		
//		1시간 이상도 가능한 코드
		Scanner sc = new Scanner(System.in);
		final int alertM = -45;
		
		int h = sc.nextInt(); 
		int m = sc.nextInt() + alertM;
		
		if( m < 0 && h == 0 ) { h = 24; }
		
		int total = h * 60 + m;
		
		if( m < 0 && total < 0 ) { total = -total; }
		
		int tH = total / 60;
		int tM = total % 60;
		System.out.println(tH + " " + tM);
	
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt(); 
//		int m = sc.nextInt()-45;
//		
//		if( m < 0 ) {
//			m += 60;
//			if( h == 0 ) {
//				h = 23;
//			}else { h--;}
//		}
//		System.out.println(h+" "+m);
	}

}
