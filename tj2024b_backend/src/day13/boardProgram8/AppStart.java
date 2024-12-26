package day13.boardProgram8;

import day13.boardProgram8.view.BoardView;

public class AppStart {

	public static void main(String[] args) {
		
//		+ 싱글톤의 메소드 호출
		BoardView.getInstance().index();
//		new BoardView.index();
		
	} 
	
}
