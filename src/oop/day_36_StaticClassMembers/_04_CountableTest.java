package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _04_CountableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		_03_Countable o1 = new _03_Countable();
//		_03_Countable o2 = new _03_Countable();
//		_03_Countable o3 = new _03_Countable();

		System.out.println(o1.getInstanceCount());
		System.out.println(_03_Countable.instanceCount);
		// System.out.println(_03_Countable.instanceCount2); // Cant reachable because
		// in constructor class it is not static
	}

}
