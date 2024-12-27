package day14.example2.controller;

import java.util.ArrayList;

import day14.example2.model.dao.ProductDao;
import day14.example2.model.dto.ProductDto;

public class ProductController {
//	싱글톤
	private ProductController() {}
	private static ProductController instance = new ProductController();
	public static ProductController getInstance() {
		return instance;
	}
		
//	1. 상품 등록 페이지
	public boolean write( ProductDto productDto ) {
		boolean result = ProductDao.getInstance().write(productDto);
		return result;
	} // f end
	
//	2. 상품 출력 페이지
	public ArrayList<ProductDto> printAll() {
		ArrayList<ProductDto> result = ProductDao.getInstance().printAll();
		return result;
	} // f end
	
//	3. 상품 수정 페이지
	public boolean update( int uIndex , ProductDto productDto ) {
		boolean result = ProductDao.getInstance().update(uIndex , productDto);
		return result;
	} // f end
	
//	4. 상품 삭제 페이지
	public boolean delete( int dIndex ) {
		boolean result = ProductDao.getInstance().delete(dIndex);
		return result;
	} // f end
}
