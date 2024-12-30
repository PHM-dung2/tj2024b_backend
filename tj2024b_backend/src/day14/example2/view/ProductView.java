package day14.example2.view;

import java.util.ArrayList;
import java.util.Scanner;

import day14.example2.controller.ProductController;
import day14.example2.model.dto.ProductDto;

public class ProductView {
//	싱글톤
	private ProductView() {}
	private static ProductView instance = new ProductView();
	public static ProductView getInstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	
//	0. 상품 선택 페이지
	public void index() {
		while(true) {
			System.out.println("===== 상품페이지 =====");
			System.out.print("1.등록 2.출력 3.수정 4.삭제 ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { write(); }
			else if( choose == 2 ) { printAll(); }
			else if( choose == 3 ) { update(); }
			else if( choose == 4 ) { delete(); }
		} // w end
	}
	
//	1. 상품 등록 페이지
	public void write() {
		System.out.println("===== 상품 등록 =====");
		System.out.print("상품명 : ");	String pName = scan.next();
		System.out.print("가격 : ");		int price = scan.nextInt();
		ProductDto productDto = new ProductDto( pName , price );
		boolean result = ProductController.getInstance().write(productDto);
		
		if( result ) { System.out.println("상품이 등록되었습니다."); }
		else { System.out.println("중복된 상품입니다."); }
		
		
	} // f end
	
//	2. 상품 출력 페이지
	public void printAll() {
		System.out.println("===== 상품 출력 =====");
		System.out.println("상품번호\t상품명\t\t가격 ");
		ArrayList<ProductDto> result = ProductController.getInstance().printAll();
		
		for( int i = 0 ; i < result.size() ; i++ ) {
			ProductDto product = result.get(i);
			System.out.printf("%d\t%s\t\t%d\n" , 
					i , product.getpName() , product.getPrice() );
		} // for end
		
	} // f end
	
//	3. 상품 수정 페이지
	public void update() {
		System.out.println("===== 상품 수정 =====");
		System.out.print("상품번호 : ");	int uIndex = scan.nextInt();
		System.out.print("상품명 : ");	String pName = scan.next();
		System.out.print("가격 : ");		int price = scan.nextInt();
		ProductDto productDto = new ProductDto( pName , price );
		boolean result = ProductController.getInstance().update(uIndex , productDto);
		
		if( result ) { System.out.println("상품정보가 수정되었습니다."); }
		else { System.out.println("없는 상품번호업니다."); }
	} // f end
	
//	4. 상품 삭제 페이지
	public void delete() {
		System.out.println("===== 상품 삭제 =====");
		System.out.print("상품번호 : ");	int dIndex = scan.nextInt();
		boolean result = ProductController.getInstance().delete(dIndex);
		
		if( result ) { System.out.println("상품정보가 삭제되었습니다."); }
		else { System.out.println("없는 상품번호업니다."); }
	} // f end
}
