package exercises.interview_exercises.number_tasks;

public class Number_SumAllDigitsUntilOneDigit {

    /*
    Sum all digits of a number until you have one digit number
    EX:
        input: 45659
        output:
                29
                11
                2
        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2
     */

    public static void main(String[] args) {

        int number = 45659;
        while (true) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                sum += digit;
            }
            number = sum;
            System.out.println(sum);
            if (sum < 9) {
                break;
            }
        }

    }


}
