package exercises.shorts;

public class _15_customMethod_Void {

    /**
     * METHOD
     * - it is a function
     * - Grouping a series of code fragments to perform a task.
     * - Allow us to reuse the function rather than repeating same set of statements.
     *
     *
     * - ACCESS MODIFIER : Determines the visibility, public is open to the world and always accessible.
     * - STATIC MODIFIER : Allows us to call the method through the class nae.
     * - RETURN TYPE     : Determines if the method returns a value. If the return type is void
     *                     method does not return any value.
     * - METHOD NAME     : Descriptive name of the function,
     *                     the same rule that apply to variable names also apply to method names.
     *
     *  (AccessModifier) (StaticModifier) (ReturnType) (MethodName)
     *      public          static          void        welcomeMessage(){
     *          // Method body.
     *      }
     */

    public static void welcomeMessage(){
        System.out.println("Hello World");
        System.out.println("I love JAVA");
    }

    public static void main(String[] args) {
        welcomeMessage();
    }
}
