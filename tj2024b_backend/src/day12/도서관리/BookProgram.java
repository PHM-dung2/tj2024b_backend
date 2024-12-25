package day12.도서관리;

import java.time.LocalDate;
import java.util.Scanner;

/*
	[3] 혼자 실습 , 도서관리 프로그램.
	   1. 초기메뉴 : 회원가입 , 로그인 제공합니다.
	   2. 회원가입시 일반인 인지 관리자 인지 구분 하여 가입을 진행합니다.
	   3. 로그인시 일반인 인지 관리자 인지 구분하여 로그인을 진행합니다.
	   4. 로그인 성공시 
	      4-1 관리자인경우 메뉴 : 1.도서등록 2.도서목록 제공 합니다.
	      4-2 일반인경우 메뉴 : 1. 도서대여 2. 도서반납 3.대여현황 제공 합니다.
	   5. 관리자는 도서정보를 입력받아 도서등록을 처리 합니다.
	   6. 관리자는 현재 등록된 모든 도서목록을 출력 합니다.
	   7. 일반인은 도서대여시 대여할 도서번호를 입력받아 대여가 가능하면 대여를 진행합니다.
	   8. 일반인은 도서반납시 현재 내가 대여한 도서번호를 입력하여 반납을 진행합니다.
	   9. 일반인은 내가 대여한 모든 도서 현황을 출력합니다.
	   10. 로그아웃을 제공 합니다.
	   11. 회원과 도서 정보 멤버변수는 각 3개 이상씩 하여 진행합니다.
	   * 피드백이 필요할 경우 카카오톡방에 제출
 */

public class BookProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MemberDto[] members = new MemberDto[100];
		BookDto[] books = new BookDto[100];
//		현재 날짜 함수(년 월 일 만 출력)
		LocalDate date = LocalDate.now();
//		날짜 더하는 함수
		LocalDate returnDate = date.plusWeeks(1);
		
//		도서목록 초기화
		books[0] = new BookDto( "소년이 온다" , "한강" , "창비" , null , "" );
	    books[1] = new BookDto( "작별하지 않는다" , "한강" , "문학동네" , null , "" );
	    books[2] = new BookDto( "내가 나라서 정말 좋아" , "김지원" , "길벗" , null , "" );
		
		while(true) {
			System.out.println("\n===== 도서관리 시스템 =====");
			System.out.print("1. 회원가입 2. 로그인 ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) {
				MemberService.signUp( scan , members );
			}else if( choose == 2 ) {
				MemberService.logIn( scan , members );
//				관리자 로그인
				while( LogInManager.getLogInType() > 0 ) {
					if( LogInManager.getLogInType() == 1 ) {
						System.out.println("\n===== 관리자 메뉴 ======");
						System.out.print("1. 도서등록 2. 도서목록 3. 로그아웃 " );
						int bChoose = scan.nextInt();
						if( bChoose == 1 ) {
							BookService.bookAdd( scan , books );
						}else if( bChoose == 2 ) {
							BookService.bookList( books );
						}else if( bChoose == 3 ) {
							MemberService.logOut();
							break;
						} // if end
//				일반인 로그인
					}else if( LogInManager.getLogInType() == 2 ) {
						System.out.println("\n===== 일반인 메뉴 ======");
						System.out.print("1. 도서대여 2. 도서반납 3. 대여현황 4. 로그아웃 " );
						int bChoose = scan.nextInt();
						if( bChoose == 1 ) {
							RentalService.bookRental( scan, members, books, returnDate );
						}else if( bChoose == 2 ) {
							RentalService.bookReturn(scan, books, returnDate);
						}else if( bChoose == 3 ) {
							RentalService.bookList( members , books );
						}else if( bChoose == 4 ) {
							MemberService.logOut();
							break;
						}
					} // if end
				} // w end
			} // if end
		} // w end
		
	}

}
