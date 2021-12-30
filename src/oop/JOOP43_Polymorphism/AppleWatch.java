package oop.JOOP43_Polymorphism;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class AppleWatch extends AppleDevice {

    @Override
    public void use(){
        System.out.println("Apple Watch | Sport");
    }

    public void wear(){
        System.out.println("Wearing apple watch");
    }
}
