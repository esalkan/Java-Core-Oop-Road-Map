package exercises.shorts._34_methodOverriding;

public class Rectangle extends Shape{

    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width * length);
    }
}
