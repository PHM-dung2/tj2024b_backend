package studentservice.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import studentservice.model.dto.StudentDto;

public class StudentDao extends Dao {
//	싱글톤
	private StudentDao() {}
	private static StudentDao instance = new StudentDao();
	public static StudentDao getInstance() {
		return instance;
	}
	
//	메소드
//	0. 학생 목록	
	public ArrayList<StudentDto> studentList() {
		ArrayList<StudentDto> result = new ArrayList<>();
		try {
			String sql = "select sname from student st";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while( rs.next() ) { 
				StudentDto studentDto = new StudentDto();
				studentDto.setSname(rs.getString("sname"));
				result.add(studentDto);
			} // end
			return result;
		}catch( SQLException e ) { System.out.println( e ); }
		return null;
	} // f end
	
//	1. 점수등록
	public boolean write( StudentDto studentDto ) {
		try {
			String sql = "insert into score( kor , eng , math , sno ) values( ? , ? , ? , ? )";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, studentDto.getKor());
				ps.setInt(2, studentDto.getEng());
				ps.setInt(3, studentDto.getMath());
				ps.setInt(4, studentDto.getSno());
				
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;
	} // f end
	
//	2. 전체학생점수조회
	public ArrayList<StudentDto> findAll() {
		ArrayList<StudentDto> result = new ArrayList<>();
		try {
			String sql = "select sc.* , st.sname "
					+ "from score sc inner join student st on sc.sno = st.sno ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while( rs.next() ) { 
				StudentDto studentDto = new StudentDto();
				studentDto.setKor(rs.getInt("kor"));
				studentDto.setEng(rs.getInt("eng"));
				studentDto.setMath(rs.getInt("math"));
				studentDto.setSname(rs.getString("sname"));
				studentDto.setScno(rs.getInt("scno"));
				result.add(studentDto);
			} // end
			return result;
		}catch( SQLException e ) { System.out.println( e ); }
		return null;
	} // f end
	
//	3. 점수삭제
	public boolean delete( int dIndex ) {
		try {
			String sql = "delete from score where scno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, dIndex);
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;
	} // f end
	
//	4. 점수수정
	public boolean update( int sIndex , StudentDto studentDto ) {
		try {
			String sql = "update score set kor = ? , eng = ? , math = ? where scno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, studentDto.getKor());
				ps.setInt(2, studentDto.getEng());
				ps.setInt(3, studentDto.getMath());
				ps.setInt(4, sIndex);
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;
	} // f end
}
