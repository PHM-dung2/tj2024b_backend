package day14.boardProgram9.controller;

import java.util.ArrayList;

import day14.boardProgram9.model.dao.BoardDao;
import day14.boardProgram9.model.dto.BoardDto;

public class BoardController {
//	싱글톤
	private BoardController() {}
	private static BoardController instance = new BoardController();
	public static BoardController getInstance() {
		return instance;
	}
	
//	메소드
//	1. 게시물 쓰기 제어 함수
	public boolean create( BoardDto boardDto ) {
//		[1] 매개변수로 받은 값들을 DAO에게 전달하여 처리결과 받는다.
		Boolean result = BoardDao.getIstance().create(boardDto);
//		[2] 처리 결과를 VIEW에게 반환한다.
		return result;
	} // f end
	
//	2. 게시물 출력 제어 함수
	public ArrayList<BoardDto> readAll() {
		ArrayList<BoardDto> result = BoardDao.getIstance().readAll();
		return result;
	} // f end
	
//	3. 게시물 수정 제어 함수
	public boolean update( int uIndex , BoardDto boardDto  ) {
		Boolean result = BoardDao.getIstance().update( uIndex , boardDto);
		return result;
	} // f end
	
//	4. 게시물 삭제 제어 함수
	public boolean delete( int dIndex ) {
		boolean result = BoardDao.getIstance().delete(dIndex);
		return result;
	} // f end
	
	
}
