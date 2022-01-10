package reviews.review03;

public class TernaryExample {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 10000;
		int biggerNumber;
		
//		if(num1>num2) {
//			biggerNumber=num1;
//
//		}else {
//			biggerNumber=num2;
//		}
		
		biggerNumber = (num1>num2)? num1 : num2;
		
		System.out.println(biggerNumber);
		
		

	}

}
