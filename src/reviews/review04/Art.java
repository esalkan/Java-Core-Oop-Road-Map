package reviews.review04;

public class Art {

	public static void draw() {
		System.out.println("Basic drawing");
	}
	
	public static void draw(String color) {
		System.out.println("Drawing with "+color);
	}
	
	public static void draw(int size) {
		draw("red");
		System.out.println("Drawing with size "+size);
	}
	
	public static String draw(String color, int size) {
		String result = "Drawing with "+color+" and size "+size;
		return result;
	}
	public static void draw(int size, String color) {   // overloading is not related to returnType
		String result = "Drawing with "+color+" and size "+size; // change of the locations of parameters
		System.out.println(result);                              // made it overloaded
	}
	
	
	public static void main(String[] args) {
		
		draw();
		draw("red");
		draw(5);
		String drawingResult = draw("yellow",8);
		System.out.println(drawingResult);
	}
	
	

}
