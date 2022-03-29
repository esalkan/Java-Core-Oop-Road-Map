package exercises.shorts;

public class _04_switchStatement {
    /**
     * - Switch-case statement used to compare the value of a variable with multiple values and execute
     * some statements based on the match.
     * <p>
     * - Switch statement's expressions must be evaluated to a single value.
     * It CAN NOT be; long, double, float and boolean.
     * <p>
     * switch(expression){
     * case constant1:
     * statements;
     * break;
     * case constant2:
     * statements;
     * break;
     * default;
     * statements;
     * break;
     * }
     * <p>
     * Constant     : sabitler/değişmezler
     * Statement    : ifade/açıklama/beyan
     * Compare      : karşılaştırmma
     * Execute      : uygulamak
     * Based        : temelli / dayalı
     * Match        : eşleştirmek
     */

    public static void main(String[] args) {
        int number = 3;

        // Print name of the day
        switch (number) {
            case 1:
                System.out.println("1 =" + "Monday");
                break;
            case 2:
                System.out.println("2 = " + "Tuesday");
                break;
            case 3:
                System.out.println("3 = " + "Wednesday");
                break;
            case 4:
                System.out.println("4 = " + "Thursday");
                break;
            case 5:
                System.out.println("5 = " + "Friday");
                break;
            case 6:
                System.out.println("6 = " + "Saturday");
                break;
            case 7:
                System.out.println("7 = " + "Sunday");
                break;
            default:
                System.out.println("Invalid Day Number");
                break;
        }
    }
}
