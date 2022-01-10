package reviews.review11.exercise_example;

public class FreeWeight extends Lifting{

	@Override
	public void endLift() {

System.out.println("Carefully placing the weights");
		
	}

	@Override
	public void perform() {
		
		System.out.println("Lifting Free Weight dumbbells");
		
	}

	@Override
	public int getCaloriesCount(int minutes) {
		
		
		return minutes*6;
	}

}
