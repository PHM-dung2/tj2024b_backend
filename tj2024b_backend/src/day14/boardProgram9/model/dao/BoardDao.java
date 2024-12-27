package day14.boardProgram9.model.dao;

import java.util.ArrayList;

import day14.boardProgram9.model.dto.BoardDto;

public class BoardDao {
//	싱글톤
	private BoardDao() {}
	private static BoardDao instance = new BoardDao();
	public static BoardDao getIstance() {
		return instance;
	}
	
//	+ 게시물 리스트 선언
	private ArrayList<BoardDto> boards = new ArrayList<>();
	
//	메소드
//	1. 게시물 쓰기 페이지 함수
	public boolean create( BoardDto boardDto ) {
//		ArrayList는 빈공간 즉. null인 공간이 없기 때문에 for문 안돌려도 된다!
		boards.add( boardDto );
		return true;
	} // f end
	
//	2. 게시물 출력 페이지 함수
	public ArrayList<BoardDto> readAll() {
		return boards;
	} // f end
	
//	3. 게시물 수정 페이지 함수
	public Boolean update( int uIndex , BoardDto boardDto  ) {
		boards.remove(uIndex);
		boards.add(uIndex, boardDto);
		return true;
	} // f end
	
//	4. 게시물 삭제 페이지 함수
	public boolean delete( int dIndex ) {
		if( dIndex > boards.size() -1 ) {
//			존재하지 않는 인덱스를 요청하면
			return false;
		}
		boards.remove(dIndex);
		return true;
	} // f end
	
	
}
