package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[30];
		
		for( int i = 0 ; i < 30 ; i++ ) {
			arr[i] = i+1;
		} // for end
		
		while(true) {
			for( int i = 1 ; i <= 30 ; i++ ) {
				int a = Integer.parseInt(br.readLine());
				if( arr[i-1] != i ) {
					System.out.println( i );
					return;
				} // if end
			} // for end
		}
		
		
	}
	
}
