package studentservice.controller;

import java.util.ArrayList;

import studentservice.model.dao.StudentDao;
import studentservice.model.dto.StudentDto;

public class StudentController {
//	싱글톤
	private StudentController() {}
	private static StudentController instance = new StudentController();
	public static StudentController getInstance() {
		return instance;
	}
	
//	메소드
//	0. 학생 목록
	public ArrayList<StudentDto> studentList() {
		ArrayList<StudentDto> result = StudentDao.getInstance().studentList();
		return result;
	} // f end
	
//	1. 점수등록
	public boolean write( StudentDto studentDto ) {
		boolean result = StudentDao.getInstance().write(studentDto);
		return result;
	} // f end
	
//	2. 전체학생점수조회
	public ArrayList<StudentDto> findAll() {
		ArrayList<StudentDto> result = StudentDao.getInstance().findAll();
		return result;
	} // f end
	
//	3. 점수삭제
	public boolean delete( int dIndex ) {
		boolean result = StudentDao.getInstance().delete(dIndex); 
		return result;
	} // f end
	
//	4. 점수수정
	public boolean update( int sIndex , StudentDto studentDto ) {
		boolean result = StudentDao.getInstance().update(sIndex , studentDto);
		return result;
	} // f end
}
