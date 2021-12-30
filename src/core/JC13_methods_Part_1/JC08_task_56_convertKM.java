package core.JC13_methods_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC08_task_56_convertKM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		convertKM();
	}
	public static void convertKM() {
		int mile = 80;
		double km = mile * 1.60934;
		System.out.println(mile + " mile = " + km + " km");
	}

}
