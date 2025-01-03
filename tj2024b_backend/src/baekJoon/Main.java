package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[ br.readLine() ];
		int max = int[0];
		int min = int[0];
		
		for( int i = 0 ; i < n ; i++ ) {
			if( a > max ) {	max = a; }
			if( a < min ) { min = a; }
		} // for end
		
		System.out.printf("%d %d" , min , max );
		
		
		
	}

}
