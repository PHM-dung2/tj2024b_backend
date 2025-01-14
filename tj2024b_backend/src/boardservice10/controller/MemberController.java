package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
//	+ 싱글톤
	private MemberController() {}
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() { return instance; }
	
//	1. 회원가입
	public int signUp( MemberDto memberDto ) {
//		* 다양한 유효성검사를 넣을 예정
//		1. 아이디 길이 검사 : 사용자로부터 입력받은 아이디의 길이가 30초과하면 실패
		if( memberDto.getMid().length() < 5 || memberDto.getMid().length() > 30 ) {
			return 1;
		} // if end
//		2. 아이디 중복 검사
		if( MemberDao.getInstance().check("mid" , memberDto.getMid()) ) {
			return 7;
		} // if end
//		3. 비밀번호 길이 검사
		if( memberDto.getMpwd().length() < 5 || memberDto.getMpwd().length() > 30  ) {
			return 2;
		} // if end
//		4. 이름 길이 검사
		if( memberDto.getMname().length() < 2 || memberDto.getMname().length() > 20 ) {
			return 3;
		} // if end
//		5. 연락처 - 검사 , 길이검사
		String[] phones = memberDto.getMphone().split("-");
		if( phones.length != 3 && phones[0] != "010" && memberDto.getMphone().length() != 13 ) {
			return 4;
		} // if end
//		6. 연락처 중복 검사
		if( MemberDao.getInstance().check("mphone" , memberDto.getMphone()) ) {
			return 8;
		} // if end
		
		boolean result = MemberDao.getInstance().signUp( memberDto );
		if( result ) { return 5; }
		else{ return 6; } 
	} // f end
	
//	2. 로그인
	private int logInMno = 0;
	public int getLogInMno() { return logInMno; } // BoardController에서 호출할 에정(글쓰기)
	
	public boolean logIn( MemberDto memberDto ) {
		int result = MemberDao.getInstance().logIn(memberDto);
//		boolean --> int 변경한 이유 : 로그인 성공한 회원번호를 내부적으로 저장하기 위해
//		회원번호( 1번 시작하므로 )를 받아서 0이면 없는 회원번호 , 0초과이면 있는 회원번호 // 설계
		if( result > 0 ) { 
			logInMno = result; // 로그인 성공시 로그인 저장변수에 로그인 성공한 회원번호 저장
			System.out.println( logInMno );
			return true; 
		} 
		else { return false; } 
	} // f end
	
//	3. 아이디찾기
	public String findID( MemberDto memberDto ) {
		String result = MemberDao.getInstance().findID(memberDto);
		return result;
	} // f end
	
//	4. 비밀번호 찾기
	public String findPWD( MemberDto memberDto ) {
		String result = MemberDao.getInstance().findPWD(memberDto);;
		return result;
	} // f end
	
//	5. 로그아웃 컨트롤러 메소드
	public void logOut() {
		logInMno = 0;
	} // f end
	
//	6. 내정보조회 컨트롤러 메소드
	public MemberDto myInfo( ) {
		MemberDto result = MemberDao.getInstance().myInfo( logInMno );
		return result;
	} // f end
	
//	7. 회원탈퇴 컨트롤러 메소드
	public void delete( ) {
		MemberDao.getInstance().delete( logInMno );
	} // f end
	
//	8. 회원수정 컨트롤러 메소드
	public boolean update( MemberDto memberDto ) {
		boolean result = MemberDao.getInstance().update( memberDto , logInMno);
		return result;
	} // 
	
}
