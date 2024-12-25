package day12.도서관리;

public class MemberDto {
//	멤버변수
	private String id;
	private String pw;
	private int type ;
//	생성자
	MemberDto(){}
	MemberDto( String id , String pw , int type ){
		this.id = id;
		this.pw = pw;
		this.type = type;
	}
//	메소드
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
