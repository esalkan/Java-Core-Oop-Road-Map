package exercises.shorts;

/*
    ABSTRACT vs CONCRETE CLASS

    - Abstract class is meant to be inherited only, not meant to be instantiated
    - Abstract class is not concrete class
    - A subclass of abstract class is called concrete class, and it can be instantiated
    - A concrete class must implement all the inherited abstract methods.


    CONCRETE CLASS
        - Can HAVE constructors and instances and statics
        - Can BE instantiated.
        - Can NOT have abstract methods.
        - Can BE declared as final.


    ABSTRACT CLASS
        - Can have constructors, instances and statics.
        - Can NOT be instantiated.
        - Can HAVE abstract method
        - Can NOT be declared as final


 */
abstract class A {
    int a = 5;
    double d = 10.5;

    public A() {
    }

    public void method1() {
    }

    public static void method2() {
    }

    public abstract void method3();

}

final class B extends A {
    @Override
    public void method3() {

    }
    // Concrete Class can be final, but abstract can not.
}

public class _39_abstract_vs_concrete_class {

    public static void main(String[] args) {

        // Abstract Class
        // A a = new A(); // Can not create object from abstract class

        // Regular Class
        B b = new B();
    }
}
