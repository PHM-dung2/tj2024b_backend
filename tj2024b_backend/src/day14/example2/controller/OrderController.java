package day14.example2.controller;

import java.util.ArrayList;

import day14.example2.model.dao.OrderDao;
import day14.example2.model.dto.OrderDto;

public class OrderController {
//	싱글톤
	private OrderController() {};
	private static OrderController instance = new OrderController();
	public static OrderController getInstance() {
		return instance;
	}
		
//	메소드
//	1. 상품 등록 페이지
	public boolean write( OrderDto orderDto ) {
		boolean result = OrderDao.getInstance().write(orderDto);
		return result;
	} // f end
	
//	2. 상품 출력 페이지
	public ArrayList<OrderDto> printAll() {
		ArrayList<OrderDto> result = OrderDao.getInstance().printAll();
		return result;
	} // f end
	
//	3. 상품 수정 페이지
	public boolean update( int uIndex , OrderDto orderDto ) {
		boolean result = OrderDao.getInstance().update( uIndex , orderDto );
		return result;
	} // f end
	
//	4. 상품 삭제 페이지
	public boolean delete( int dIndex ) {
		boolean result = OrderDao.getInstance().delete( dIndex );
		return result;
	} // f end
}
