package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _03_Countable {

	static int instanceCount; // Instance Variable
	int instanceCount2;

	public _03_Countable() {
		instanceCount++;
	}

	public int getInstanceCount() {
		return instanceCount;
	}
}
