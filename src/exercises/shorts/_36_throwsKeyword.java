package exercises.shorts;

public class _36_throwsKeyword {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        try {
            Thread.sleep(3000); // Checked Exception
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("World");

        // with handle with that checked exception beside the method need to use
        // throws InterruptedException
        // just check the main method
        Thread.sleep(4000);


    }
}
