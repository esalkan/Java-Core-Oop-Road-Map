package day_34_Constructors_PassingObjectsToMethods;

/**
 * @author esalkan
 *
 */
public class _04_AppleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// How to passing our object to my Method Parameter???

		// _03_Apple is reference type
		// a1 is reference variable 
		// new _03_Apple() is creating an object from _03_Apple Class
		_03_Apple a1 = new _03_Apple();
		
		// sending a parameter value to method and it will change the color in constructor class
		changeApple(a1);
		
		// Printing Constructor class
		System.out.println(a1.color);
		
		System.out.println(methodObject().color);
		
	}
	
	
	public static void changeApple(_03_Apple x) {
		x.color = "White";
	}
	
	
	public static _03_Apple methodObject() {
		_03_Apple b1 = new _03_Apple();
		return b1;
	}

}
