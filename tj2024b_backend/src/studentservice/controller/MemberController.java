package studentservice.controller;

import studentservice.model.dao.MemberDao;
import studentservice.model.dto.MemberDto;

public class MemberController {
//	싱글톤
	private MemberController() {}
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {
		return instance;
	}

//	메소드
//	1. 회원가입
	public boolean signUp( MemberDto memberDto ) {
		boolean result = MemberDao.getInstance().signUp( memberDto );
		return result;
	} // f end
	
//	2. 로그인
	private int logInState = -1;
	public int getLogInState() { return logInState; }
	public int logIn( MemberDto memberDto ) {
		int result = MemberDao.getInstance().logIn(memberDto);;
		logInState = result;
		return result;
	} // f end
	
//	3. 로그아웃
	public void logOut() {
		logInState = -1;
	} // f end
	
}
