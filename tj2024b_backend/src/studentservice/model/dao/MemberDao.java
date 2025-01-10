package studentservice.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import studentservice.model.dto.MemberDto;

public class MemberDao extends Dao {
//	싱글톤
	private MemberDao() {}
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance() {
		return instance;
	}
	
//	메소드
//	1. 회원가입
	public boolean signUp( MemberDto memberDto ) {
		try {
			String sql = "insert into student( sid , spwd , sname ) values( ? , ? , ? ) ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, memberDto.getSid());
				ps.setString(2, memberDto.getSpwd());
				ps.setString(3, memberDto.getSname());
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;	
	} // f end
	
//	2. 로그인
	public int logIn( MemberDto memberDto ) {
		try {
			String sql = "select sno from student where sid = ? and spwd = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, memberDto.getSid());
				ps.setString(2, memberDto.getSpwd());
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) { 
				int result = rs.getInt("sno");
				return result; 
			}
		}catch( SQLException e ) { System.out.println( e ); }
		return -1;
	} // f end
	
	
}
