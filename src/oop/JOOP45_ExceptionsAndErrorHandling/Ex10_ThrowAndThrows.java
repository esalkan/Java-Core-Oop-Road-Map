package oop.JOOP45_ExceptionsAndErrorHandling;

/**
 * @author esalkan
 * @project java-notes
 */
public class Ex10_ThrowAndThrows {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception { // Here we can use throws Exception too
        /**
         * throw clause
         * • You can write code that throws one of the standard Java exceptions, or an instance of a custom
         *   exception class that you have designed.
         * • You can use throw statement to throw an exception manually. The general format of the throw
         *   statement is as follows:
         *
         *   Example :
         *            throw new ExceptionType(MessageString);
         */

        System.out.println("Hello World");

        // throw new RuntimeException("This is some exception");
        // throw new Exception("Another Exception");

        // -> This below exception is "Checked" exception and need to handle with try-catch
        // throw new Exception("This is some Another Exception");
        try {
            throw new Exception("This is some Another Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* This is just different usage example */
        String username = "";
        if (username.isEmpty()) {
            throw new RuntimeException("Username can not be empty");
        } else {
            System.out.println("Valid username");
        }


        sleep3(2);
    }

    /**
     * throws clause
     * • Throws clause informs the compiler that a method throws one or more exceptions.
     * • -> who call the method which have trows exception, who call it must be handle again with exception
     *
     * throws clause - RULE
     * • When you declare a CHECKED exception, whoever CALLS this method is responsible to HANDLE it or DECLARE again
     */
    public static void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    public static void sleep2(int seconds) throws InterruptedException {
        sleep(seconds); // surrond with try-catch or throws exception
    }

    public static void sleep3(int secons){
        // using try-catch or we can throws exceptions
        try {
            sleep2(secons);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

/**
 * Creating Custom Exceptions
 * • We can create our own exception classes by extending the Exception class or one of its subclass.
 *
 * Example :
 *
 * public class HungryException extends RuntimeException{
 *
 * }
 *
 * throw new HungryException();
 *
 */

/**
 * Learn : how try-catch blocks working
 * Learn : how try-catch-finally blocks working
 * Learn : Exception Objects
 * Learn : finally block
 * Learn : Checked and Unchecked Exceptions
 * Learn : Multiple try-catch blocks
 * Learn : throw and throws
 *
 */