package boardservice10.view;

import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dao.MemberDao;
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
			System.out.print("1.회원가입 2.아이디찾기 3.비밀번호찾기 4.로그인 : ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { signUp(); }
			else if( choose == 2 ) { findID(); }
			else if( choose == 3 ) { findPWD(); }
			else if( choose == 4 ) { logIn(); }
			
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
	
//	2. 아이디찾기
	public void findID() {
//		[1] 입력
		System.out.println("===== 아이디 찾기 =====");
		System.out.print("이름 : ");			String mname = scan.next();
		System.out.print("전화번호 : ");		String mphone = scan.next();
//		[2] 객체화 // 데이터포장( view 에서 controller 이동 )
//		MemberDto memberDto = new MemberDto( mname , mphone ); 
//			오류 : new 키워드 뒤로 생성자가 오는데 클래스에 선언된 (매개변수가 일치한)생성자만 가능
//			1. 클래스에 서 매개변수2개의 생성자를 만든다.
//			2. 디폴트 생성자로 인스턴스 생성후 setter로 값을 넣는다.
		MemberDto membetDto = new MemberDto();
		membetDto.setMname(mname);
		membetDto.setMphone(mphone);
//		[3] 컨트롤러에게 전달(request/요청/매개변수) 하고 응답(response/응답/리턴) 결과 받기
		String result = MemberController.getInstance().findID(membetDto);
//		[4] 컨트롤러의 결과에 따른 처리
		if( result != null ) { System.out.println("찾은 아이디 : " + result );}
		else { System.out.println("동일한 회원정보가 없습니다."); }
	} // f end
	
//	3. 비밀번호 찾기
	public void findPWD() {
		System.out.println("===== 비밀번호 찾기 =====");
		System.out.print("아이디 : ");		String mid = scan.next();
		System.out.print("이름 : ");			String mname = scan.next();
		System.out.print("전화번호 : ");		String mphone = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMname(mname);
		memberDto.setMphone(mphone);
		
		String result = MemberController.getInstance().findPWD(memberDto);
		
		if( result != null ) {System.out.println("찾은 비밀번호 : " + result);}
		else { System.out.println("동일한 회원정보가 없습니다."); }
	} // f end
	
//	4. 로그인
	public void logIn() {
		System.out.println("===== 로그인 =====");
		System.out.print("아이디 : ");		String mid = scan.next();
		System.out.print("비밀번호 : ");		String mpwd = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMpwd(mpwd);
		boolean result = MemberController.getInstance().logIn( memberDto );
		
		if( result ) { System.out.println("로그인 성공"); }
		else { System.out.println("로그인 실패"); }
	} // f end
	

	

	
}
