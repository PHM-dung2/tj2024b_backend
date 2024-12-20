package day10;

public class Join {
	private String id;
	private String pw;
	private String nName;
	
	public Join() {};
	public Join( String id , String pw , String nName ) {
		this.id = id;
		this.pw = pw;
		this.nName = nName;
	} // m end
	
	public String getId() { return this.id; }
	public void setId( String id ) { this.id = id; }	
	public String getPw() { return this.pw; }
	public void setPw( String pw ) { this.pw = pw; }	
	public String getNName() { return this.nName; }
	public void setNName( String nName ) { this.nName = nName; }	

	
}
