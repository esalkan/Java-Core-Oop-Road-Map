package exercises.shorts;

public class _17_customMethod_Return {

    /**
     * - Method can return a value by using a return statement
     * - Return type of the method CAN NOT be void, need to be a data type
     * - Method return type and returned value data type must be match
     */

    // void method
    public static void sum(int num1, int num2){
        int result = num1 + num2;
    }

    public static int sum1(int number1, int number2){
        int result = number1 + number2;
        return result;
    }


    // REVERSE A STRING
    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result = result + str.charAt(i);
        }

        return result;
    }

    // IS PALINDROME
    public static boolean isPalindrome(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result = result + str.charAt(i);
        }

        if (result.equalsIgnoreCase(str)){
            return true;
        }

        return false;
    }



    public static void main(String[] args) {
        // System.out.println("sum(1,2); = " + sum(1, 2)); // void method

        System.out.println("sum1(1,2) = " + sum1(1, 2));; //static int method

        System.out.println(reverse("alkan"));


        System.out.println("isPalindrome(\"Anna\") = " + isPalindrome("Anna"));
    }
}
