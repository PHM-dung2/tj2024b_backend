package day12.도서관리;

import java.time.LocalDate;
import java.util.Scanner;

public class BookService {

	public static void bookAdd( Scanner scan , BookDto[] books ) {
		System.out.println("\n===== 도서등록 ======");
		System.out.print("도서명 : ");		String title = scan.next();
		System.out.print("저자명 : ");		String writer = scan.next();
		System.out.print("출판사 : ");		String publisher = scan.next();
                
		BookDto bookDto = new BookDto( title , writer , publisher , null , "");
		
		boolean bookState = false;
		for( int i = 0 ; i < books.length ; i++ ) {
			if( books[i] != null ) {
				if( books[i].getTitle().equals(title) && 
					books[i].getWriter().equals(writer) && 
					books[i].getPublisher().equals(publisher) ) {
					System.out.println("등록된 도서입니다.");
				}
			}else {
				books[i] = bookDto;
				bookState = true;
				break;
			}
		} // for end
		
		if( bookState ) { System.out.println("\n도서 등록이 완료되었습니다."); }
	} // m end
	
	public static void bookList( BookDto[] books ) {
		System.out.printf("\n도서번호\t%-15s\t글쓴이\t%-5s\t반납날짜\n" , "도서명" , "출판사");
		for( int i = 0 ; i < books.length ; i++ ) {
			if( books[i] != null ) {
				System.out.printf("%d\t%-15s\t%s\t%-5s\t%s\n" ,
						i + 1 ,
						books[i].getTitle() ,
						books[i].getWriter() ,
						books[i].getPublisher() ,
						books[i].getReturnDate());
			} // if end
		} // for end
	} // m end
		
}
