package exercises.shorts;

public class _16_customMethod_Parameter {
    /**
     * PASSING ARGUMENT TO METHOD
     *
     * - When we declare a method. parameters can be given
     * - Parameters passed to the method and act like variable
     * - Used for providing additional information the method must have to perform its task.
     *
     */

    // Static method
    public static void displayValue(int num){
        System.out.println("The given value coming from static method : " + num);
    }

    // Non-static method
    public void displayValue2(int num){
        System.out.println("That given value coming from non-static method = " + num);
    }

    public static void nameAge(String name, int age){
        System.out.println();
        System.out.println("Given name is : " + name);
        System.out.println("Declerated age is : " + age);
    }

    public static void driverLicense(int age, boolean citizenship){
        if (age < 21 ){
            System.out.println("Sory!!! " + age + " age is not eligible having license");
        } else if (age >= 21 && citizenship == true){
            System.out.println("All is well. Drive safe and use belt.");
        } else {
            System.out.println("Both condition needs to be match...");
        }
    }

    public static void main(String[] args) {
        // calling static method
        displayValue(5);

        // calling non-static method
        new _16_customMethod_Parameter().displayValue2(15);

        // 2 parameter method
        nameAge("Test",15);

        // Driver license
        driverLicense(21, true);
        driverLicense(22, true);
        driverLicense(22,false);
    }


}
