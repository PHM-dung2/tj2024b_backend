package day13.example.model.dao;

import day13.example.model.dto.WaitingDto;

public class WaitingDao {
	private WaitingDao () {}
	private static WaitingDao instance = new WaitingDao();
	public static WaitingDao getInstance() {
		return instance;
	}
//	멤버변수
	private WaitingDto[] waitDB = new WaitingDto[100];
//	1. 예약 제어 메소드
	public boolean write( WaitingDto waitingDto ) {
		for( int i = 0 ; i < waitDB.length ; i++ ) {
			if( waitDB[i] == null ) {
				waitDB[i] = waitingDto;
				return true;
			}
		}
		return false;
	}
	
//	2. 모든 글출력 제어 메소드
	public WaitingDto[] findAll() {
		return waitDB;
	}
}
