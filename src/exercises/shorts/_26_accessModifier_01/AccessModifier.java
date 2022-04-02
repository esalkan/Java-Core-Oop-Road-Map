package exercises.shorts._26_accessModifier_01;

public class AccessModifier {
    private static int n = 100; // Private
    static int n2 = 200; // Default
    public static int n3 = 300; // Public

    private static void method1(){ // Private
        System.out.println("Method with private access modifier");
    }

    static void method2(){ // Default
        System.out.println("Method with default access modifier");
    }

    public static void method3(){ // Public
        System.out.println("Method with public access modifier");
    }
}
