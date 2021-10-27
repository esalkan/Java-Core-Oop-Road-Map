package day_14_methods_Part_2;

/**
 * @author esalkan
 */
public class _02_lab_02_love6 {

	/**
	 * @param args
	 */
	
	/*The number 6 is a truly great number. Write a method that accepts num1 and num2, 
	 * prints true if either one is 6. Or if their sum or difference is 6.
	 */
	
	public static void main(String[] args) {
		
		love6(6, 4);
		love6(4, 5);
		love6(1, 5);
		love6(12, 6);

	}
	
	public static void love6(int num1,int num2) {
		
		if(num1==6 || num2==6 || num1+num2==6 || num1-num2==6 || num2-num1==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
