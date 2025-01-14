package boardservice10.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import boardservice10.controller.MemberController;
import boardservice10.model.dto.BoardDto;
import boardservice10.model.dto.CategoryDto;

public class BoardDao extends Dao {
//	싱글톤
	private BoardDao() {}
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance() {
		return instance;
	}
	
//	메소드
//	1. 전체 게시물 SQL 처리 메소드
	public ArrayList<BoardDto> findAll() {
//		* 조회된 레코드(=BoardDto) 한개씩 저장하여 여러개 레코드(=BoardDto)를 저장하는 리스트 객체
		ArrayList<BoardDto> list = new ArrayList<>();
		
		try {
			String sql = "select b.* , c.cname , m.mid from board b "
					+ "inner join member m on b.mno = m.mno "
					+ "inner join category c on b.cno = c.cno";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() ) {
//				레코드 : DB테이블의 가로/행 데이터
//				조회된 결과 레코드1개 <---> 인스턴스(DTO)1개 ORM
//				레코드 여러개 <---> []1개 또는 ArrayList 1개
//				1. 반환 속성값들을 dto(객체)로 만들기
				BoardDto boardDto = new BoardDto( 
						rs.getInt("bno"),
						rs.getString("btitle"),
						rs.getString("bcontent"),
						rs.getInt("bview"),
						rs.getString("bdate"),
						rs.getInt("mno"),
						rs.getInt("cno"),
						rs.getString("mid"),
						rs.getString("cname")
						);
//				2. 생성된 dto(객체)를 리스트에 담기
				list.add( boardDto );
			} // w end
		}catch( SQLException e ) { System.out.println( e );	}
		return list;
	} // f end
	
//	2. 개별 게시물 SQL 처리 메소드
	public BoardDto findById( int bno ) {
		try {
			String sql = "select b.* , c.cname , m.mid from board b "
					+ "inner join member m on b.mno = m.mno "
					+ "inner join category c on b.cno = c.cno where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt( 1 , bno);
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) {
				BoardDto boardDto = new BoardDto( 
						rs.getInt("bno"),
						rs.getString("btitle"),
						rs.getString("bcontent"),
						rs.getInt("bview"),
						rs.getString("bdate"),
						rs.getInt("mno"),
						rs.getInt("cno"),
						rs.getString("mid"),
						rs.getString("cname")
						);
				return boardDto;
			}
		}catch(SQLException e) { System.out.println( e ); }
		return null;
	} // f end
	
//	3. 전체 카테고리 SQL 처리 메소드
	public ArrayList<CategoryDto> category() {
		ArrayList<CategoryDto> result = new ArrayList<>();
		try {
			String sql = "select * from category";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() ) {
				CategoryDto categoryDto = new CategoryDto();
				categoryDto.setCno(rs.getInt("cno"));
				categoryDto.setCname(rs.getString("cname"));
				result.add(categoryDto);
			} // w end
		}catch( SQLException e ) { System.out.println( e ); }
		return result;
	} // f end
	
//	4. 게시물 쓰기
	public boolean write( BoardDto boardDto ) {
		try {
			String sql = "insert into board( btitle , bcontent , cno , mno )"
					+ "values( ? , ? , ? , ? )";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, boardDto.getBtitle());
				ps.setString(2, boardDto.getBcontent());
				ps.setInt(3, boardDto.getCno());
				ps.setInt(4, boardDto.getMno());
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e );	}
		return false;
	} // f end
	
//  5. 게시물 수정
	public boolean update( BoardDto boardDto ) {
		try {
			String sql = "update board set cno = ? , btitle = ? , bcontent = ? where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, boardDto.getCno());
				ps.setString(2, boardDto.getBtitle());
				ps.setString(3, boardDto.getBcontent());
				ps.setInt(4, boardDto.getBno());
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;
	} // f end
	
//	6. 게시물 삭제
	public boolean delete( int bno ) {
		try {
			String sql = "delete from board  where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, bno);
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;
	} //  f end
	
//	7. 내가 쓴 글 확인 SQL 메소드
	public boolean check( int bno , int mno ) {
		try {
			String sql = "select * from board where bno = ? and mno = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, bno);
				ps.setInt(2, mno);
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;
	} // f end
	
}
