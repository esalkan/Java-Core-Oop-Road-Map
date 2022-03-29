package exercises.shorts;

public class _06_whileLoop {
    /**
     * WHILE LOOP
     *
     * - Repeated if statement
     *  -- Tekrarlı if ifadesi gibidir.
     *
     * - Condition is checked at loop start
     *  -- Koşul döngünün başlangıcında kontrol edilir.
     *
     * - Loop get terminated when condition is evaluated to false.
     *  -- Koşul false olarak değerlendirildiğinde sonlanır.
     *
     *  Boolean expression always return TRUE
     *
     *  Syntax =
     *          while(boolean expression){
     *              // Stateents;
     *          }
     *
     *  Example :
     *          while(num <= 5){
     *              System.out.println("Hello");
     *              num++;
     *          }
     */

    public static void main(String[] args) {

        int num = 1;

        while (num <= 5){
            System.out.println("num = " + num);
            num++; // Iterator place is important.
        }
    }
}
