package studentservice.model.dto;

public class MemberDto {
//	멤버변수
	private int sno;
	private String sid;
	private String spwd;
	private String sname;
	
//	생성자
	public MemberDto(){}
	public MemberDto(int sno, String sid, String spwd, String sname) {
		super();
		this.sno = sno;
		this.sid = sid;
		this.spwd = spwd;
		this.sname = sname;
	}
	
//	메소드
	@Override
	public String toString() {
		return "MemberDto [sno=" + sno + ", sid=" + sid + ", spwd=" + spwd + ", sname=" + sname + "]";
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSpwd() {
		return spwd;
	}
	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	
	
}
