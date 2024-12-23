package day11;

import java.util.Scanner;

/*
	자바 과제 11 : 회원제 게시판
		- 초기메뉴는 로그인과 회원가입을 제공한다.
		- 로그인 송공하면 게시물등록과 게시물출력을 제공합니다.
			- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
	
*/
public class Example1 {

	public static void main(String[] args) {
		
		JoinService js = new JoinService();
		Join[] joins = new Join[100];
		Board[] boards = new Board[100];
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		
		while(true) {
			System.out.print("1.회원가입 2.로그인 ");
			int choose = sc.nextInt();
			
			if(choose == 1) {
				js.joinAdd( sc , joins );
			}else if(choose == 2) {
				js.logIn( sc , joins , board );
				break;
			}
			
		} // w e
		
		while(true) {
			System.out.print("1.게시물 등록 2.게시물 출력");
			int choose = sc.nextInt();
			if(choose == 1) {
				js.boardAdd(sc, boards , board);
			}else if(choose == 2) {
				js.boardPrint( boards );
			}
		}
		
	}
	
}
