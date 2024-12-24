package day12.도서관리;

public class Join {
//	멤버변수
	private String id;
	private String pw;
	private String type ;
//	생성자
	Join(){}
	Join( String id , String pw , String type ){
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
