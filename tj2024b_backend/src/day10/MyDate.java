package day10;

public class MyDate {

//	+ 멤버변수
	private int day;
	private int month;
	private int year;
	
	
	
//	+ 생성자
	
public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getDay() {
		return day;
	}



	//	+ 메소드 , getter : 호출 , setter : 저장
	public void setDay( int day ) {
		if( month == 2 ) {
//			2월달이면
			if( day < 1 || day > 28 ) {
//				1보다 작거나 28보다 크면
				System.out.println("오류입니다.");
			}else {
				this.day = day;
			}
		}
	}
}
