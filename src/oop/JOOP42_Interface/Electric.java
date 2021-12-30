package oop.JOOP42_Interface;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
//	Creating an Interface
//	• An interface looks similar to a class, except the keyword interface is used 
//	instead of the keyword class
public interface Electric {
    // Interfaces can not have static method.

    // Fields in Interface
    // • An interface can contain field declarations, but all fields in an interface
    // are treated as final and static.
    // public static final boolean HAS_BATTERIES = true; // this is automatically changed to the "public static final" even if we are not
    // This one is totally fine too, BUT...
    boolean HAS_BATTERIES2 = false; // this is automatically changed to the public static final even if we are not
    // write this access modifiers

    // Creating an abstract method
    // • Methods that are specified in an interface have no bodies.
    void charge(); // public abstract

    // Inside the interface which methods created they are automatically created
    // abstract
    void charge2(); // this is automatically converted to the "public abstract" even we not write it
    // is "public abstract"

    /*
     * Default and Static Methods
     * • Beginning in Java 8, interfaces can have default and static methods.
     * • Default method is an interface method that has a body.
     *
     * 		public interface Teachable{
     * 			public default void readTopics(){
     * 				// Code
     *                        }
     *
     * 			public static int doResearch(){
     * 				// Code
     *            }* 		}
     */

    /* Interfaces can not have instance methods
    public void methodA(){ // this code block will give error.

    }
     */
    // Interfaces can have just, ABSTRACT, STATIC and DEFAULT methods.
    // methodA() and methodB() is regular methods. These are implementation and that's why we not need to
    // @Override these methods to the Tesla2 Class file
    // If we have default method, if one class implement both interfaces, we have to override the default method
    default void methodA() { // must be "public default" Access modifier // It is automatically "public"
        // code
        // methodA() and methodB() is implementation and that's why we not need to @Override these methods to
        // the Tesla2 Class file We cannot implement to the regular class.
    }

    default void methodB() { // must be "public default" Access modifier
        // code
        // methodA() and methodB() is implementation and that's why we not need to @Override these methods to
        // the Tesla2 Class file We cannot implement to the regular class.
    }

}
