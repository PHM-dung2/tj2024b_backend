package day14.example2;

import java.util.Scanner;

import day14.example2.view.ProductView;

/*
 	과제 주제 : 자유 주제로 CRUD 프로그램 구현 하기
 	[ 조건 ]
		1. MVC 디자인 패턴 사용 ( 로그인상태는 controller )
		2. 싱글톤 디자인 패턴 사용
		3. ArrayList 클래스 사용
		4. C(저장)R(출력)U(수정)D(삭제)
	[ 설계 순서 ] , 캡쳐 해서 카톡방에 제출
		https://app.diagrams.net/
		1. 선정한 주제에 따른 FLOW CHART 그리기
		2. 선정한 주제에 따른 클래스 다이어그램 작성하기 , 함수의 매개변수/반환타입 , + public - private
	[ 구현 순서 ] , 코드 구현 git 링크 제출
		1. 패키지 구성
		2. 클래스 만들기 , 클래스 내부 코드 추후에
		3. DTO클래스 먼저 코드 구현하기
		4. 싱글톤 패턴을 사용할 클래스들에 싱글톤 코드 작성
		5. 기능별 VIEW -> CONTROLLER -> DAO 순서대로 함수 구현
		
*/
public class Example2 {

	public static void main(String[] args) {
		while(true) {
			System.out.println("===== 카페 키오스크 =====");
			System.out.print("1.상품 페이지 2.주문 페이지 ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if( choose == 1 ) { ProductView.getInstance().index(); }
//			else if( choose == 2 ) { OrderView.getInstance().index(); }
			
			scan.close();
		} // w end
		
	}
	
}
