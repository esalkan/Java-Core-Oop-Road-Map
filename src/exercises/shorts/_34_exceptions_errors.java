package exercises.shorts;

import java.io.FileInputStream;


public class _34_exceptions_errors {

    /*
        EXCEPTION
        - An unwanted or an unexpected event
        - Occurs during the COMPILE TIME or during the RUNTIME
        - There are two categories exceptions: CHECKED and UNCHECKED EXCEPTIONS
        - To prevent exceptions from crashing our program. we must write code that detects and handles them.

        UNCHECKED EXCEPTIONS
        - That exceptions are not checked at COMPILE TIME
        - Occurs during the RUNTIME
        - Code will compile even if we do not handle them.
        - They have IS-A relationship with RuntimeException(parent class)

        CHECKED EXCEPTIONS:
        - Exceptions that are checked at compile time
        - Occurs during the COMPILE TIME
        - Code will not compile even if we do not handle them.
        - They DO NOT have IS-A relationship with RuntimeException class.
     */

    public static void main(String[] args){
        Integer[] arr = {10, 20, 30};

        // Trying to reach 20th element of array
        // System.out.println(arr[20]); // UNCHECKED EXCEPTION

        System.out.println("----------o----------o----------");

        // That FileInputStream need import FileInputStream package and throw exception
        // FileInputStream fileInputStream = new FileInputStream("file path"); // CHECKED EXCEPTION
        // if you not handle, code will not run and will give compile time error.
    }
}
