package exercises.shorts;

public class _07_doWhileLoop {
    /**
     * Do...While Loop
     *
     * - Repeatedly executes same set of statement while condition is true
     * -- Koşul doğruyken, aynı ifade kümesini tekrar tekrar yürütür.
     *
     * - The statement is executed ONCE initially then condition is checked at loop end.
     * -- Kod bloğu(ifadeler) önce BİR KEZ çalıştırılır. sonra koşul ifadesi döngü sonunda kontrol edilir.
     *
     * - Code in loop body will executed at least ONCE.
     * -- Kod bloğu gövdesi en az BİR KEZ çalıştırılır.
     *
     * Syntax :
     *          do{
     *              // Loop Body
     *              // Statements
     *          } while(Boolean Expression);
     */

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Hello do while loop");
        } while (i >= 5);

        System.out.println("-----o-----o-----");

        while (i >= 5){
            System.out.println("Hello while loop");
        }

        System.out.println("-----o-----o-----");
        System.out.println("Write Hello Do While Loop in 5 Times");

        do {

            System.out.println(i + ": Hello Do While Loop");
            i++;
        } while (i < 5);
    }
}
