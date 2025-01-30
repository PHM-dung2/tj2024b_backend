package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		for( int i = 0 ; i < 10 ; i++ ) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a % 42;
		} // for end
		
		int count = 0 ;
		boolean state = true;
		for( int i = 0 ; i < arr.length ; i++ ) {
			for( int j = 0 ; j < arr.length ; j++ ) {
				int a = arr[i];
				int b = arr[j];
				
				if( i != j && a == b ) { state = false; }
			} // for end
			if( state ) { count++; }
		} // for end
		System.out.println(count);
		
	}
}
