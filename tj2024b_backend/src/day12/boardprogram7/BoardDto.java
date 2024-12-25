package day12.boardprogram7;

public class BoardDto {
//	1. 멤버변수
	private String title;
	private String content;
	private String writer;
//	2. 생성자
	BoardDto(){}
	BoardDto( String title , String content , String writer ){
		this.title = title;
		this.content = content;
		this.writer = writer;		
	}
//	3. 멤버함수
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
