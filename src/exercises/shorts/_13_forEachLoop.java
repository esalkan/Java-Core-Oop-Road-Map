package exercises.shorts;

public class _13_forEachLoop {

    /**
     * FOR EACH LOOP
     * <p>
     * Used to access each successive value of a data structures.
     * There must be a data structure(ARRAY, COLLECTION, MAP) to use for each loop.
     * Iteration times and orders are fixed.
     * Does not have index numbers
     * <p>
     * Syntax :
     * for(dataType variableName : dataStructure){
     * // Statement
     * }
     * <p>
     * *** Data type must match with the successive values of the data structure.
     */

    public static void main(String[] args) {

        int[] nums = {3, 6, 9};

        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println("----------o----------o----------");
        
        String[] fruits = {"Apple","Orange","Raspberry","Banana"};

        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit + " = length is : " + fruit.length());
        }
    }
}
