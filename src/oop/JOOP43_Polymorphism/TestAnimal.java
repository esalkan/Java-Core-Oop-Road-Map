package oop.JOOP43_Polymorphism;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TestAnimal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Parent       Child       relationship
        Animal a = new Animal();
        Animal d = new Dog();   // polymorphic way creating object
        Animal b = new Bird();  // polymorphic way creating object

        // Parent       Child       relationship
        Animal animal = new Animal();
        animal = new Dog();
        animal = new Bird();

        // Here there is not any parent - child relationship and can not polymorphism.
        // Bird x = new Dog();


    }
}

class Animal{};
class Dog extends Animal{};
class Bird extends Animal{};
