package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedReader(new OutputStreamWriter(System.in));
		StringTokenizer st;
		int count = Integer.parseInt(br.readLine());
		for( int i = 1 ; i <= count ; i++ ) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		} // for end
		
		bw.close();
	}
	
}
