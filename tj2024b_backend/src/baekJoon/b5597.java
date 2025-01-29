package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		방법 1
		
//		ArrayList<Integer> arr = new ArrayList<>();
//		
//		for( int i = 1 ; i <= 28 ; i++ ) {
//			int a = Integer.parseInt(bf.readLine());
//			arr.add(a);
//		} // w end
//		
//		for( int i = 1 ; i <= 30 ; i++ ) {
//			if( !arr.contains(i) ) { System.out.println(i); }
//			else {  }
//		} // for end
//		
		
//		방법 2
		
//		boolean[] arr = new boolean[30];
//		
//		for( int i = 0 ; i < 28 ; i++ ) {
//			int a = Integer.parseInt(bf.readLine());
//			arr[a-1] =  true;
//		} // for end
//		
//		for( int i = 0 ; i < 30 ; i++ ) {
//			if( !arr[i] ) { System.out.println(i+1); }
//		} // for end
		
//		방법 3
		
		int[] arr = new int[30];
		
		String input;
		while( (input = bf.readLine()) != null && !input.isBlank() ) {
			arr[Integer.parseInt(input)-1]++; // ++는 연산 후 대입하는 것
		} // for end
		
		for( int i = 0 ; i < 30 ; i++ ) {
			if( arr[i] == 0 ) { System.out.println(i+1); }
		} // for end
		
		bf.close();
		
		
	}
}
