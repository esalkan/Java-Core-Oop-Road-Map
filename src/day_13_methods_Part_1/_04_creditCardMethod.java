package day_13_methods_Part_1;

/**
 * @author esalkan
 */
public class _04_creditCardMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double salary=50000;
		int creditRating=5;
		
		if(salary>=20000 && creditRating>=7) {
			qualify();
		}else {
			noQualify();
		}
		
	}

	public static void noQualify() {
		System.out.println("I am sorry, you are not qualified for the CC ");
	}

	public static void qualify() {
		System.out.println("Congrat, you are qualified for the CC ");
	}

}
