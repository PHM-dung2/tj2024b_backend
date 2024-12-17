package day07;

import java.util.Scanner;

/*




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
				if( j1.id.equals(id) && j1.pw.equals(pw) ) {
					System.out.println("로그인성공");
				}else if( j2.id.equals(id) && j2.pw.equals(pw) ) {
			    	System.out.println("로그인성공");
			    }else if( j3.id.equals(id) && j3.pw.equals(pw) ) {
			    	System.out.println("로그인성공");
			   	}else { System.out.println("로그인실패");}
			}// if end
			
		}// w e
		
	}

}
