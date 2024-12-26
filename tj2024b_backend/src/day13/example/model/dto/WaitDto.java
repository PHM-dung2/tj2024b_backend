package day13.example.model.dto;

public class WaitDto {
	private String phone;
	private String count;
	
	private WaitDto () {}
	private WaitDto waitDto( String phone , String count ) {
		this.phone = phone;
		this.count = count;
	}
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
