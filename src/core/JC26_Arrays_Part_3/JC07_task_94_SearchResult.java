package core.JC26_Arrays_Part_3;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC07_task_94_SearchResult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * String info1 = "This info is used for creation password : xxxCD132Gxxx .
		 * Please do not share with anyone";
		 * 
		 * String info2 = "This info is used for creation password : xxx00ABC!xxx .
		 * Please do not share with anyone"; Create a password based on given info.
		 * 
		 * Output: CD132G00ABC!
		 */

		System.out.println(
				"String info1 = \"This info is used for creation password : xxxCD132Gxxx Please do not share with anyone\";\n"
						+ "String info2 = \"This info is used for creation password : xxx00ABC!xxx Please do not share with anyone\";\nCreate a password based on given info.\n");

		String info1 = "This info is used for creation password : xxxCD132Gxxx Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx Please do not share with anyone";

		String[] info1Splt = info1.split("xxx");
		String[] info2Splt = info2.split("xxx");

		String info1Pwd = info1Splt[1];
		System.out.println(info1Pwd);
		String info2Pwd = info2Splt[1];
		System.out.println(info2Pwd);
		System.out.println("Output : " + info1Pwd.concat(info2Pwd));

	}

}
