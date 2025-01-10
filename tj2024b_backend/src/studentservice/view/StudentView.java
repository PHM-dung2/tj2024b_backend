package studentservice.view;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Scanner;

import studentservice.controller.StudentController;
import studentservice.model.dto.StudentDto;

/*
 	1. studentservicr 패키지에서 코드 작업
 	2. 학생명과 국어,영어,수학 점수를 입력받아 관리하는 서비스
 	3. 기능 : 점수등록 , 전체학생점수조회 , 점수삭제 , 점수수정
 	4. boardservice10 동일하게 MVC패턴 사용하여 구현하시오
 		* 임의로 설계
*/

public class StudentView {
//	싱글톤
	private StudentView() {}
	private static StudentView instance = new StudentView();
	public static StudentView getInstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	
//	메소드
//	0. 선택 페이지
	public void index() {
		
		while(true) {
			System.out.println("\n===== 학점관리 서비스 =====");
			System.out.print("1.점수등록 2.전체학생점수조회 3.점수삭제 4.점수수정 ");
			int choose = scan.nextInt();
			
			switch (choose) {
			case 1: 
				write();
				break;
			case 2: 
				findAll();
				break;
			case 3: 
				delete();
				break;
			case 4: 
				update();
				break;
			}
			
		} // w end
		
	} // f end
	
//	0. 학생 목록
	public void studentList() {
		System.out.println("번호\t이름");
		ArrayList<StudentDto> result = StudentController.getInstance().studentList();
		for( int i = 0 ; i < result.size() ; i++ ) {
			StudentDto studentDto = result.get(i);
			System.out.print((i+1) + "\t");
			System.out.print(studentDto.getSname() + "\n");
		} // for end
	} // f end
	
//	1. 점수등록
	public void write() {
		System.out.println("\n===== 점수등록 =====");
		studentList();
		System.out.print("번호 : ");			int sno = scan.nextInt();
		System.out.print("국어 점수 : ");		int kor = scan.nextInt();
		System.out.print("영어 점수 : ");		int eng = scan.nextInt();
		System.out.print("수학 점수 : ");		int math = scan.nextInt();
		StudentDto studentDto = new StudentDto();
		studentDto.setSno(sno);
		studentDto.setKor(kor);
		studentDto.setEng(eng);
		studentDto.setMath(math);
		
		boolean result = StudentController.getInstance().write( studentDto );
		
		if( result ) { System.out.println("점수 등록 성공"); }
		else { System.out.println("점수 등록 실패"); }
	} // f end
	
//	2. 전체학생점수조회
	public void findAll() {
		System.out.println("\n===== 전체학생 점수조회 =====");
		System.out.println("번호\t이름\t국어\t수학\t영어\t");
		ArrayList<StudentDto> result = StudentController.getInstance().findAll();
		for( int i = 0 ; i < result.size() ; i++ ) {
			StudentDto studentDto = result.get(i);
			System.out.print(studentDto.getScno()+ "\t");
			System.out.print(studentDto.getSname() + "\t");
			System.out.print(studentDto.getKor() + "\t");
			System.out.print(studentDto.getEng() + "\t");
			System.out.print(studentDto.getMath() + "\n");
		} // for end
		
	} // f end
	
//	3. 점수삭제
	public void delete() {
		System.out.println("\n===== 점수삭제 =====");
		findAll();
		System.out.println("삭제할 번호 : ");
		int dIndex = scan.nextInt(); 
		boolean result = StudentController.getInstance().delete( dIndex );
		
		if( result ) { System.out.println("삭제 성공"); }
		else { System.out.println("삭제 실패"); }
	} // f end
	
//	4. 점수수정
	public void update() {
		System.out.println("\n===== 점수수정 =====");
		findAll();
		System.out.println("수정할 번호 : ");
		int sIndex = scan.nextInt();
		System.out.print("수정할 국어 점수 : ");		int kor = scan.nextInt();
		System.out.print("수정할 영어 점수 : ");		int eng = scan.nextInt();
		System.out.print("수정할 수학 점수 : ");		int math = scan.nextInt();
		StudentDto studentDto = new StudentDto();
		studentDto.setKor(kor);
		studentDto.setEng(eng);
		studentDto.setMath(math);
		
		boolean result = StudentController.getInstance().update( sIndex , studentDto );
		
		if( result ) { System.out.println("수정 성공"); }
		else { System.out.println("수정 실패"); }
	} // f end
	
	
	
}
