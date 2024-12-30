package practice.kiosk;

import java.util.Scanner;
import practice.kiosk.*;
import practice.kiosk.view.ProductView;

public class AppStart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductView productView = ProductView.getInstance();

        while(true) {
            System.out.println("\n=== 카페 관리 시스템 ===");
            System.out.println("1. 상품 관리");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            int menu = scanner.nextInt();

            if(menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch(menu) {
                case 1:
                    productManagement(scanner, productView);
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

        scanner.close();
    }  // main end

    // 상품 관리 메뉴
    private static void productManagement(Scanner scanner, ProductView productView) {
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

}  // class end