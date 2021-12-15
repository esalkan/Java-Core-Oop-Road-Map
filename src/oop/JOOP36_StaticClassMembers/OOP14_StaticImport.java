package oop.JOOP36_StaticClassMembers;

import static java.lang.Math.*;

/**
 * @author esalkan
 *
 */
public class OOP14_StaticImport {

	public static void main(String[] args) {

		System.out.println(Math.PI);
		System.out.println(sqrt(16)); // after import math --staticly-- directly you can reach the build-in methods
		System.out.println(PI);
	}

}
