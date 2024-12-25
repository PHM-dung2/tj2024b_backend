package day10;

import java.util.Scanner;

public class JoinService {
	
	void joinAdd( Scanner sc , Join[] joins ) {
		System.out.print("id : ");		String id = sc.next();
		System.out.print("password : ");String pw = sc.next();
		System.out.print("닉네임 : ");	String nName = sc.next();
		Join join = new Join( id , pw , nName );
		
		boolean joinState = false;
		for( int i = 0 ; i < joins.length ; i++ ) {
			Join sJoin = joins[i];
			if( sJoin != null ) {
				if( sJoin.getId().equals(id) ) {
					System.out.println("중복된 ID입니다.");
					break;
				}else if( sJoin.getNName().equals(nName) ) {
					System.out.println("중복된 닉네임입니다.");
					break;
				}
			}else {
				joins[i] = join;
				joinState = true;
				break;
			} // if1 end
		} // for end
		
		if( joinState ) { System.out.printf("%s님 회원가입을 축하합니다!\n" , nName); } 
		else { System.out.println("회원가입 실패"); } 
	} // m end
	
	
	void LogIn( Scanner sc , Join[] joins ) {
		System.out.print("id : ");		String id = sc.next();
		System.out.print("pw : ");		String pw = sc.next();
		
		boolean searchID = false;
		for( int i = 0 ; i < joins.length ; i++ ) {
			Join join = joins[i];
			if( join != null ) {
				if( join.getId().equals(id) && join.getPw().equals(pw) ) {
					searchID = true;
					break;
				} // if2 end
			} // if1 end
		} // for end
		if( searchID ) { System.out.println("로그인 성공");}
		else { System.out.println("로그인 실패");}
	} // m end
	
}
