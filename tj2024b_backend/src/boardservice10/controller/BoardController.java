package boardservice10.controller;

import java.util.ArrayList;

import boardservice10.model.dao.BoardDao;
import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.BoardDto;
import boardservice10.model.dto.CategoryDto;

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
	
//  3. 전체 카테고리 출력
	public ArrayList<CategoryDto> category() {
		ArrayList<CategoryDto> result = BoardDao.getInstance().category();
		return result;
	} // f end
	
//	4. 게시물 쓰기
	public boolean write( BoardDto boardDto ) {
		int mno = MemberController.getInstance().getLogInMno();
		boardDto.setMno(mno);
		boolean result = BoardDao.getInstance().write(boardDto);
		return result;
	} // f end
	
//  5. 게시물 수정
	public boolean update( BoardDto boardDto ) {
		int logInMno = MemberController.getInstance().getLogInMno();
		int bno = boardDto.getBno();
		boolean result1 = BoardDao.getInstance().check(bno , logInMno);
		if( !result1 ) { return false; }
		boolean result2 = BoardDao.getInstance().update(boardDto);
		return result2;
	} // f end
	
//	6. 게시물 삭제
	public boolean delete( int bno ) {
		int logInMno = MemberController.getInstance().getLogInMno();
		boolean result1 = BoardDao.getInstance().check(bno , logInMno);
		if( !result1 ) { return false; }
		boolean result2 = BoardDao.getInstance().delete(bno);
		return result2;
	} //  f end
	
}
