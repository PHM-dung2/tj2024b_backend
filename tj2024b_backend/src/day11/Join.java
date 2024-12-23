package day11;

public class Join {
//	* 클래스 멤버
//	1. 멤버변수
	private int no;
	private String id;
	private String pw;
//	2. 생성자
	public Join() {};
	public Join( int no , String id , String pw ) {
		this.no = no;
		this.id = id;
		this.pw = pw;
	}
//	3. 메소드
	public int getNo() { return this.no;}
	public void setNo( int no ) { this.no = no;}
	public String getID() { return this.id;}
	public void setID( String id ) { this.id = id;}
	public String getPW() { return this.pw;}
	public void setPW( String pw ) { this.pw = pw;}
	
}
