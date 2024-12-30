package practice.kiosk.view;


	// ProductView.java
	import java.util.ArrayList;
	import java.util.Scanner;

import practice.kiosk.controller.ProductController;
import practice.kiosk.moedel.dao.ProductDao;
import practice.kiosk.moedel.dto.*;

	public class ProductView {
	    private static ProductView productView = new ProductView();
	  
	    private Scanner scanner = new Scanner(System.in);
	    
	    private ProductView() { }
	    
	    public static ProductView getInstance() {
	        return productView;
	    }
	    
	    public static void productManagement(Scanner scanner, ProductView productView) {
	        while(true) {
	            System.out.println("\n=== 상품 관리 ===");
	            System.out.println("1. 상품 등록");
	            System.out.println("2. 상품 목록");
	            System.out.println("3. 상품 수정");
	            System.out.println("4. 상품 삭제");
	            System.out.println("0. 이전 메뉴");
	            System.out.print("메뉴 선택: ");
	            
	            int menu = scanner.nextInt();
	            
	            if(menu == 0) {
	                break;
	            }
	            
	            switch(menu) {
	                case 1:
	                    productView.create();
	                    break;
	                case 2:
	                    productView.printAll();
	                    break;
	                case 3:
	                    productView.update();
	                    break;
	                case 4:
	                    productView.delete();
	                    break;
	                default:
	                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
	            }
	        }
	    }
	    
	    // 상품 등록
	    public void create() {
	        System.out.println("\n[상품 등록]");
	        System.out.print("상품명 입력: ");
	        String name = scanner.next();
	        System.out.print("가격 입력: ");
	        int price = scanner.nextInt();
	        
	        practice.kiosk.moedel.dto.ProductDto productDto = new practice.kiosk.moedel.dto.ProductDto(name, price);
	        boolean result = ProductDao.getInstance().create(productDto);
	        
	        if(result) {
	            System.out.println("상품이 등록되었습니다.");
	        } else {
	            System.out.println("상품 등록에 실패했습니다.");
	        }
	    }
	    
	    // 상품 목록 출력
	    public void printAll() {
	        System.out.println("\n[상품 목록]");
	        ArrayList<practice.kiosk.moedel.dto.ProductDto> products = ProductDao.getInstance().printAll();
	        
	        if(products.isEmpty()) {
	            System.out.println("등록된 상품이 없습니다.");
	            return;
	        }
	        
	        for(int i = 0; i < products.size(); i++) {
	            System.out.println(i + ". " + products.get(i));
	        }
	    }
	    
	    // 상품 정보 수정
	    public void update() {
	        System.out.println("\n[상품 수정]");
	        printAll();
	        
	        System.out.print("수정할 상품 번호 선택: ");
	        int index = scanner.nextInt();
	        
	        System.out.print("새로운 상품명 입력: ");
	        String name = scanner.next();
	        System.out.print("새로운 가격 입력: ");
	        int price = scanner.nextInt();
	        
	        practice.kiosk.moedel.dto.ProductDto productDto = new practice.kiosk.moedel.dto.ProductDto(name, price);
	        boolean result = ProductController.getInstance().update(index, productDto);
	        
	        if(result) {
	            System.out.println("상품이 수정되었습니다.");
	        } else {
	            System.out.println("상품 수정에 실패했습니다.");
	        }
	    }
	    
	    // 상품 삭제
	    public void delete() {
	        System.out.println("\n[상품 삭제]");
	        printAll();
	        
	        System.out.print("삭제할 상품 번호 선택: ");
	        int index = scanner.nextInt();
	        
	        boolean result = ProductController.getInstance().delete(index);
	        
	        if(result) {
	            System.out.println("상품이 삭제되었습니다.");
	        } else {
	            System.out.println("상품 삭제에 실패했습니다.");
	        }
	    }
	}//class end

