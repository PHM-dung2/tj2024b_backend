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
		OrderDB.add(orderDto);
		return true;
	} // f end
	
//	2. 상품 출력 페이지
	public ArrayList<OrderDto> printAll() {
		return OrderDB;
	} // f end
	
//	3. 상품 수정 페이지
	public void update() {
		
	} // f end
	
//	4. 상품 삭제 페이지
	public void delete() {
		
	} // f end
}
