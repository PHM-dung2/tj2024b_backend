package day12.boardprogram7;

public class MemberDto {
//	1. 멤버변수
	private String id;
	private String pw;
	private String name;
//	2. 생성자
	public MemberDto() {}
	public MemberDto( String id , String pw , String name ) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
//	3. 메소드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
