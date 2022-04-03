package exercises.shorts._24_staticsTest;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10.5);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(5);

        System.out.println("circle1 = " + circle1);
        System.out.println("circle1.pi = " + circle1.pi);
        System.out.println("circle2 = " + circle2);
        System.out.println("circle2.pi = " + circle2.pi);
        System.out.println("circle3 = " + circle3);
        System.out.println("circle3.pi = " + circle3.pi);


        System.out.print("circle1.printPI() = ");
        circle1.printPI();




    }
}
