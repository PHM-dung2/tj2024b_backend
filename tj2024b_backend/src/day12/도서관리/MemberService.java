package day12.도서관리;

import java.util.Scanner;

public class MemberService {

	public static void signUp( Scanner scan , MemberDto[] members ) {
		System.out.println("\n===== 도서관리 회원가입 =====");
		System.out.print( "타입 : 1. 관리자 2. 일반인 " );	int type = scan.nextInt();
		if( type == 1 ) { System.out.println("\n> 관리자 회원가입"); }
		else { System.out.println("> 일반인 회원가입"); }
		System.out.print( "아이디 : " );					String id = scan.next();
		System.out.print( "비밀번호 : " );				String pw = scan.next();
		MemberDto memberDto = new MemberDto( id , pw , type );
		
		Boolean signUpState = false;
		String signUpID = null;
		for( int i = 0 ; i < members.length ; i++ ) {
			if( members[i] != null ) {
				if( members[i].getId().equals(id) ) {
					System.out.println( "중복된 아이디입니다." ); 
					return;
				}
			}else {
				members[i] = memberDto;
				signUpID = members[i].getId();
				signUpState = true;
				return;
			}
		} // for end
		
		if( signUpState ) { System.out.printf( "\n%s님 회원가입을 축하드립니다.\n" , signUpID ); }
		
	} // m end
	
	public static void logIn( Scanner scan , MemberDto[] members ) {
		System.out.print("아이디 : ");		String id = scan.next();
		System.out.print("비밀번호 : ");	String pw = scan.next();
		
		for( int i = 0 ; i < members.length ; i++ ) {
			if( members[i] != null ) {
				if( members[i].getId().equals(id) ) {
					if( members[i].getPw().equals(pw) ) {
						System.out.printf("\n%s님 환영합니다.\n" , members[i].getId() );
						LogInManager.setLogInId( members[i].getId() );
						LogInManager.setLogInType( members[i].getType() );
						return;
					}else { 
						System.out.println("비밀번호를 확인해주세요.");
						break;
					} // if end
				} // if end
			} // if end
		} // for end
		
		System.out.println("아이디를 확인해주세요.");
	} // m end
	
	public static void logOut( ) {
		System.out.println("\n로그아웃했습니다.");
		LogInManager.setLogInId( null );
		LogInManager.setLogInType( 0 );
	} // m end
}
