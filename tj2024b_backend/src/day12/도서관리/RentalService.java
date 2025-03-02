package day12.도서관리;

import java.time.LocalDate;
import java.util.Scanner;

public class RentalService {
	public static void bookRental( Scanner scan , MemberDto[] members , BookDto[] books , LocalDate returnDate ) {
		System.out.println("\n===== 도서대여 =====");
		System.out.print("도서번호 : ");	int bno = scan.nextInt();
		
		boolean bookState = true;
		for( int i = 0 ; i < books.length ; i++ ) {
			if( books[i] != null && i + 1 == bno ) {
				bookState = false;
				if( books[i].getReturnDate() != null ) {
					System.out.println("대여중인 도서입니다.");
					break;
				}else {
					books[i].setReturnDate( returnDate );
					books[i].setId( LogInManager.getLogInId() );
					System.out.printf("\n도서(%s)의 대여가 완료되었습니다.\n" , books[i].getTitle() );
					System.out.printf("반납날짜는 %s입니다.\n" , books[i].getReturnDate() );
					break;
				} // if end
			} // if end
		} // for end
		
		if( bookState ) { System.out.println("해당 도서번호에 도서가 존재하지 않습니다."); }
		
	} // m end
	
	public static void bookReturn( Scanner scan , BookDto[] books , LocalDate date ) {
		System.out.println("\n===== 도서반납 =====");
		System.out.print("도서번호 : ");	int bno = scan.nextInt();
		
		if( books[bno-1] != null ) {
			if( !books[bno-1].getId().equals( LogInManager.getLogInId() ) ) {
				if( books[bno-1].getReturnDate() != null ) {
				System.out.println("다른 사람이 대여한 도서입니다.");
				return;
				}
			}else if( !books[bno-1].getId().equals( "" ) ){
				System.out.println("대여중인 도서입니다.");
				return;
			}else {
				System.out.println("대여중인 도서가 아닙니다.");
				return;
			}
		}else {
			System.out.println("해당 도서번호에 도서가 존재하지 않습니다.");
			return;
		}
		
		for( int i = 0 ; i < books.length ; i++ ) {
			if( books[i] != null ) {
				if( books[i].getReturnDate() != null ) {
					if( books[i].getId().equals( LogInManager.getLogInId() ) ) {
						if( i + 1 == bno ){
//							연체료?
							books[i].setReturnDate( null );
							books[i].setId("");
							System.out.println("반납이 완료되었습니다.");
							return;
						} // if end
					} // if end
				} // if end
			} // if end
		} // for end
	} // m end
	
	public static void bookList( MemberDto[] members , BookDto[] books ) {
		System.out.println("\n===== 대여현황 =====");
		System.out.printf("> %10s님\n" , LogInManager.getLogInId() );
		System.out.printf("\n도서번호\t%-15s\t글쓴이\t%-5s\t반납날짜\n" , "도서명" , "출판사");
		
		boolean bookState = true;
		for( int i = 0 ; i < books.length ; i++ ) {
			if( books[i] != null && books[i].getId().equals( LogInManager.getLogInId() ) ) {
				System.out.printf("%d\t%-15s\t%s\t%-5s\t%s\n" ,
						i + 1 ,
						books[i].getTitle() ,
						books[i].getWriter() ,
						books[i].getPublisher() ,
						books[i].getReturnDate());
				bookState = false;
			}
		} // for end
		
		if( bookState ) { System.out.println("대여현황이 존재하지 않습니다."); }
	} // m end
}
