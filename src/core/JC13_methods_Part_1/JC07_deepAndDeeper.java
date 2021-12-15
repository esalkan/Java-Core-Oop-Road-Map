package core.JC13_methods_Part_1;

/**
 * @author esalkan
 */
public class JC07_deepAndDeeper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("I am starting in main");
		deep();
		System.out.println("Now I am back in main");
	}

	public static void deep() {
		System.out.println("I am now in deep");
		deeper();
		System.out.println("Now I am back in deep");
	}
	

	public static void deeper() {
		System.out.println("I am now in deeper");
	}
}
