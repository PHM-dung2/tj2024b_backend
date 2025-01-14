package boardservice10.model.dto;

public class CategoryDto {
	private int cno;
	private String cname;
	private String cdate;
	
	public CategoryDto() {}
	public CategoryDto(int cno, String cname, String cdate) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.cdate = cdate;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	
	
	
	
}
