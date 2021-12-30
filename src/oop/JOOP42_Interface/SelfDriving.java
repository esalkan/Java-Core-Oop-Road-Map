package oop.JOOP42_Interface;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public interface SelfDriving {
    void selfDrive(); // public abstract

    default void methodA() { // must be "public default" Access modifier
        // code
        // methodA() and methodB() is implementation and that's why we not need to @Override these methods to
        // the Tesla2 Class file We cannot implement to the regular class.
    }

    static void methodB() { // must be "public default" Access modifier
        // code
        // methodA() and methodB() is implementation and that's why we not need to @Override these methods to
        // the Tesla2 Class file We cannot implement to the regular class.
    }

}
