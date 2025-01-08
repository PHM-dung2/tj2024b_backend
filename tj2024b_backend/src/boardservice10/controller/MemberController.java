package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
//	+ 싱글톤
	private MemberController() {}
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() { return instance; }
	
//	1. 회원가입
	public boolean signUp( MemberDto memberDto ) {
		MemberDao.getInstance().signUp( memberDto );
		return true;
	} // f end
	
//	2. 아이디찾기
	public String findID( MemberDto memberDto ) {
		String result = MemberDao.getInstance().findID(memberDto);
		return result;
	} // f end
	
//	3. 비밀번호 찾기
	public String findPWD( MemberDto memberDto ) {
		String result = MemberDao.getInstance().findPWD(memberDto);;
		return result;
	} // f end
	
//	4. 로그인
	public boolean logIn( MemberDto memberDto ) {
		boolean result = MemberDao.getInstance().logIn(memberDto);
		return result;
	} // f end
	
}
