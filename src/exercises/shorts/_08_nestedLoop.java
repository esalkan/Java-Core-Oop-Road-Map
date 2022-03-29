package exercises.shorts;

public class _08_nestedLoop {

    /**
     *
     * - Nested loops mean; declaring a loop inside the another loop. That nested loop we are using whenever we have
     * a loop that means to be repeated multiple times.
     *  -- İç içe döngü; bir döngü içerisinde, bir başka döngü oluşturmaktır. Birden çok kez tekrarlanması gereken
     *  bir döngümüz olduğunda kullandığımız bu yapılardır.
     *
     *  - A loop can be nested inside another loop
     *  -- Bir döngü başka bir döngü içerisinde olabilir.
     *
     *  - Used for repeating a loop
     *  -- Bir döngüyü tekrar etmek için kullanılır.
     *
     *  - Each time the outerloop is repeated, the innet loop(s) is/are reentered and started.
     */
    public static void main(String[] args) {

        // From 1 to 5 write all numbers 5 times.

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                if (j == 5){
                    System.out.print(j);
                } else {
                    System.out.print( j + ",");
                }
            }
            System.out.println(" ");
        }
    }
}
