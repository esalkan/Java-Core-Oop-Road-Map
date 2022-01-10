package reviews.review03;

import java.util.Scanner;

public class Assignment5_Q_4 {

    public static void main(String[] args) {

        /**
         *  Question-4:
         *  Write a while loop that
         *  lets the user enter a number.
         *  The number should be
         *  multiplied by 10,
         *  and the result stored in the variable product.
         *  The loop should iterate as long as product contains a value less than 100.
         */

        // lets the user enter a number
        Scanner object;  // Declaring a variable named object
        object = new Scanner(System.in); // initialization of object

        int product;  // Declaring a variable
        product = 0; // initialization

        // What if user enters a bigger number than 10
        // I want to warn the user to put the number again


        while (product < 100) {

            System.out.println("Enter a number : ");
            int number = object.nextInt();

            if (number * 10 > 100) {
                System.out.println("Invalid Number Range");
                continue;      // I am cutting the execution at this line
            }


            product += number * 10;
            System.out.println("Product value is " + product);
        }

        System.out.println("The End");


    }

}
