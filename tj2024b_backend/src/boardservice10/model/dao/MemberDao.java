package boardservice10.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import boardservice10.model.dto.MemberDto;

public class MemberDao extends Dao {
//	+ 싱글톤
	private MemberDao() {}
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance() { return instance; }
	
//	1. 회원가입
	public boolean signUp( MemberDto memberDto ) {
		try {
//			[1] SQL 작성한다
			String sql = "insert into member( mid , mpwd , mname , mphone )	"
					+ "values( '"+memberDto.getMid()+"' , '"+memberDto.getMpwd()+"' , '"+memberDto.getMname()+"' , '"+memberDto.getMphone()+"' )";
//			[2] DB와 연동된 곳에 SQL 기재한다.	- 연동된 db에 sql 기재하는 방법 : conn.prepareStatement( SQL )
			PreparedStatement ps = conn.prepareStatement(sql);
//			[3] 기재된 SQL실행하고 결과를 받는다. 	- 기재된 sql을 실행하는 방법 : ps.executeUpdate()
			int count = ps.executeUpdate();
//			[4] 결과에 따른 처리 및 반환을 한다.
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;
	} // f end
	
//	2. 로그인
	public int logIn( MemberDto memberDto ) {
//		int : SQL로 조회된 회원번호를 반환하기 위해서
		try {
			String sql = "select mno from member where mid = ? and mpwd = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, memberDto.getMid());
				ps.setString(2, memberDto.getMpwd());
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) {
				int mno = rs.getInt("mno");
				return mno; 
			} // if end
		}catch( SQLException e ) { System.out.println( e ); }
		return 0;
	} // f end
	
//	3. 아이디찾기
	public String findID( MemberDto memberDto ) {
		try {
//			[1] SQL 작성		// mname = '유재석' ---> mname = ? : mname는 어떤 값이 들어갈지 정해져 있지 않다. 매개변수
			String sql = "select mid from member where mname = ? and mphone = ? ";
//			[2] DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString( 1, memberDto.getMname() );
				ps.setString( 2, memberDto.getMphone() );
//			[3] 기재된 SQL 실행, 결과 받기
			ResultSet rs = ps.executeQuery();
//			[4] 결과에 따른 처리 및 반환
			if( rs.next() ) { 
				String findMid = rs.getString("mid");
				return findMid;
			} // if end
		} catch( SQLException e ) { System.out.println( e ); }
		return null;
		
	} // f end
	
//	4. 비밀번호 찾기
	public String findPWD( MemberDto memberDto ) {
		try {
			String sql = "select mpwd from member where mid = ? "
					+ "and mname = ? and mphone = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, memberDto.getMid());
				ps.setString(2, memberDto.getMname());
				ps.setString(3, memberDto.getMphone());
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) {
				String findMpwd = rs.getString("mpwd");
				return findMpwd;
			} // if end
		}catch( SQLException e ) { System.err.println( e ); }
		return null;
	} // f end
	
//	5. 내정보조회 SQL 처리 메소드
	public MemberDto myInfo( int logInMno ) {
		try {
			String sql = "select mid , mname , mphone , mdate from member where mno = ?";
			PreparedStatement ps = 	conn.prepareStatement(sql);
				ps.setInt(1, logInMno);
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) {
				MemberDto result = new MemberDto();
				result.setMid( rs.getString("mid") );
				result.setMname( rs.getString("mname") );
				result.setMphone( rs.getString("mphone") );
				result.setMdate( rs.getString("mdate") );
				return result;
			}
		}catch( SQLException e ) { System.out.println( e ); }
		return null; // 조회된 정보가 없을때, null 반환
	} // f end
	
//	6. 회원탈퇴 SQL 처리 메소드
	public void delete( int logInMno ) {
		try {
			String sql = "delete from member where mno = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1 , logInMno);
			ps.executeUpdate();
		}catch( SQLException e ) { System.out.println( e ); }
	} // f end
	
//	7. 회원수정 SQL 처리 메소드
	public boolean update( MemberDto memberDto , int logInMno ) {
		try {
			String sql = "update member set mpwd = ? , mname = ? , mphone = ? where mno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1 , memberDto.getMpwd());
				ps.setString(2 , memberDto.getMname());
				ps.setString(3 , memberDto.getMphone());
				ps.setInt(4 , logInMno);
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch(SQLException e) { System.out.println( e ); }
		return false;
	} // f end
	
//	8. 특정한 속성의 중복값 검색
//		속성명 매개변수
//		매개변수 : 어떠한 값이 들어올지/대입 정해져 있지 않은 변수
//		field : 중복을 검사할 데이터의 속성명
//		value : 중복을 검사할 데이터
	public boolean check( String field , String value ) {
		
//		StringBuilder builder = new StringBuilder();
//		builder.append(" select * from member where");
//		builder.append( field );
//		builder.append( " = " );
//		builder.append( value );
//		System.out.println( builder.toString() );
		
		try {
			String sql = "select * from member where " +field+ " =? ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, value);
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		
		return false;
	} // f end
	
}
