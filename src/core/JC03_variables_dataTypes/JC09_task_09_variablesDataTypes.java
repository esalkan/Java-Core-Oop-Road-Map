package core.JC03_variables_dataTypes;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC09_task_09_variablesDataTypes {

	/**
	 * @param args
	 */

	// Store the following into variables: number of children, partner's name,
	// geographic location, job title.

	// Output your fortune to the screen like so: "You will be a X in Y,
	// and married to Z with N kids"

	public static void main(String[] args) {
		int noc = 3;
		String name1 = "Kel Oğlan";
		String name2 = "Ay Kız";
		String location = "Anadolu";
		String jobTitle = "Çoban";
		String text = "You will be a " + name1 + " in " + location + " , and married to " + name2 + " with " + noc
				+ " kids and work as " + jobTitle;

		System.out.println(text);
	}

}
