package oop.JOOP43_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3]; // Holding 3 Objects
        shapes[0] = new Shape();
        shapes[1] = new Triangle();
        shapes[2] = new Square();

        /*
         * • getClass() method helps us to access the object information
         * • getClass().getName() : returns package.className of the object
         * • getClass().getSimpleName() : returns just the class name of the object
         */
        for (Shape each: shapes) {
            System.out.println("Access the Object Information : " + each.getClass());
            System.out.println("Package Class Name Object : " + each.getClass().getName());
            System.out.println("Class Name of the Object : " + each.getClass().getSimpleName());
            each.draw();    // Which class running from.
            System.out.println();
        }

        // Non-polymorphic way...
        // ArrayList<WrapperClass> referenceName = new Arraylist<WrapperClass>(); OBJECT
        // ArrayList<Shape> shapeList = new ArrayList<>(); // How to make it polymorphic way.???
        // shapeList.add(new Triangle());
        // shapeList.add(new Circle());

        // This is a polymorphic way creation.
        // List is Parent of the ArrayList, ArrayList implementing List.
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle());
        shapeList.add(new Circle());
        shapeList.add(new Square());

        for (Shape each : shapeList) {
            each.draw();
        }

    }
}
