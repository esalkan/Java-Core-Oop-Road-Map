package exercises.shorts._26_accessModifier_01;

public class Test_01 {

    // In the same package with AccessModifier Class

    public static void main(String[] args) {
        // private instance variable
        // System.out.println(AccessModifier.n1); // Can not reach, need get method

        // Default instance variable
        System.out.println(AccessModifier.n2); // in same package is accessible

        // public instance variable
        System.out.println(AccessModifier.n3); // from everywhere accessible


        // private method
        // AccessModifier.method1(); // in same package can not reachable.

        // Default method
        AccessModifier.method2(); // Accessible in same package

        // Public method
        AccessModifier.method3(); // Accessible in everywhere
    }


}
