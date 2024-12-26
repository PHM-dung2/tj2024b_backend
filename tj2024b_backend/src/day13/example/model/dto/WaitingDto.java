package day13.example.model.dto;

public class WaitingDto {
//	1. 멤버변수
	private String phone;
	private String count;
	
	public WaitingDto() {}
//	2. 생성자
	public WaitingDto( String phone , String count ) {
		this.phone = phone;
		this.count = count;
	} // f end
//	3. 메소드
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
}
