package day14.example2.model.dto;

public class OrderDto {
	private int pno;
	private int count;
	
	public OrderDto(){}
	public OrderDto( int pno , int count ){
		this.pno = pno;
		this.count = count;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
