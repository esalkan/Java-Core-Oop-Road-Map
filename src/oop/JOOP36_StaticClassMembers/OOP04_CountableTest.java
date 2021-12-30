package oop.JOOP36_StaticClassMembers;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP04_CountableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OOP03_Countable o1 = new OOP03_Countable();
//		_03_Countable o2 = new _03_Countable();
//		_03_Countable o3 = new _03_Countable();

		System.out.println(o1.getInstanceCount());
		System.out.println(OOP03_Countable.instanceCount);
		// System.out.println(_03_Countable.instanceCount2); // Cant reachable because
		// in constructor class it is not static
	}

}
