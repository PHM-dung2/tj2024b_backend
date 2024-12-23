package day11;

import java.util.Scanner;

public class JoinService {

	public void joinAdd( Scanner sc , Join[] joins ) {
		System.out.print("id : ");			String id = sc.next();
		System.out.print("passworsd : ");	String pw = sc.next();
		int no = 0;
		Join join = new Join( no , id , pw );
		
		boolean joinState = false;
		for( int i = 0 ; i < joins.length ; i++ ) {
			if( joins[i] != null ) {
				if( joins[i].getID().equals(id) ) {
					System.out.println("중복된 id입니다.");
					break;
				}
			} else { 
				joins[i] = join; 
				joinState = true;
				break;
			} // if end
		} // for end
		
		if( joinState ) { System.out.println("회원가입 성공");}
		else { System.out.println("회원가입 실패"); }
	} // m end
	
	public void logIn( Scanner sc , Join[] joins , Board board ) {
		System.out.print("id : ");			String id = sc.next();
		System.out.print("passworsd : ");	String pw = sc.next();
		
		boolean logInState = false;
		for( int i = 0 ; i < joins.length ; i++ ) {
			if( joins[i] != null ) {
				if( joins[i].getID().equals(id) && joins[i].getPW().equals(pw)) {
					logInState = true;
					board.setWriter(id);
				} // if end
			} // if end 
		} // for end
		
		if( logInState ) { 
			System.out.println( "로그인 성공" );
		}
		else { System.out.println( "로그인 실패" );}
	} // m end
		
	public void boardAdd( Scanner sc , Board[] boards , Board board ) {
		System.out.println("게시물 등록을 선택하셨습니다.");
		System.out.print(">>제목 : ");		String title = sc.next();
		System.out.print(">>내용 : ");		String content = sc.next();
											
		Board b1 = new Board( title , content , board.getWriter());
		
		boolean bAddState = false;
		for( int i = 0 ; i < boards.length ; i++ ) {
			if( boards[i] == null ) {
				boards[i] = b1;
				bAddState = true;
			} // if end
		} // for end
		
		if( bAddState ) { System.out.println("등록 성공"); }
		else { System.out.println("등록 실패"); }
		
	} // m end
	
	public void boardPrint( Board[] boards ) {
		
		for( int i = 0 ; i < boards.length ; i++ ) {
			System.out.printf("제목 : %s 내용 : %s 작성자 : %s\n" , 
					boards[i].getTitle() , boards[i].getContent() , boards[i].getWriter());
		}
		
	} // m end
	
}
