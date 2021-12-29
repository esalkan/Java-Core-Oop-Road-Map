package oop.JOOP43_Polymorphism;

public class InstanceOf {
    public static void main(String[] args) {
        /*
         * instanceof
         * • instanceof operator can be used to check if the object is certain class.
         */

        Shape sh = new Circle();

        if (sh instanceof Triangle){
            System.out.println("Yes sh is instance of Triangle");
        } else if (sh instanceof Circle){
            System.out.println("Yes sh is instance of Circle");
        } else {
            System.out.println("sh is instance of Square ");
        }
    }
}
