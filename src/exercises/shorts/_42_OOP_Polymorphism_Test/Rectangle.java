package exercises.shorts._42_OOP_Polymorphism_Test;

public class Rectangle extends Shape {
    // Rectangle Class instances
    public double width, length;

    // Shape class is super/parent ABSTRACT class
    // Rectangle class is here CONSTRUCTOR class

    // Need to OVERRIDE Super/Parent ABSTRACT Class Methods
    @Override
    public double area() {
        return width * length;
    }

}
