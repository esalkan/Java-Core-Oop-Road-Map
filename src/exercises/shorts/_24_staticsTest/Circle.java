package exercises.shorts._24_staticsTest;

public class Circle {

    public double radius; // non-static instance field

    public static double pi = 3.14; // static instance variable

    public double calcArea(){ // non-static methods
        return  radius * radius * pi; // accepts static or non-static variables.
    }

//    public static double calcArea2(){ // static method
//        return radius * radius * pi;  // not accept non static variables.
//    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void printPI(){
        System.out.println("pi = " + pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
