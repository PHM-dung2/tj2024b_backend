package day08;

public class Order {

	String no;
	String id;
	String date;
	String name;
	String pno;
	String address;
	
	public static void main(String[] args) {
		
		Order o1 = new Order();
		o1.no = "201803120001";
		o1.id = "abc123";
		o1.date = "2018년 3월 12일";
		o1.name = "홍길순";
		o1.pno = "PD0345-12";
		o1.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + o1.no);
		System.out.println("주문자 아이디 : " + o1.id);
		System.out.println("주문 날짜 : " + o1.date);
		System.out.println("주문자 이름 : " + o1.name);
		System.out.println("주문 상품 번호 : " + o1.pno);
		System.out.println("배송주소 : " + o1.address);
		
	}
	
}
