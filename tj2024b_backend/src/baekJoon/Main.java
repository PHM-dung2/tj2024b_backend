package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer( br.readLine() );
		int b = Integer.parseInt(br.readLine());
		int count = 0;
		
		for( int i = 0 ; i < a ; i++ ) {
			int c = Integer.parseInt(st.nextToken());
			if( b == c ) { count++; }
		} // for end
		
		System.out.println( count );
		
		br.close();
		
	}

}
