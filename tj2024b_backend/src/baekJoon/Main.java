package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for( int i = 1 ; i <= 30 ; i++ ) {
			try {
				int a = Integer.parseInt(br.readLine());
			
			for( int j = 1 ; j <= 30 ; j++ ) {
				if( a == j ) { break; }
				else { arrList.add(a); }
			} // for end
			}catch( NumberFormatException e ) { continue; }
		} // for end
		
		int n = arrList.size()-1;
		
		System.out.println( arrList.get(0) + " " + arrList.get(n) );
		
	}
	
}
