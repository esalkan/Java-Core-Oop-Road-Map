package core.JC32_ArrayList_Continue;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
import java.util.ArrayList;

public class JC02_RemoveAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(30);
		list1.add(12);
		list1.add(22);

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(30);
		list2.add(345);
		list2.add(1);
		list2.add(12);
		list2.add(22);
		list2.add(12);

		System.out.println(list1);
		System.out.println(list2);

		// From List 2 Removes all matching values from list1
		list2.removeAll(list1);

		System.out.println(list2);
	}

}
