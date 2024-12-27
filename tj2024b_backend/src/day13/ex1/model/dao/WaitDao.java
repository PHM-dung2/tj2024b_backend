package day13.ex1.model.dao;

import day13.ex1.model.dto.WaitDto;

public class WaitDao {
//	싱글톤
	private WaitDao() {}
	private static WaitDao instance = new WaitDao();
	public static WaitDao getInstance() {
		return instance;
	}
	
	private WaitDto[] waitDB = new WaitDto[100];
	
//	1. 입력
	public boolean write( WaitDto waitDto ) {
		for( int i = 0 ; i < waitDB.length ; i++ ) {
			if( waitDB[i] == null ) {
				waitDB[i] = waitDto;
				return true;
			} // if end
		} // for end
		
		return false;
	} // f end
	
//	2. 출력
	public WaitDto[] findAll() {
		return waitDB;
	}
}
