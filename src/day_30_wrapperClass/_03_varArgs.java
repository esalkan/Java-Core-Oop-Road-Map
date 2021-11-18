package day_30_wrapperClass;

/**
 * @author esalkan
 *
 */
public class _03_varArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// var args mean ; variable arguments
		
		sum(2,5);
		sum(3,5,7,9);
		sum(5,10,50);
		
		concat("deneme","apple","car","student");

	}
	
	public static void sum(int...is) {
		// A var args parameter can take a variable number of arguments 
	
		int sum = 0;
		
		for (int i : is) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	public static void concat(String...strs) {
		String newStr = "";
		
		for (String str : strs) {
			newStr = newStr + str.charAt(2);
		}
		
		System.out.println(newStr);
	}

}
