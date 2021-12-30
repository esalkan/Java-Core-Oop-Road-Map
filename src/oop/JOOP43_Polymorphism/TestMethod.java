package oop.JOOP43_Polymorphism;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TestMethod {
    public static void main(String[] args) {
        ChildA ch1 = new ChildA();
        ch1.m1();   // From Parent Class... Because m1() method is in Parent Class and ChildA extends Parent that's why we can access...
        ch1.m2();   // From Interface...    Because m2() is @Override from MyInterface
        ch1.m3();   // From ChildA class... Because m3() is instance method.

        ChildB ch2 = new ChildB();
        ch2.m1();   // From Parent Class... Because m1() method is in Parent Class and ChildB extends Parent  that's why we can access...
        ch2.m2();   // From interface...    Because m2() is @Override from MyInterface
        ch2.m4();   // From ChildB class... Because m4() is instance method.

        MyInterface ch3 = new ChildA();
        ch3.m2();       // From interface...    Because m2() is @Override from MyInterface
        // ch3.m3();    // From ChildA Class... Reference Type (MyInterface) doesn't have an access... We can not call so.
                        // to reach m3() need to create ChildA reference type new ReferenceObject

        MyInterface ch4 = new ChildB();
        ch4.m2();
        // ch4.m1();    // Reference type doesn't have any access..


        Parent p1 = new ChildA();
        p1.m1();

        Parent p2 = new ChildB();
        p2.m1();


    }
}

class Parent {
    public void m1() {}
}

interface MyInterface {
    /* Remember the rule >:[ ; interfaces not have body methods.
     * void m2(){}  // Error!!!
     */

    void m2();  // !! Automatically : "public abstract"
}

class ChildA extends Parent implements MyInterface{
    @Override
    public void m2() {} // Mandatory @Override from Interface
    public void m3(){}  // Instance method
}

class ChildB extends Parent implements MyInterface{
    @Override
    public void m2() {} // Mandatory @Override from Interface
    public void m4() {} // Instance method
}