package day13.example.controller;

import day13.example.model.dao.WaitingDao;
import day13.example.model.dto.WaitingDto;

public class WaitingController {
	private WaitingController() {}
	private static WaitingController instance = new WaitingController();
	public static WaitingController getInstance() {
		return instance;
	}
	
//	1. 예약 제어 메소드
	public boolean write( WaitingDto waitingDto ) {
		boolean result = WaitingDao.getInstance().write(waitingDto);
		return result;
	}
//	2. 출력 제어 메소드
	public WaitingDto[] findAll() {
		WaitingDto[] result = WaitingDao.getInstance().findAll();
		return result;
	}
}
