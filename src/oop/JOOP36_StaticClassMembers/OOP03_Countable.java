package oop.JOOP36_StaticClassMembers;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
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
