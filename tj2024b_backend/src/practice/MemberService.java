package practice;

import java.util.Scanner;

public class MemberService {
   private Member[] members;          // 회원 정보를 저장할 배열 
   private int memberCount;           // 현재 회원 수
      

   // 생성자
   public MemberService() {
       members = new Member[100];     // 100명 저장 가능한 배열 생성
       memberCount = 0;               // 초기 회원수 0
       
   }

   // 회원가입 함수 
   public void signup(Scanner scanner) {
       if(memberCount >= members.length) {  // 배열 크기와 비교
           System.out.println("최대값 도달");
           return;
       }

       System.out.println("아이디: ");
       String id = scanner.nextLine();
       System.out.println("비밀번호: ");
       String password = scanner.nextLine();
       System.out.println("이름: ");
       String name = scanner.nextLine();

       // 새로운 회원 객체 생성해서 배열에 저장
       members[memberCount] = new Member(id, password, name);
       memberCount++;  // 회원 수 증가
       
       System.out.println("회원가입이 완료되었습니다.");
   }
   //로그인 함수
   
   public void login(Scanner scanner ) {
	   System.out.println("아이디입력 :");
	   String id = scanner.next();
	   System.out.println("비밀번호 입력 : ");
	   String pw = scanner.next();
	   
	   for(int i=0; i < memberCount; i++) {
		   if(members[i].getId().equals(id)&&members[i].getPw().equals(pw)) {
			   System.out.println("로그인성공");
			   return;
		   }System.out.println("로그인실패");
	   }
   }
}