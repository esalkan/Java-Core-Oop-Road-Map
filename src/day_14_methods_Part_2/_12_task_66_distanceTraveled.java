package day_14_methods_Part_2;

/**
 * @author esalkan
 */
public class _12_task_66_distanceTraveled {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double d = distance(40, 5);
		System.out.println(d);
		
		if (d>500) {
			System.out.println("You spent too much gas");
		} else {
			System.out.println("You pent enough gas");
		}
	}

	private static double distance(int speed, int time) {
		double distanceTraveled = speed * time;
		return distanceTraveled;
	}

}
