package practice;

import java.util.Scanner;

public class Example {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);    // 스캐너객체 생성
       MemberService service = new MemberService(); // 멤버서비스 객체 생성

       while(true) {  // 반복
           System.out.println("=== 회원서비스 ===");
           System.out.println("1.회원가입 2.로그인 3.종료");
           
           String choice = scanner.nextLine();    // 1번선택

           switch(choice) {
               case "1":             // 스위치문으로 1번 선택시
                   service.signup( scanner ); // 회원가입 함수 실행
                   break;
               case "2":
                   service.login( scanner );  // MemberService의 메소드 호출  
                   break;
               case "3":
                   System.out.println("프로그램을 종료합니다");
                   return;
               default:              // 잘못된 선택 처리
                   System.out.println("잘못된 선택입니다");
                   break;
           }
       }
   }
}