package exercises.shorts._27_accessModifier_02;

import exercises.shorts._26_accessModifier_01.AccessModifier;

public class Test_02 {

    // AccessModifier Class in another Class

    public static void main(String[] args) {
        // private instance variable
        // System.out.println(AccessModifier.n1); // Can not reachable out of the package
        // AccessModifier.method1(); // Can not reachable out of the package

        // Default instance variable
        //System.out.println(AccessModifier.n2); // Can not reachable out of the package
        // AccessModifier.method2(); // Can not reachable out of the package

        // Public variable
        System.out.println(AccessModifier.n3); // Just access public access modifier methods and variables
        // public method
        AccessModifier.method3(); // Just access public access modifier methods and variables.
    }

}
