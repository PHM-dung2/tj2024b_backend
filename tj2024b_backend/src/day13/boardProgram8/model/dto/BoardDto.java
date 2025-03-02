package day13.boardProgram8.model.dto;

public class BoardDto {
//	- 싱글톤X : 각 게시물 정보를 저장할 목적 이므로 서로 고유한 객체가 필요하다.
//	1. 멤버변수
	private String title;
	private String content;
	private String writer;
//	2. 생성자
	public BoardDto() {}
	public BoardDto( String title , String content , String writer ) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
//	3. 메소드
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
