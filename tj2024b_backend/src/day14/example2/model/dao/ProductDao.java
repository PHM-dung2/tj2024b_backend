package day14.example2.model.dao;

import java.util.ArrayList;

import day14.example2.model.dto.ProductDto;

public class ProductDao {
//	싱글톤
	private ProductDao() {
        // productDB 초기화 및 샘플 데이터 추가
        productDB = new ArrayList<>();
        productDB.add(new ProductDto("아메리카노", 1500));
        productDB.add(new ProductDto("원조커피", 2500));
        productDB.add(new ProductDto("카페라떼", 3500));
    }
	private static ProductDao instance = new ProductDao();
	public static ProductDao getInstance() {
		return instance;
	}
	
//	상품정보 리스트 선언
    private ArrayList<ProductDto> productDB = new ArrayList<>();
    
    
//	1. 상품 등록 페이지
	public boolean write( ProductDto productDto ) {
		productDB.add(productDto);
		return true;
	} // f end
	
//	2. 상품 출력 페이지
	public ArrayList<ProductDto> printAll() {
		return productDB;
	} // f end
	
//	3. 상품 수정 페이지
	public boolean update( int uIndex , ProductDto productDto ) {
		productDB.set( uIndex , productDto );
		return true;
	} // f end
	
//	4. 상품 삭제 페이지
	public boolean delete( int dIndex ) {
		productDB.remove( dIndex );
		return true;
	} // f end
	
	
}
