package boardservice10.view;

import java.util.Scanner;

public class BoardView {
//	+ 싱글톤
	private BoardView(){}
	private static BoardView instance = new BoardView();
	public static BoardView getinstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	
//	0. (로그인 했을때) 메인 메뉴 메소드
	public void index() {
		while(true) {
			System.out.println("1.로그아웃 2.내정보 3.게시물작성 4.게시물상세보기");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { MemberView.getInstance().logOut(); break; }
			else if( choose == 2 ) { 
				int state = MemberView.getInstance().myInfo();
				if( state == 1 ) { 
					System.out.println("탈퇴가 완료되었습니다.");
					break; 
					}
			}
			else if( choose == 3 ) {  }
			else if( choose == 4 ) {  }
		} // w end
	} // f end
	
//	1. 게시물 작성 메소드
	public void write() {
		
	} // f end
	
//	2. 게시물 상세보기 메소드
	public void find() {
		
	}
	
	
}
