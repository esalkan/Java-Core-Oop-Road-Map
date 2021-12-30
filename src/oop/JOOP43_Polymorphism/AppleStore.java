package oop.JOOP43_Polymorphism;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class AppleStore {
    public static void main(String[] args) throws NoSuchMethodException {
        // From AppleDevice Reference, we created Mac() object. which is extends AppleDevice.
        AppleDevice mac = new Mac();    // Polymorphic way creating an object.
        // Call the object method polymorphic way.
        mac.use();
        // mac.code();  // That code() method is inside the Mac class, but we create mac object with polymorphic way
                        // because of that, compiler firstly go to mac object class which is Mac(), check the lines
                        // search one @Override code() method. if it is not exist. compiler will give error.

        // The rule is ; Reference type decides what is accessible (If we create object polymorphic way), this is
        // weird portion of polymorphism

        System.out.println("-----o-----o-----o-----o-----o-----");

        Mac myMac = new Mac();
        myMac.use();
        myMac.code();

        System.out.println("-----o-----o-----o-----o-----o-----");

        AppleDevice watch = new AppleWatch();
        watch.use();
        // watch.wear();    // Compile error; because wear is not @Override

        System.out.println("-----o-----o----- (down-casting) -----o-----o-----");
        /**
         * Casting (down-casting)
         *         • Instructs the compiler to change the existing type of object reference to another type
         *             public class A{
         *                 public void mA(){}
         *             }
         *
         *             public class B extends A{
         *                 public void mB(){}
         *             }
         *
         *             A obj = new B();
         *             obj.mA();   // it is accessible. Reference is A
         *
         *             B obj2 = (B) obj;   // Casting
         *             obj2.mA();
         *             obj2.mB();
         *
         *        • When we create object polymorphic way and when our child class have some methods inside
         *          which is not @Override from parent Class/Interface. and when we need to use our child class methods
         *          We can use (down-casting) and make our parent one level down and let our Reference type use the
         *          child class methods.
         */

        Mac newMac = (Mac) mac;
        newMac.code();

        ((Mac) mac).code(); // Another way to down-casting.
    }
}
