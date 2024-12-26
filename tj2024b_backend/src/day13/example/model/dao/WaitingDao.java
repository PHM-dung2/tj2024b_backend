package day13.example.model.dao;

import day13.example.model.dto.WaitingDto;

public class WaitingDao {
	private WaitingDao() {}
	private static WaitingDao instance = new WaitingDao();
	public static WaitingDao getInstance() {
		return instance;
	}
	
	private WaitingDto[] waitDB = new WaitingDto[100];
	
	public boolean write( WaitingDto waitingDto ) {
		for( int i = 0 ; i < waitDB.length ; i++ ) {
			if( waitDB[i] == null ) {
				waitDB[i] = waitingDto;
				return true;
			} // if end
		} // for end
		return false;
	} // f end
	
	public WaitingDto[] findAll() {
		return waitDB;
	}
	
}
