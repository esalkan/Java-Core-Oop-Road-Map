package exercises.tasks.number_tasks;

public class Number_BinaryRepresentationOfN {

    /*
    return the number of '1's in the binary representation of n for any integer n, where n > 0

    Example:
        for n=6 the binary representation is '110' and the number of '1's in that representation is 2
     */

    public static int getCountOfOnes(int n) {

        String s = "";
        boolean result = n > 0;

        while (result) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;
            result = n > 0;
        }

        int count = 0;
        for (char each : s.toCharArray()) {
            if (each == '1') {
                count++;
            }
        }

        return count;
    }


}
