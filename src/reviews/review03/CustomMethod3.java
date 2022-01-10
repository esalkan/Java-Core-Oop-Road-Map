package reviews.review03;

public class CustomMethod3 {

	public static void main(String[] args) {
		
		System.out.println(getAgeInDays(10) + " Days old. ");
		
		System.out.println(getAgeInDaysWithMSG(10));
	}
	
	
	public static int getAgeInDays(int years) {
	
		 //  int days = years * 365;
		
		return years * 365;
	}
	
	
	public static String getAgeInDaysWithMSG(int years) {
		
		return (years * 365) + " Days old.";
		
	}
	
}
