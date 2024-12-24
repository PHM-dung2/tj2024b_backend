package day12.boardprogram7;

import java.util.Scanner;

public class MemberService {
//	1. 멤버변수
//	2. 생성자
//	3. 메소드
	public void signUp( Scanner sc , MemberDto[] members ) {
		System.out.println("id : ");	 	String id = sc.next();	
		System.out.println("password : ");	String pw = sc.next();
		System.out.println("닉네임 : ");		String name = sc.next();
//		* 객체화 , 생성자 이용한 빠른 객체 생성
		MemberDto memberDto = new MemberDto();
		for( int i = 0 ; i < members.length ; i++ ) {
			if( members[i] == null ) {
				members[i] = memberDto;
				System.out.println("**회원가입 성공**");
				return;
			}
		}
		
		
	} // f end
	
	public String logIn( Scanner sc , MemberDto[] members ) {
		System.out.println("id : ");	 	String id = sc.next();	
		System.out.println("password : ");	String pw = sc.next();
		
		for( int i = 0 ; i < members.length ; i++ ) {
			MemberDto memberDto = members[i];
			if( memberDto != null ) {
				if( memberDto.getId().equals(id) && memberDto.getPw().equals(pw) ) {
					System.out.println("로그인 성공");
					return memberDto.getId(); // 로그인 성공한 아이디 반환
				} // if end
			} // if end
		}
		System.out.println("로그인 실패");
		return null; // 로그인 실패시 null 반환
	} // f end
	
	
}
