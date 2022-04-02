package exercises.shorts;

public class _25_staticBlock {

    /**
     * STATIC INITIALIZER BLOCK
     *
     * STATIC BLOCK
     * - It's a self of instructions that is run only once when a class is loaded into memory.
     * --> Bir class, belleğe yüklendiğinde yanlızce bir defa çalıştırılan ve çalışan bir dizi talimatlar bloğudur.
     *
     * - A static block is also called static initialization block.
     * --> Statik blok aynı zamanda, statik başlatmma bloğu olarak adlandırılır/çağırılır.
     *
     *      public class Car {
     *          static {
     *              // Static block
     *          }
     *      }
     *
     *
     *      Static block loads during the class loading and run just one time.
     */

    public static int a;
    public static String str;
    public static char ch;

    static {
        a = 1453;
        str = "istanbul";
        ch = '@';
    }

//    Outside of the static main method that static instance variables can not be used. thats why
//    We have static blocks

//    public static void main(String[] args) {
//        a = 1453;
//        str = "istanbul";
//        ch = '@';
//    }

}
