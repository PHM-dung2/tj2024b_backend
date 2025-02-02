package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = 0;
		for( int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
			if( arr[i] > m ) {
				m = (int)arr[i];
			} // if end
		} // for end
		
		double sum = 0;
		for( int i = 0 ; i < arr.length ; i++ ) {
			sum += arr[i] / m * 100;
		} // for end 
		
		double avr = sum / n;
		bw.write( avr + "" );
		
		br.close();
		bw.close();
	}
}
