package day14.example2.model.dao;

import java.util.ArrayList;

import day14.example2.controller.OrderController;
import day14.example2.model.dto.OrderDto;

public class OrderDao {
//	싱글톤
	private OrderDao() {};
	private static OrderDao instance = new OrderDao();
	public static OrderDao getInstance() {
		return instance;
	}
	
	private ArrayList<OrderDto> OrderDB = new ArrayList<>();
	
//	메소드
//	1. 상품 등록 페이지
	public boolean write( OrderDto orderDto ) {
		for( int i = 0 ; i < OrderDB.size() ; i++ ) {
			OrderDto order = OrderDB.get(i);
			if( order.getPno() == orderDto.getPno() ) {
				OrderDB.set(i, order);
				break;
			}else { OrderDB.add(orderDto); }
		}
		return true;
	} // f end
	
//	2. 상품 출력 페이지
	public ArrayList<OrderDto> printAll() {
		return OrderDB;
	} // f end
	
//	3. 상품 수정 페이지
	public boolean update( int uIndex , OrderDto orderDto ) {
		OrderDB.set( uIndex , orderDto );
		return true;
	} // f end
	
//	4. 상품 삭제 페이지
	public boolean delete( int dIndex ) {
		OrderDB.remove( dIndex );
		return true;
	} // f end
}
