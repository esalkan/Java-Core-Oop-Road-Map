package oop.JOOP36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class OOP03_Countable {

	static int instanceCount; // Instance Variable
	int instanceCount2;

	public OOP03_Countable() {
		instanceCount++;
	}

	public int getInstanceCount() {
		return instanceCount;
	}
}
