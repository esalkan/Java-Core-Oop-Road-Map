package oop.JOOP47_Collections_Part02;

import java.util.EnumMap;
import java.util.Stack;
import java.util.Vector;

/**
 * @author esalkan
 * @project java-notes
 */
public class StackTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /**                 STACK
         * - Stack is a subclass of Vector that implements a standard last-in, first out. (LIFO)
         *
         * LI-FO : Last in first out.
         */

        // Creating a Stack : Stack is a CLASS and you can create an object.
        Stack<Integer> numStack = new Stack<Integer>();
        // add() is coming from Collection you can use add() method which is overridden.
        numStack.add(54);
        numStack.add(541);
        numStack.add(1453);
        numStack.add(54); // Duplications are allowed. check line 20 same value added before.
        numStack.add(61);

        System.out.println("numStack = " + numStack);
        System.out.println("numStack.toString() = " + numStack.toString());

        // some unique methods for stack
        // peek() : check value on top of stack
        // pop()  : read value on top of stack then remove it

        System.out.println("numStack.peek() = " + numStack.peek()); // peek() : check value on top of stack
        numStack.pop(); // pop()  : read value on top of stack then remove it
        System.out.println("numStack.toString() = " + numStack.toString()); // after pop() last status of the numStack

        System.out.println("numStack.get(0) = " + numStack.get(0));
        System.out.println("numStack.get(1) = " + numStack.get(1));


        System.out.println("+----------o----------o----------o----------+");
        // POLYMORPHIC WAY CREATING A STACK WIA VECTOR CLASS AND DOWN CASTING
        // Creating a Stack : Stack is a CLASS and you can create an object.
        Vector<Integer> numStackToVector = new Stack<Integer>();
        // add() is coming from Collection you can use add() method which is overridden.
        numStackToVector.add(54);
        numStackToVector.add(541);
        numStackToVector.add(1453);
        numStackToVector.add(54); // Duplications are allowed. check line 20 same value added before.
        numStackToVector.add(61);

        System.out.println("numStack = " + numStackToVector);
        System.out.println("numStack.toString() = " + numStackToVector.toString());

        // some unique methods for stack
        // peek() : check value on top of stack
        // pop()  : read value on top of stack then remove it

        System.out.println("numStack.peek() = " + ((Stack<Integer>) numStackToVector).peek()); // peek() : check value on top of stack
        ((Stack<Integer>) numStackToVector).pop(); // pop()  : read value on top of stack then remove it
        System.out.println("numStack.toString() = " + numStackToVector.toString()); // after pop() last status of the numStack

        System.out.println("numStack.get(0) = " + numStackToVector.get(0));
        System.out.println("numStack.get(1) = " + numStackToVector.get(1));


    }
}
