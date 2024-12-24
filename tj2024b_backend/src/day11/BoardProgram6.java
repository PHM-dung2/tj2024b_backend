package day11;

import java.util.Scanner;

public class BoardProgram6 {

	public static void main(String[] args) {
		
//		*
		BoardDto[] boards = new BoardDto[100];
		BoardService bs = new BoardService();
		
		while(true) {
			
			System.out.print("1.등록 2.출력");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			if( choose == 1 ) {
				bs.boardAdd( sc , boards);
			}else if( choose == 2 ) {
				bs.boardPrint(boards);
			}
			
			
		} // w e
		
		
	}

}
