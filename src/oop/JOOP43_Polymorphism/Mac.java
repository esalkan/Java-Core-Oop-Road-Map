package oop.JOOP43_Polymorphism;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Mac extends AppleDevice {

    @Override
    public void use() {
        System.out.println("Mac | Code | Play");
    }

    public void code() {
        System.out.println("Mac is coding...");
    }
}
