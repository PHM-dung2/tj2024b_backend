package boardservice10.controller;

import java.util.ArrayList;

import boardservice10.model.dao.BoardDao;
import boardservice10.model.dto.BoardDto;

public class BoardController {
//	싱글톤
	private BoardController() {}
	private static BoardController instance = new BoardController();
	public static BoardController getInstance() {
		return instance;
	}
	
//	메소드
//	1. 전체 게시물 조회 화면
	public ArrayList<BoardDto> findAll() {
		ArrayList<BoardDto> result = BoardDao.getInstance().findAll();
		return result;
	} // f end
	
//	2. 개별(1개) 게시물 조회 화면
	public BoardDto findById( int bno ) {
		BoardDto result = BoardDao.getInstance().findById(bno);
		return result;		
	} // f end
	
}
