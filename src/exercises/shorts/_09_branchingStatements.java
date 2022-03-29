package exercises.shorts;

public class _09_branchingStatements {
    /**
     * BRANCHING STATEMENTS
     *
     * BREAK & CONTINUE
     *
     * Break;
     * - Causes the termination of the loop
     * -- Döngünün sonlanmasına neden olur.
     *
     * - Tells to the interpreter to go onto the next statement of code outside of tge code.
     * -- Yorunmlayıcıya burada işlemi kesmesini ve bir sonraki adıma ya-da kod bloğundan dışarı çımasını söyler.
     *
     *          Loop{
     *              statement-1
     *              statement-2
     *              BREAK;
     *              statement-3
     *              statement-n
     *          }
     *
     *          * jumps out of the loop
     *
     *          ----------o----------o--------------------o----------o--------------------o----------o----------
     *
     * Continue Statement;
     * - Skips the current iteeration of the loop and jumps to the next iteration.
     *  -- O andaki yineleemeyi/iterasyonu pas geçer ve bir sonraki yinelemee/iterasyona geri döner.
     *
     */

    public static void main(String[] args) {

        // Breake; Statement

        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("----------o----------o----------");

        for (char i = 'A'; i <= 'Z' ; i++) {
            if (i == 'G'){
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("----------o----------o----------");

        // Continue; statement

        for (char i = 'A'; i <= 'Z' ; i++) {
            if (i == 'K' || i == 'R' || i == 'A' || i == 'L'  ){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
