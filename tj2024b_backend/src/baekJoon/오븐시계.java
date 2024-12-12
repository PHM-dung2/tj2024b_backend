package baekJoon;

import java.util.Scanner;

public class 오븐시계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		if(m-t < 0 && h == 0) {h = 24;}
		 
		int total = h * 60 + m + t;
		
		if(total >= 1440) {total -= 1440;}
		
		if(m-t < 0 && total < 0) {total = -total;}
		
		int tH = total / 60;
		int tM = total % 60;
		
		System.out.printf("%d %d\n", tH , tM);
		
	}

}
