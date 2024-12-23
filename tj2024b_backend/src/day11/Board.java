package day11;

public class Board {
//	* 클래서 멤버
//	1. 멤버변수
	private String title;
	private String content;
//	2. 생성자
	public Board() {};
	public Board( String title , String content ) {
		this.title = title;
		this.content = content;
	}
//	3. 메소드
	public String getTitle() { return this.title;}
	public void setTitle( String title ) { this.title = title;}
	public String getContent() { return this.content;}
	public void setContent( String content ) { this.content = content;}
	
}
