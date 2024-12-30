package practice.kiosk.moedel.dao;

import java.util.ArrayList;

import practice.moedel.dto.ProductDto;

public class ProductDao {
    // 싱글톤 패턴 구현
    private static ProductDao productDao = new ProductDao();
    private ArrayList<practice.kiosk.moedel.dto.ProductDto> products;
    
    // 생성자
    private ProductDao() {
        products = new ArrayList<>();
        // 초기 상품 데이터 추가
        products.add(new practice.kiosk.moedel.dto.ProductDto("아메리카노", 1500));
        products.add(new practice.kiosk.moedel.dto.ProductDto("카푸치노", 2500));
        products.add(new practice.kiosk.moedel.dto.ProductDto("카페라떼", 3000));
    }
    
    // 싱글톤 객체 반환 메소드
    public static ProductDao getInstance() {
        return productDao;
    }
    
    // Create: 상품 추가
    public boolean create(practice.kiosk.moedel.dto.ProductDto productDto) {
        try {
            return products.add(productDto);
        } catch (Exception e) {
            return false;
        }
    }
    
    // Read: 전체 상품 목록 반환
    public ArrayList<practice.kiosk.moedel.dto.ProductDto> printAll() {
        return products;
    }
    
    // Update: 상품 정보 수정
    public boolean update(int index, practice.kiosk.moedel.dto.ProductDto productDto) {
        try {
            products.set(index, productDto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    // Delete: 상품 삭제
    public boolean delete(int index) {
        try {
            products.remove(index);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

