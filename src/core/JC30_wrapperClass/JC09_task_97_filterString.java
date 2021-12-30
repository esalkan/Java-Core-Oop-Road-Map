package core.JC30_wrapperClass;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC09_task_97_filterString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";

		System.out.println(filterString(str));

	}

	public static String filterString(String s) {

		String str = "";

		for (int i = 0; i < s.length(); i++) {

			if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {

				str = str + s.charAt(i);
			}

		}

		return str;

	}

}
