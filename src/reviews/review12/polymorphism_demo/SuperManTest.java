package reviews.review12.polymorphism_demo;

public class SuperManTest {

	public static void main(String[] args) {
		
		Father spMan1 = new Superman();
		spMan1.playWithKid();
		spMan1.feedKid();
		spMan1.raiseKid();
		
		((Superman)spMan1).work("SDET"); // in order to reach methods of Work interface or 
		// Superman class we need to down-cast
		
		Worker spMan2 = new Superman();
		spMan2.work("QA Engineer");
		spMan2.getPaid();
		((Father)spMan2).feedKid();
		
		
		Superman spMan3 = new Superman();
		spMan3.feedKid();
		spMan3.work("DevOps");
		
		
		
		
		
		
	}
}
