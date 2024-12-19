package day09;

import java.util.Scanner;

public class WaitingService {

	void waitAdd( Scanner sc , Waiting[] waits ){
		System.out.println(">>> 대기명단 등록 >>>");	
		System.out.print("> 전화번호 : ");				String phone = sc.next();
		System.out.print("> 인원수 : ");				int count = sc.nextInt();
		
		Waiting wait = new Waiting();
		wait.phone = phone;
		wait.count = count;
		
		boolean saveState = false;
		for( int i = 0 ; i < waits.length ; i++ ) {
			if( waits[i] == null ) {
				waits[i] = wait;
				saveState = true;
				break;
			}
		} // for end
		
		if( saveState == true ) { System.out.println(">> 대기명단에 등록되었습니다.");}
		else { System.out.println(">> 대기명단에 등록 실패.");}
	} // m end
	
	void waitPrint( Waiting[] waits ) {
		for( int i = 0 ; i < waits.length ; i++ ) {
			Waiting wait = waits[i];
			if( waits[i] != null) {
				System.out.printf("순번 : %d 인원수 : %d 전화번호 : %s\n" , 
						i+1 , wait.count , wait.phone );
			} // if end
		} // for end
	} // m end
	
}
