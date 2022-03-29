package exercises.shorts;

public class _05_forLoop {

    /**
     * For Loop
     *
     * - For loop using for repeating actions.
     *  -- For döngüsü tekrarlayan işlemler için kullanılır.
     *
     * - Runs the given code a specific number of timme
     *  -- Verilen codu belirtilen sayı kadar çalıştırır.
     *
     * - Initialization is the starting point of the loop
     *  -- Başlatıcı değer, döngünün başlangıç noktasıdır.
     *
     * - Condition is the end point of the loop
     *  -- koşul/şart döngünün bitiş noktasıdır.
     *
     * - Iterator responsible for making the condition false
     *  -- Artırıcı/Sayai koşulu false'a döndürmekten sorumludur.
     *
     *  Syntax :
     *      for(initialization; condition; iterator){
     *          // Statements
     *      }
     *
     *      for (int i = 0; i <= 5; i++){
     *          System.out.println("Hello");
     *      }
     *
     */

    public static void main(String[] args) {

        int finish = 5;

        for (int start = 0; start < finish; start++) {
            System.out.println("Hello");
        }
    }
}
