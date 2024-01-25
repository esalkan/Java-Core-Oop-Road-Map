package core.JC03_variables_dataTypes;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC01_variableDeclaration {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variable Declaration - Değişken Tanımlama
		byte inches; // Declaration a byte data type variable - byte veri tipinde değişken tanımlama
		int speed; // Declaration a int data type variable - int veri tipinde değişken tanımlama
		short month; // Declaration a short data type variable - short veri tipinde değişken tanımlama
		float salesCommision; // Declaration a float data type variable - float veri tipinde değişken tanımlama
		double distance; // Declaration a double data type variable - double veri tipinde değişken tanımlama

		// Assign a value to variables - Değişkenlere değer atama
		inches = 5;
		speed = 200;
		month = 2;
		salesCommision = 5;
		distance = 40.2;

		// Declare and assign a value to a variable - Değişken tanımlama ve değer atama
		byte inches2 = 5;

		// Print the values of variables - Değişkenlerin değerlerini yazdırma
		System.out.println("inches type(byte)" + inches);
		System.out.println("speed type(int)" + speed);
		System.out.println("month type(short)" + month);
		System.out.println("salesCommision type(float)" + salesCommision);
		System.out.println("distance type(double)" + distance);
		System.out.println("inches2 type(byte)" + inches2);

		// Declare and assign a value to a variable - Değişken tanımlama ve değer atama
		int number = 10;

		// Print the value of variable - Değişkenin değerini yazdırma
		System.out.println("My Number Is : " + number);
	}
}