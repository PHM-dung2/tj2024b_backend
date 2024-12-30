package practice.kiosk.moedel.dto;

public class ProductDto {
    // 필드
    private String pName;    // 상품명
    private int price;       // 가격

    // 기본 생성자
    public ProductDto() {}

    // 매개변수가 있는 생성자
    public ProductDto(String pName, int price) {
        this.pName = pName;
        this.price = price;
    }

    // Getter 메소드
    public String getPName() {
        return this.pName;
    }

    public int getPrice() {
        return this.price;
    }

    // Setter 메소드
    public void setPName(String pName) {
        this.pName = pName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString 메소드 오버라이드
    
    public String toString() {
        return "상품명: " + pName + ", 가격: " + price + "원";
    }
}//class end

