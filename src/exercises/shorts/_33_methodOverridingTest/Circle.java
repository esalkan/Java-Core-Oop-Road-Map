package exercises.shorts._33_methodOverridingTest;

public class Circle extends Shape {

    public double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

}
