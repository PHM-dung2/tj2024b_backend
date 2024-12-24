package day12;

//	- 하나의 .java파일의 1개이상의 클래스를 생성할 수 있다.

//	(2) 객체(인스턴스)를 생성하기 위한 객체 설계도 클래스
class BirthDay{
//	+ 클래스 멤버		// * 모든 인스턴스 들이 각각 사용하는 변수 = 힙메모리 *
//	1. 멤버변수
	int day; int month; int year;
//	2. 생성자
//	3. 메소드 / 멤버함수	// * 모든 인스턴스 들이 공동으로 사용하는 함수 = 정적메모리 *
	public void setYear( int year ) { this.year = year;	} // this란? 해당 메ㅗㅅ르들 호출하는 인스턴스를 가리킨다.
	public void printThis() { System.out.println(this); }
	
} // class end

//	(1) main 함수를 갖는 실행 클래스
public class Example1 {
	public static void main(String[] args) {
//		1. 인스턴스 생성 - 객체를 구현하기 위해 설계도(클래스)를 메모리 할당 해서 실체물 
		BirthDay dDay = new BirthDay(); // new 인스턴스 생성 
//		2. 인스턴스가 메소드를 호출
		dDay.printThis(); // day12.BirthDay@5305068a
//		3. 인스턴스의 멤버변수 값 대입
		dDay.setYear( 2000 );
		System.out.println( dDay.year );		// 2000
		
		// *
		BirthDay dDay2 = new BirthDay();
		dDay2.printThis(); // day12.BirthDay@1f32e575
		dDay2.setYear( 2024 );
		System.out.println( dDay2.year );		// 2024
		
//		클래스 2개 / 인스턴스 2개 / 할당된 멤버변수 6개(저장) / 메소드 2개(행위)
		
	} // main end
	
}
