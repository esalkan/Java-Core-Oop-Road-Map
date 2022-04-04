package exercises.shorts;

import exercises.shorts._42_OOP_Polymorphism_Test.Circle;
import exercises.shorts._42_OOP_Polymorphism_Test.Rectangle;
import exercises.shorts._42_OOP_Polymorphism_Test.Shape;

public class _43_instanceof_keyword {
    /*
        INSTANCEOF KEYWORD
        - instanceof keyword can be used to CHECK if the object is certain class (Returns boolean)
     */

    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape = new Rectangle();

        if (shape1 instanceof Circle){
            System.out.println("It is Circle");
        } else {
            System.out.println("It is not Circle");
        }

        if (shape1 instanceof Rectangle){
            System.out.println("It is Rectangle");
        } else {
            System.out.println("It is not Rectangle");
        }

    }
}
