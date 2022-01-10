package reviews.review11.exercise_example;

public abstract class Exercise {

	public void start() {
		System.out.println("Warming up and starting the exercise");
	}
	
	public abstract void perform();
	
	public abstract int getCaloriesCount(int minutes);
	
}
