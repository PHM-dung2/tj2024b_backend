package boardservice10.controller;

public class MemberController {
//	+ 싱글톤
	private MemberController() {}
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() { return instance; }
	
}
