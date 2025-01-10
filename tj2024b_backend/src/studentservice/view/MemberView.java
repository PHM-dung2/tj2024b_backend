package studentservice.view;

import java.util.Scanner;

import studentservice.controller.MemberController;
import studentservice.model.dto.MemberDto;

public class MemberView {
//	싱글톤
	private MemberView() {}
	private static MemberView instance = new MemberView();
	public static MemberView getInstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	
//	메소드
//	0. 초기 페이지
	public void index() {
		
		while( true ) {
			System.out.println("===== 학생 로그인 =====");
			System.out.print("1.회원가입 2.로그인 ");
			int choose = scan.nextInt();
			
			switch(choose) {
			case 1 :
				signUp();
				break;
			case 2 :
				logIn();
				break;
			}
			
		} // w end
		
	} // f end
	
//	1. 회원가입
	public void signUp() {
		System.out.println("===== 회원가입 =====");
		System.out.print("아이디 : ");	String sid = scan.next();
		System.out.print("비밀번호 : ");	String spwd = scan.next();
		System.out.print("학생명 : ");	String sname = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setSid(sid);
		memberDto.setSpwd(spwd);
		memberDto.setSname(sname);
		
		boolean result = MemberController.getInstance().signUp( memberDto );
		
		if( result ) { System.out.println("회원가입 성공"); }
		else { System.out.println("회원가입 실패"); }
		
	} // f end
	
//	2. 로그인
	public void logIn() {
		System.out.println("===== 로그인 =====");
		System.out.print("아이디 : ");	String sid = scan.next();
		System.out.print("비밀번호 : ");	String spwd = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setSid(sid);
		memberDto.setSpwd(spwd);
		
		int result = MemberController.getInstance().logIn( memberDto );
		
		if( result > 0 ) { 
			System.out.println("로그인 성공"); 
			StudentView.getInstance().index();
		}
		else { System.out.println("로그인 실패"); }
	} // f end
	
	
}
