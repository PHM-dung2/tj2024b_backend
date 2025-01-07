package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import boardservice10.model.dto.MemberDto;

public class MemberDao {
	private Connection conn;		// DB와 연동 결과를 조작하느 인터페이스
	private String dburl = "jdbc:mysql://localhost:3306/boardservice10"; // 연동할 DB 서버의 URL
	private String dbuser = "root"; // 연동할 DB 서버의 계정명
	private String dbpwd = "1234"; 	// 연동할 DB 서버의 비밀번호
//	+ 싱글톤
	private MemberDao() {
		try {
//		1. JDBC 클래스 드라이버 로드 , Class.forName()
		Class.forName("com.mysql.cj.jdbc.Driver");
//		2. 설정한 경로/계정/비밀번호로 DB서버 연동 시도하고 결과를 (구현체) 반환
		conn = DriverManager.getConnection( dburl , dbuser , dbpwd );
		}catch(Exception e) {
			System.out.println("[DB 연동 실패]" + e);
		}
	}
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
	
////	2. 로그인
//	public boolean logIn() {
//		
//	} // f end
//	
////	3. 아이디찾기
//	public void searchID() {
//		
//	} // f end
//	
////	4. 비밀번호 찾기
//	public void searchPWD() {
//		
//	} // f end
}