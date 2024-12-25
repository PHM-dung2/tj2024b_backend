package day08;

public class Person {

	int age;
	String name;
	boolean isMarried;
	int count;
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 40;
		p1.name = "james";
		p1.isMarried = true;
		p1.count = 3;
		
		System.out.println("이 사람의 나이 " + p1.age);
		System.out.println("이 사람의 이름 " + p1.name);
		System.out.println("이 사람의 결혼 여부 " + p1.isMarried);
		System.out.println("이 사람의 자녀 수 " + p1.count);
		
	}
	
}
