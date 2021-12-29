package oop.JOOP43_Polymorphism;

public class Mac extends AppleDevice {

    @Override
    public void use() {
        System.out.println("Mac | Code | Play");
    }

    public void code() {
        System.out.println("Mac is coding...");
    }
}
