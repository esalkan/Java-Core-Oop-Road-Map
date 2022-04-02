package exercises.shorts;

public class _22_classObjects {
    /**
     * CLASS & OBJECT
     * <p>
     * CLASS
     * - Class blueprint of the object, it is where objects came from
     * - An entity that determines how an object will behave and what the object will contain
     * - A blueprint or set of instructions to build a specific type of objects.
     * <p>
     * OBJECT
     * - Instances of class
     * - An object can store data
     * - The data stored in an object are called fields.
     * - Multiple object can be created from a class.
     * <p>
     * INSTANCE VARIABLE
     * - Declare inside the class and outside any methods
     * - Belongs to the object, and each object has its own memory
     * - Each object has a separate copy of the instance variable
     * <p>
     * INSTANCE METHODS
     * - Does not have static keyword
     * - Belongs to the object
     * - Each object has a separate copy of the instance methods
     */


    public String name;
    public String lastName;
    public int age;
    public boolean active;


    public void talk() {
        System.out.println(name + " Talking");
    }

    public void walk(){
        System.out.println(age + " years old " + name + " person walking");
    }

}
