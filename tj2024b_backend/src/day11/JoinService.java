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
	
	public void logIn( Scanner sc , Join[] joins , String writer ) {
		System.out.print("id : ");			String id = sc.next();
		System.out.print("passworsd : ");	String pw = sc.next();
		
		boolean logInState = false;
		for( int i = 0 ; i < joins.length ; i++ ) {
			if( joins[i] != null ) {
				if( joins[i].getID().equals(id) && joins[i].getPW().equals(pw)) {
					logInState = true;
					writer = joins[i].getID();
					
				} // if end
			} // if end 
		} // for end
		
		if( logInState ) { 
			System.out.println( "로그인 성공" );
			return writer;
		}
		else { System.out.println( "로그인 실패" );}
	} // m end
		
	public void boardAdd( Scanner sc , Board[] boards ) {
		System.out.println("제목 : ");		String title = sc.next();
		System.out.println("내용 : ");		String content = sc.next();
											
//		Board board = new Board( title , content );
		
//		boolean bAddState = false;
//		for( int i = 0 ; i < boards.length ; i++ ) {
//			
//		}
		
	} // m end
	
	
}
