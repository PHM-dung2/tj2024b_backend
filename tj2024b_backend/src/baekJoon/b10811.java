package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for( int i = 0 ; i < n ; i++ ) {
			arr[i] = i+1;
		} // for end
		
		for( int i = 0 ; i < m ; i++ ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			int temp = 0;
			while( a < b ) {
				temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;	b--;
			} // w end
		} // for end
		
		for( int i = 0 ; i < arr.length ; i++ ) {
			System.out.print( arr[i] + " " );
		} // for end
		
	}
}
