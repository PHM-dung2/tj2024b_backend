package day14.example2.view;

import java.util.ArrayList;
import java.util.Scanner;

import day14.example2.controller.OrderController;
import day14.example2.controller.ProductController;
import day14.example2.model.dao.ProductDao;
import day14.example2.model.dto.OrderDto;
import day14.example2.model.dto.ProductDto;

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
			System.out.println("\n===== 주문 페이지 =====");
			System.out.print("1.등록 2.출력 3.수정. 4.삭제 5.이전 페이지");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { write(); }
			else if( choose == 2 ) { printAll(); }
			else if( choose == 3 ) { update(); }
			else if( choose == 4 ) { delete(); }
			else if( choose == 5 ) { ProductView.getInstance().appStart(); }
		} // w end
	} // f end
	
//	1. 상품 등록 페이지
	public void write() {
		ProductView.getInstance().printAll();;
		
		System.out.println("\n===== 주문 등록 =====");
		System.out.print("상품번호 : ");	int pno = scan.nextInt();
		System.out.print("수량 : ");		int count = scan.nextInt();
		ArrayList<OrderDto> OrderList = OrderController.getInstance().printAll();
		ArrayList<ProductDto> ProductList = ProductController.getInstance().printAll();
		
		if( ProductList.size() < pno ) {
			System.out.println("존재하지 않는 상품번호입니다.");
			return;
		}
		if( count < 0 ) { 
			System.out.println("수량을 입력해주세요.");
			return; 
		}
		
		for( int i = 0 ; i < OrderList.size() ; i++ ) {
			if( OrderList.get(i).getPno() == pno ) { 
				count = OrderList.get(i).getCount() + count; 
				break;
			}
		} // for end
		OrderDto orderDto = new OrderDto( pno , count );
		boolean result = OrderController.getInstance().write(orderDto);
		
		if( result ) { System.out.println("상품을 담았습니다."); }
		
	} // f end
	
//	2. 상품 출력 페이지
	public void printAll() {
		System.out.println("\n===== 주문 내역 =====");
		System.out.println("번호\t제품명\t수량");
		ArrayList<OrderDto> result = OrderController.getInstance().printAll();
		int sum = 0;
		
		for( int i = 0 ; i < result.size() ; i++ ) {
			ArrayList<ProductDto> product = ProductDao.getInstance().printAll();
			OrderDto order = result.get(i);
			System.out.printf("%d\t%s\t%d\t\n" ,
					i , product.get(order.getPno()).getpName() , order.getCount() );
			sum += product.get(order.getPno()).getPrice() * order.getCount();
		} //  for end
		
		System.out.printf("총 가격은 %d원입니다.\n" , sum );
	} // f end
	
//	3. 상품 수정 페이지
	public void update() {
		printAll();
		System.out.println("\n===== 주문 수정 =====");
		System.out.print("상품번호 : ");	int uIndex = scan.nextInt();
		System.out.print("수량 : ");		int count = scan.nextInt();
		OrderDto orderDto = new OrderDto( uIndex , count );
		boolean result = OrderController.getInstance().update( uIndex , orderDto );
		
		if( result ) { System.out.println("주문내역을 수정했습니다."); }	
		else { System.out.println("주문내역 수정 실패"); }
	} // f end
	
//	4. 상품 삭제 페이지
	public void delete() {
		printAll();
		System.out.println("\n===== 주문 삭제 =====");
		System.out.print("상품번호 : ");	int dIndex = scan.nextInt();
		boolean result = OrderController.getInstance().delete( dIndex );
				
		if( result ) { System.out.println("주문내역을 삭제했습니다."); }	
		else { System.out.println("주문내역 삭제 실패"); }
	} // f end
	
}
