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
	
////	2. 로그인
//	public boolean logIn() {
//		
//	} // f end
//	
////	3. 아이디찾기
//	public String searchID() {
//		
//	} // f end
//	
////	4. 비밀번호 찾기
//	public String searchPWD() {
//		
//	} // f end
	
}
