package exercises.shorts;
/*
    OOP Polymorphism Intro

    Poly + Morphism: (Many Forms) Ability
        - Ability of the objects to take on many forms.
        - Occurs when reference type is parent class/interface and object type is child
            Ex : Shape s1 = new Circle();

    POLYMORPHISM RULES
        - Only methods/variables in reference type can be called.
        - When we call a method, it will call overridden version from a child class
        - If method is not overridden, it will call parent/super class version.
        - Reference type can be PARENT Class or INTERFACE
        - Object type can be any EXTENDING or IMPLEMENTING child class
        - Reference type decides what is accessible
        - Object type decides which implementation of the method to be executed when the method is called.

        Animal a1 = new Dog();
        a1.bark(); // Compile Error

        Note: If in ReferenceType (Animal) doesn't have bark() method, but at the same time Dog Class have.
        That is mean nothing, for call it bark() method should be in the Abstract Class inside. Doesn't matter
        if dog class have or no.
 */

import exercises.shorts._42_OOP_Polymorphism_Test.*;

public class _42_OOP_Polymorphism {

    public static void main(String[] args) {
        // Ref. Type - Object Type
        Shape shape1 = new Circle();
        // shape1.raius = 10; // Not allowed because in Shape Abstract class not have radius.
        // Okay it is member of Circle Class but in polymorphism it is not allowed.

        Shape shape2 = new Rectangle();
        Shape shape3 = new Square();

        // All just can have area() method. Because; in REFERENCE TYPE Abstract Class have only area() method.
        // As we said just reference type is decides what will be accessible.
        System.out.println("shape1.area() = " + shape1.area());
        System.out.println("shape2.area() = " + shape2.area());
        System.out.println("shape3.area() = " + shape3.area());


        // VolumeInterface obj = new Circle(); // There is not any IS-A relationship between interface and Class
        VolumeInterface obj = new Cube();

    }
}
