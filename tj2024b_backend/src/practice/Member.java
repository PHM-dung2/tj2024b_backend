package practice;

public class Member {
private String id;
private String pw;
private String name;

//생성자 선언

public Member(String id,String pw , String name) {
	this.id = id;
	this.pw = pw;
	this.name = name;
	
}//생성자 end
//게터
public String getId() {
	return id;
}
//세터
public void setId(String id) {
	this.id = id;
}
//게터
public String getPw() {
	return pw;
}
// 세터
public void setPw(String pw) {
	this.pw = pw;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}// class end
