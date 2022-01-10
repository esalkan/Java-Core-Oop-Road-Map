package reviews.review04;

public class CircleTest {

	public static void main(String[] args) {
		
	//	Syntax:   ClassName objectName = new ClassName();
		
		Circle circle1 = new Circle();
		
		System.out.println(circle1.radius);
		
		circle1.radius = 5.0;
		System.out.println(circle1.area()); // I call the methods with the object name
		System.out.println(circle1.perimeter());
		
		Circle circle2 = new Circle();
		circle2.radius=10.0;
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());
		
		System.out.println("-----------------------------");
	//	System.out.println(circle1); // the address of the reference variable in the Stack Memory
		
		System.out.println(circle1.toString());
		
	}

}
