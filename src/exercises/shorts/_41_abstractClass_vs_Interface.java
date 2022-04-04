package exercises.shorts;

/*
    ABSTRACT CLASS vs INTERFACE

    ABSTRACT CLASS:
        - Can NOT be instantiated
        - Can HAVE constructor
        - Multiple inheritance (extends) is NOT allowed
        - Can HAVE instanced, static and abstract methods.
        - Can HAVE instances and static variables.
        - Can NOT be final
        - Can USE other access modifiers than public

    INTERFACES:
        - Can NOT be instantiated
        - Multiple inheritance(implements) is ALLOWED
        - Can NOT have constructor
        - Can HAVE static, abstract and default methods.
        - Can ONLY HAVE static variable (final by default)
        - Can NOT be final
        - Can NOT use other access modifiers than public
 */

interface AInterface {
    int a = 100; // By default, public static & final. That's why need to assign data.
    // private int a = 100; private protected etc. can not accept in interface

    // Constructors are not allowed in interface.
    // public AInterface(){
    //
    // }

    // public void sum(){} // instance methods NOT allowed
    void sum(); // Abstract methods are allowed.
    int calc(); // Abstract methods are allowed

    default int area(){ // Instance methods are allowed in Interface
        return 0;
    }

    default String name(){ // Instance methods are allowed in Interface
        return "name";
    }

}

abstract class X {
    private int a;          // private access modifier allowed in abstract class
    protected boolean b;    // protected access modifier allowed in abstract class
    public static String c; // public access modifier allowed in abstract class

    public X(){} // A constructor allowed

    public void sum(){} // instance methods allowed
    public static int calc(){return 0;} // Instance methods allowed.

    public abstract void area(); // In abstract class need to provide abstract keyword for abstract methods.

}

public class _41_abstractClass_vs_Interface {

    public static void main(String[] args) {
        // Can NOT instantiate/Create object from INTERFACE
        // AInterface aInterface = new AInterface();

        // Can NOT instantiate/Create object from ABSTRACT CLASS
        // X x = new X();
    }
}
