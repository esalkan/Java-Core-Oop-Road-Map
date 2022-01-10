package reviews.review12.polymorphism_demo;

public class Superman extends Father implements Worker{

	@Override
	public void work(String job) {
		System.out.println("Superman is working as "+ job);
		
	}

	@Override
	public double getPaid() {
		System.out.println("getting paid");
		return 8000;
	}

}
