package day07;

import java.util.Scanner;

/*
    자바 조별과제1 ,
    주제 : 회원 서비스 구현하기 
       - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
       - 회원은 최대 3명 까지 저장할수 있다.
       - 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
       - 회원클래스를 정의하고 회원객체 활용하여 구현한다.
       - 프로그램 초기 메뉴 : 1.회원가입 2.로그인 : 
          1 선택시 : 아이디,비밀번호,닉네임 3개의 각 정보를 입력받아 저장하기.
          2 선택시 : 아이디,비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실패' 출력한다.
   
   1. 코드 구현 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
   2. 구현 된 코드에서 문법찾기 : 아래 링크의 각 슬라이드에서 조별 작성 , 카톡방 링크 참고
*/
public class Example3 {

	public static void main(String[] args) {
		Join j1 = new Join(); 
		Join j2 = new Join();
		Join j3 = new Join(); 
		
		while(true) {
			System.out.print("1.회원가입 2.로그인 ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			
			if( choose == 1 ) {
				System.out.print("id : "); String id = sc.next();
				System.out.print("password : "); String pw = sc.next();
				System.out.print("닉네임 : "); String nName = sc.next();
				if( j1.id == null || j1.pw == null ) {
					j1.id = id; j1.pw = pw; j1.nName = nName;
					System.out.printf("%s님 회원가입이 완료되었습니다.\n" , j1.nName);
				}else if( j2.id == null || j2.pw == null ) {
					j2.id = id; j2.pw = pw; j2.nName = nName;
					System.out.printf("%s님 회원가입이 완료되었습니다.\n" , j2.nName);
				}else if( j3.id == null || j3.pw == null ) {
					j3.id = id; j3.pw = pw; j3.nName = nName;
					System.out.printf("%s님 회원가입이 완료되었습니다.\n" , j3.nName);
				}else { System.out.println("등록실패"); }
			}else if( choose == 2 ) {
				System.out.print("id : "); String id = sc.next();
				System.out.print("password : "); String pw = sc.next();
				if( j1.id != null && j1.pw != null ) {
					if( j1.id.equals(id) && j1.pw.equals(pw) ) {
						System.out.println("로그인성공");
					}else if( j2.id.equals(id) && j2.pw.equals(pw) ) {
				    	System.out.println("로그인성공");
				    }else if( j3.id.equals(id) && j3.pw.equals(pw) ) {
				    	System.out.println("로그인성공");
				   	}else { System.out.println("로그인실패");}
				}else { System.out.println("회원정보가 없습니다."); }
			} // if end
			
			sc.close();
		} // w e
		
	}

}
