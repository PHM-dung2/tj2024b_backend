package day14.example2.model.dto;

public class ProductDto {
	private String pName;
	private int price;
	
	public ProductDto() {}
	public ProductDto( String pName , int price ) {
		this.pName = pName;
		this.price = price;		
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
