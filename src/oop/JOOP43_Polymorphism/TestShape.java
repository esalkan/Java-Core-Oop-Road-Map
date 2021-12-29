package oop.JOOP43_Polymorphism;

public class TestShape {
    public static void main(String[] args) {
        /*
         * Calling method in polymorphism
         * • When we call a method, it will call overridden version from a child class, if we have overridden the method.
         * • If method is not overridden, it will call parent/super class version.
         */

        Shape s1 = new Shape();
        s1.draw();

        Shape s2 = new Circle();
        // s2.draw();  // Compiler go to check Circle class, if there is @Override method which is draw() and run it.
                    // if child class which is Circle, if there isn't @Override method, go to parent Class
                    // It will run from parent class
    }
}
