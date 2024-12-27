package day13.ex1.view;

import java.util.Scanner;

import day13.ex1.model.dao.WaitDao;
import day13.ex1.model.dto.WaitDto;

public class WaitView {
//	싱글톤
	private WaitView() {}
	private static WaitView instance = new WaitView();
	public static WaitView getIstance() {
		return instance;
	}
	
//	멤버변수
	private Scanner scan = new Scanner(System.in);
	
//	1. 출력
	public void index() {
		while(true) {
			System.out.println("===== 메인 페이지 =====");
			System.out.print("1.예약 2.대기명단 ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { write(); }
			else if( choose == 2 ) { findAll(); }
		} // w end
	} // f end
	
	public void write( ) {
		System.out.println("===== 예약 페이지 =====");
		System.out.print("전화번호 : ");		String phone = scan.next();
		System.out.print("인원수 : ");		String count = scan.next();
		WaitDto waitDto = new WaitDto( phone , count );
		boolean result = WaitDao.getInstance().write(waitDto);
		
		if( result ) {
			System.out.println("===== 예약 성공 =====");
		}else {
			System.out.println("===== 예약 실패 =====");
		}
		
	} // f end
	
	public void findAll() {
		System.out.println("===== 대기명단 페이지 =====");
		WaitDto[] result = WaitDao.getInstance().findAll();
		System.out.printf("대기인원 %-10s 인원수\n" , "전화번호" );
		for( int i = 0 ; i < result.length ; i++ ) {
			WaitDto wait = result[i];
			if( wait != null ) {
				System.out.printf("%-5d %-13s %s 명\n" , 
						i + 1 ,
						wait.getPhone() ,
						wait.getCount() );
			} // if end
		} // for end
	} // f end
	
}
