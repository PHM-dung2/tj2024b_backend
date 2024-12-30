package day14.example2.view;

import java.util.ArrayList;
import java.util.Scanner;

import day14.example2.controller.OrderController;
import day14.example2.model.dto.OrderDto;

public class OrderView {
//	싱글톤
	private OrderView() {};
	private static OrderView instance = new OrderView();
	public static OrderView getInstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	
//	메소드
//	0. 상품 페이지
	public void index() {
		while(true) {
			System.out.println("===== 주문 페이지 =====");
			System.out.print("1.등록 2.출력 3.수정. 4.삭제 ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { write(); }
			else if( choose == 2 ) { printAll(); }
			else if( choose == 3 ) { update(); }
			else if( choose == 4 ) { delete(); }
		} // w end
	} // f end
	
//	1. 상품 등록 페이지
	public void write() {
		System.out.println("===== 주문 등록 =====");
		System.out.print("상품번호 : ");	int pno = scan.nextInt();
		System.out.print("수량 : ");		int count = scan.nextInt();
		OrderDto orderDto = new OrderDto( pno , count );
		boolean result = OrderController.getInstance().write(orderDto);
		
		if( result ) { System.out.println("상품을 담았습니다."); }
		
	} // f end
	
//	2. 상품 출력 페이지
	public void printAll() {
		System.out.println("===== 주문 출력 =====");
		ArrayList<OrderDto> result = ;
		
		for( int i = 0 ; i < result.size() ; i++ ) {
			
		} //  for end
	} // f end
	
//	3. 상품 수정 페이지
	public void update() {
		
	} // f end
	
//	4. 상품 삭제 페이지
	public void delete() {
		
	} // f end
	
}
