package exercises.shorts;

public class _35_exceptionHandlingTryCatch {
    /*
        TRY & CATCH - Exception Handling

        - To handle an exception (Checked or Unchecked), we can use try catch blocks.

        Syntax:
            try{
                // Try block statements
                // Some code that might throw exception
            } catch (ExceptionClass e){
                // Catch block statements
                // handle exception (If try block can not)
            }

        Exception Object :
            - When run time exception happens, java will catch it and assigns to a variable in catch block.
            - After it is successfully caught, we can use the variable and call some methods on the exception object.
            - Popular methods of exception object are:
                1. printStackTrace(): full details of exception
                2. getMessage(): returns only brief description of the exception
     */

    public static void main(String[] args) {

        try {

            System.out.println(9/0); // That will give ArithmeticException during the run time.

            System.out.println("Try");

        } catch (RuntimeException e){

            e.printStackTrace();

            System.out.println("e.getMessage() = " + e.getMessage());

            System.out.println("Catch");

            // System.exit(0); // That line will terminate the execution

        } finally {

            System.out.println("Finally");

        }

        System.out.println("next code after try/catch block");
    }
}
