package day12.도서관리;

public class LogInManager {
//	멤버변수
    private static String logInId;
    private static int logInType;
//  생성자
//  메소드
	public static String getLogInId() {
		return logInId;
	}
	public static void setLogInId(String logInId) {
		LogInManager.logInId = logInId;
	}
	public static int getLogInType() {
		return logInType;
	}
	public static void setLogInType(int logInType) {
		LogInManager.logInType = logInType;
	}
  
}
