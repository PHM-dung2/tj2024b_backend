package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		방법 1
		
//		int[] arr = new int[10];
//		
//		for( int i = 0 ; i < 10 ; i++ ) {
//			int a = Integer.parseInt(br.readLine());
//			arr[i] = a % 42;
//		} // for end
//		
//		int count = 0 ;
//		boolean state = true;
//		for( int i = 0 ; i < arr.length ; i++ ) {
//			for( int j = 0 ; j < arr.length ; j++ ) {
//				int a = arr[i];
//				int b = arr[j];
//				
//				if( i != j && a == b ) { arr[i] = -1; }
//			} // for end
//			if( arr[i] >= 0 ) { count++; }
//		} // for end
//		System.out.println(count);
		
//		방법 2
		
//		HashSet<Integer> arr = new HashSet<Integer>();
//		
//		for( int i = 0 ; i < 10 ; i++ ) {
//			arr.add( Integer.parseInt(br.readLine()) % 42 );
//		} // for end
//		
//		System.out.println( arr.size() );
//		
//		br.close();
		
//		방법 3
		boolean[] arr = new boolean[42];
		
		for( int i = 0 ; i < 10 ; i++ ) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		} // for end
		
		int count = 0;
		for( boolean value : arr ) {
			if( value ) { count++; }
		}
		
		System.out.println( count );
		
	}
}
