package reviews.review03;

public class CustomMethod2 {

	public static void main(String[] args) {
		
		int person1 = 10;
		eligibleOrNot(person1);
		
		eligibleOrNot(20);
		
		eligibleOrNot(24);
		
	}
	
	public static void eligibleOrNot(int age) {
		
		int person = age;
		
		if (person>=21) {
			System.out.println("Eligible to buy");
		}else {
			System.out.println("NOT Eligible to buy");
		}
	}
	
	
}
