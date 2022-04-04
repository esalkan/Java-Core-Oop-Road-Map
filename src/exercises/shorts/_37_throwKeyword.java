package exercises.shorts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _37_throwKeyword {

    public static void main(String[] args) {
        System.out.println("Throw Keyword");

        // throw new ArithmeticException("throw new ArithmeticException('MessageString')");
        // throw new InterruptedException("Just Test"); need to add method signature

        System.out.println("Enter your age : ");
        int age = new Scanner(System.in).nextInt();
        if (age < 0 || age > 130){
            throw new InputMismatchException("Invalid age : " + age);
        }

        System.out.println("age = " + age);
    }
}
