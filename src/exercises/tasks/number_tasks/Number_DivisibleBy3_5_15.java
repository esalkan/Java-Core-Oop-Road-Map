package exercises.tasks.number_tasks;

public class Number_DivisibleBy3_5_15 {

    /*
    Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and 15,
                then it should only be displayed in DivisibelBy15' section

            if the number can be divisible by 3 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy3' section

            if the number can be divisible by 5 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy5' section

        EX:
            input: 100

            Output:
                 Divisible By 15 15 30 45 60 75 90
                 Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                 Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

    */


    public static void solution(int n) {
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int each : arr) {

            if (each % 15 == 0 && each % 3 == 0) {
                divisibleBy15 += each + " ";
            }

            if (each % 5 == 0 && each % 15 != 0) {
                divisibleBy5 += each + " ";
            }

            if (each % 3 == 0 && each % 15 != 0) {
                divisibleBy3 += each + " ";
            }

        }

        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);
    }


}
