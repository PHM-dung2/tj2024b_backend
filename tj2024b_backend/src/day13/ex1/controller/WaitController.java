package day13.ex1.controller;

import day13.ex1.model.dao.WaitDao;
import day13.ex1.model.dto.WaitDto;

public class WaitController {
//	싱글톤
	private WaitController() {}
	private static WaitController instance = new WaitController();
	public static WaitController getInstance() {
		return instance;
	}
	
//	1. 입력 메소드
	public boolean write( WaitDto waitDto ) {
		boolean result = WaitDao.getInstance().write( waitDto );
		return result;
	} // f end
//	2. 출력 메소드
	public WaitDto[] findAll() {
		WaitDto[] result = WaitDao.getInstance().findAll();
		return result;
	}
	
}
