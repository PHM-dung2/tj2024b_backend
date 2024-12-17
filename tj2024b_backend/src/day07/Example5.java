package day07;

public class Example5 {

	public static void main(String[] args) {

		int[] num = new int[] { 1,2,3,4,5,6,7,8,9,10 } ;
		int sum = 0;
		for( int i = 0 ; i < num.length ; i++ ) {
			sum += num[i];
		}
		System.out.printf("총점 : %d , 평균 : %.2f" , sum , (double)sum/num.length);
		
	}

}
