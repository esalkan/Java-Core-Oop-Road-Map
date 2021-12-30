package oop.JOOP43_Polymorphism;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Ipad extends AppleDevice {
    @Override
    public void use(){
        System.out.println("Ipad | Readbook");
    }

    public void draw(){
        System.out.println("Ipad drawing");
    }
}
