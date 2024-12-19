package day09;

import java.util.Scanner;

public class JoinService {

	void joinAdd( Scanner sc , Join[] joins ) {
		System.out.print("ID : "); String id = sc.next();
		System.out.print("password : "); String pw = sc.next();
		System.out.print("닉네임 : "); String nName = sc.next();
		Join join = new Join();
		join.id = id;
		join.pw = pw;
		join.nName = nName;
		boolean searchID = false;
		for( int i = 0 ; i < joins.length ; i++ ) {
			Join sJoin = joins[i];
			if( sJoin != null) {
				if( sJoin.id.equals(id) ) {
					System.out.println("중복된 ID입니다.");
					break;
				}else if( sJoin.nName.equals(nName) ) {
					System.out.println("중복된 닉네임입니다.");
					break;
				}
			}else {
				joins[i] = join;
				searchID = true;
				break;
			} // if end
		}// for end
		
		if( searchID == true ) { System.out.printf("%s님 회원가입이 완료되었습니다!\n" , nName); }
	} // m end
	
	void joinLogIn( Scanner sc , Join[] joins ) {
		System.out.print("ID : "); String id = sc.next();
		System.out.print("password : "); String pw = sc.next();
		boolean searchID = false;
		for( int i = 0 ; i < joins.length ; i++ ) {
			Join join = joins[i];
			if( join != null ) {
				if( join.id.equals(id) && join.pw.equals(pw) ) {
					searchID = true;
					break;
				} // if end
			} // if end
			
		}
		
		if( searchID == true ) { System.out.println("로그인 성공");	}
		else { System.out.println("로그인 실패"); }
	} // m end
	
}
