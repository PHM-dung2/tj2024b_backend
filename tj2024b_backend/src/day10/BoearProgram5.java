package day10;

import java.util.Scanner;

/*
	실습5 : 게시판 프로그램 - v4
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체(매개변수/메소드/생성자) , 배열
	- 제목 , 내용 , 작성자 를 입력받아서 저장 함수와 출력 함수 구현 하기
	- 게시물 클래스 설계하기
	- 게시물 최대 100개 저장 하기, 게시물1개당 객체 1개 필요 , 제목/내용/작성자 저장소(변수) 3개 필요 , 게시물3 --> 변수 9개 필요.
*/
public class BoearProgram5 {
	
	public static void main(String[] args) {
		
		Board[] boards = new Board[100];
		BoardService bs = new BoardService();
		
		while(true) {
			System.out.print("1.등록 2.출력 : ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			if(choose == 1) {
				bs.boardAdd( sc , boards );
			}else if(choose == 2) {
				bs.boardPrint( boards );
			}

		} // w e
		
	}

}
