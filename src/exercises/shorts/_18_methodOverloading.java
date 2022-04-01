package exercises.shorts;

public class _18_methodOverloading {

    /**
     * METHOD OVERLOADING
     * <p>
     * - Allow us, to have more than one method with same name
     * - Parameters must be different
     * - Parameters datatype or number of parameter must be different
     * - Improves code readability and re-usability
     * - It's easier to remember one method name instead of multiple method.
     */

    public static void main(String[] args) {

        int sum1 = sum(2,1);
        int sum2 = sum(2,1,3);
        int sum3 = sum(2,1,3,4);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);

        double sum4 = sum(2,1);
        System.out.println("sum4 = " + sum4);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d;
    }

}
