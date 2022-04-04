package exercises.shorts._40_Abstraction_INTERFACE_Test;

public class Circle extends Shape {

    // Circle Class instances
    double radius;
    double PI = 3.14;

    // Shape class is super/parent ABSTRACT class
    // Circle class is here CONSTRUCTOR class

    // Need to OVERRIDE Super/Parent ABSTRACT Class Methods
    @Override
    public double area() {
        return radius * radius * PI;
    }
}
