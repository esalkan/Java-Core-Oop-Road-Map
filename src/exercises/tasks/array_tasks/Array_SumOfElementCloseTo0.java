package exercises.tasks.array_tasks;

public class Array_SumOfElementCloseTo0 {

    /*
        return the sum of the two elements closest to zero
     */

    public static int getSumOfTwoClosestToZeroElements(int[] a) {
        /*
        If there are two elements equally close to zero like -2 and 2,
        consider the positive element to be "closer" to zero than the negative one.
        */

        int b[] = new int[2];
        int z = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (z == 0)
                    z = sum;
                if (Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(z)) {
                    z = sum;
                    b[0] = a[i];
                    b[1] = a[j];
                }
            }
        return z;
    }


}
