package boardservice10.view;

import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dto.MemberDto;

public class MemberView {
	
//	+ 싱글톤
	private MemberView() {}
	private static MemberView instance = new MemberView();
	public static MemberView getInstance() { return instance; }
	
	private Scanner scan = new Scanner(System.in);
	
//	0. 메인메뉴
	public void run() {
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 : ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { signUp(); }
			else if( choose == 2 ) { logIn(); }
			else if( choose == 3 ) { searchID(); }
			else if( choose == 4 ) { searchPWD(); }
			
		} // w end
		
	} // f end
	
//	1. 회원가입
	public void signUp() {
		System.out.println("===== 회원가입 =====");
		System.out.print("아이디 : ");		String mid = scan.next();
		System.out.print("비밀번호 : ");		String mpwd = scan.next();
		System.out.print("이름 : ");			String mname = scan.next();
		System.out.print("전화번호 : ");		String mphone = scan.next();
		MemberDto memberDto = new MemberDto( mid , mpwd , mname , mphone );
		
		boolean result = MemberController.getInstance().signUp( memberDto );
		
		if( result ) { System.out.println("회원가입 성공"); }
		else { System.out.println("회원가입 실패"); }
		
	} // f end
	
//	2. 로그인
	public void logIn() {
		System.out.println("===== 로그인 =====");
	} // f end
	
//	3. 아이디찾기
	public void searchID() {
		System.out.println("===== 아이디 찾기 =====");
	} // f end
	
//	4. 비밀번호 찾기
	public void searchPWD() {
		System.out.println("===== 비밀번호 찾기 =====");
	} // f end
	
}
