package day12.도서관리;

import java.time.LocalDate;

public class BookDto {
//	멤버변수
	private String title;
	private String writer;
	private String publisher;
	private LocalDate returnDate;
	private String id;
//	생성자
	BookDto(){}
	BookDto( String title , String writer , String publisher , LocalDate returnDate , String id){
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;		
		this.returnDate = returnDate;		
		this.id = id;
	}
//	멤버함수
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate retrunDate) {
		this.returnDate = retrunDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
