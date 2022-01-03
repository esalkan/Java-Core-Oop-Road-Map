package reviews.review02;

/**
 * @author esalkan
 * @project java-notes
 */
public class DifferenceBetweenAnd_BitwiseAnd {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 65;
        int i1 = 5;
        int i2 = 10;
        System.out.println(true | false); // true
        System.out.println(true || ++i1 == i2); // true difference
        // if the first statement is true does NOT go second one
        System.out.println(i1); // i1 value stays same
        System.out.println(false & true); // false
        System.out.println(false && ++i1 == i2); // false
        // if the first statement is false does NOT go second one
        System.out.println(i1);
        boolean result1 = (i1 == i2) && (++ch1 == ch2);
        System.out.println(result1);
        System.out.println(ch1);  // A
        boolean result2 = (i1 == i2) & (++ch1 == ch2);
        System.out.println(result1);
        System.out.println(ch1); // B
        System.out.println("----Discord Question----");
        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2; // b=3, b=2, true && b=1 false
        System.out.println(res);
        /* ++b==2 -> 3==2 -> false
         * --b==2 -> 2==2 -> true
         * --b==1 -> 1==2 -> false
         */
    }
}
