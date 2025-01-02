package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_B_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if( a == 0 && b == 0) { break; }
			bw.write( (a+b) + "\n" );
		} // w end
		
		bw.close(); // 닫지 않으면 출력안됨
		
//		break return 차이
//		1. break : 가장 가까이 있는 반복문 탈출
//		2. return : 해당 함수(메소드)에서의 탈출
//		3. continue : 반복문 내의 작업 건너뛰기
		
	}
	
}
