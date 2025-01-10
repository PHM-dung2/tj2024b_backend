package studentservice.model.dto;

public class StudentDto {
//	멤버변수
	private int scno;
	private int kor;
	private int eng;
	private int math;
	private int sno;
	private String sname;
//	생성자
	public StudentDto() {}
	public StudentDto(int scno, int kor, int eng, int math, int sno, String sname) {
		super();
		this.scno = scno;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sno = sno;
		this.sname = sname;
	}

//	메소드
	@Override
	public String toString() {
		return "StudentDto [scno=" + scno + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sno=" + sno
				+ ", sname=" + sname + "]";
	}
	public int getScno() {
		return scno;
	}
	public void setScno(int scno) {
		this.scno = scno;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	

	
	
	
}
