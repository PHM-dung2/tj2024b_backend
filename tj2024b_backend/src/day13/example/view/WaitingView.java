package day13.example.view;

import java.util.Scanner;

import day13.example.model.dao.WaitingDao;
import day13.example.model.dto.WaitingDto;

public class WaitingView {
//	싱글톤
	private WaitingView() {}
	private static WaitingView instance = new WaitingView();
	public static WaitingView getInstance() {
		return instance;
	}
	
//	멤버변수
	private Scanner scan = new Scanner(System.in);
	
//	1. 대기인원 입출력 메소드
	public void index() {
		while(true) {
			System.out.println("===== 메인페이지 =====");
			System.out.print("1. 예약 2. 대기인원 ");
			int choose = scan.nextInt();
			
			if( choose == 1 ) { write(); }
			else if( choose == 2 ) { findAll(); }
		} // w end
	} // f end
	
	public void write() {
//		[1] 입력
		System.out.println("===== 예약 페이지 =====");
		System.out.print("전화번호 : ");	 	String phone = scan.next();
		System.out.print("인원수 : ");	 	String count = scan.next();
//		[2] 객체화
		WaitingDto waitingDto = new WaitingDto(phone , count);
//		[3] 컨트롤러 객체 저장
		boolean result = WaitingDao.getInstance().write(waitingDto);
//		[4] 응답받기
		if( result ) {
			System.out.println("===== 예약 성공 =====");
		}else {
			System.out.println("===== 예약 실패 =====");
		}
	} // f end
	
	public void findAll() {
		System.out.println("===== 대기명단 페이지 =====");
//		[1] 컨트롤러 게시물정보 요청 결과받기
		WaitingDto[] result = WaitingDao.getInstance().findAll();
//		[2] 요청 결과 출력
		System.out.printf("대기인원 %-10s 인원수\n" , "전화번호" );
		for( int i = 0 ; i < result.length ; i++ ) {
			WaitingDto wait = result[i];
			if( wait != null ) {
				System.out.printf("%-5d %-13s %s 명\n" , 
						i + 1 ,
						wait.getPhone() ,
						wait.getCount() );
			} // if end
		} // for end
	} // f end
}
