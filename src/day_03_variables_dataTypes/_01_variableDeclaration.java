package day_03_variables_dataTypes;

/**
 * @author esalkan
 *
 */
public class _01_variableDeclaration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaration
		byte inches;
		int speed;
		short month;
		float salesCommision;
		double distance;
		
		// Assigned
		inches = 5;
		speed = 200;
		month = 2;
		salesCommision = 5;
		distance = 40.2;
		
		// Declared + Assigned
		
		byte inches2 = 5;
		
		System.out.println("inches type(byte)" + inches);
		System.out.println("speed type(int)" + speed);
		System.out.println("month type(short)" + month);
		System.out.println("salesCommision type(float)" + salesCommision);
		System.out.println("distance type(double)" + distance);
		System.out.println("inches2 type(byte)" + inches2);
		
		int number = 10;
		
		System.out.println("My Number Is : " + number);
	}

}
