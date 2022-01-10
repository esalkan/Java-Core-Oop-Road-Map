package reviews.review04;

public class LocalVsInstanceTest {

	public static void main(String[] args) {
		
		LocalVsInstance obj = new LocalVsInstance();

		System.out.println(" -----local variable-------");
		obj.showDifference();
		
		System.out.println("------instance variable-------");
		 obj.a=10;
		System.out.println(obj.a);
	
		
	
		for (int i = 0; i<10; i++) {     // i is local to for loop
			System.out.println(i+" ");
		}
		//  System.out.println(i);  local variable can NOT print here
		
	}

}
