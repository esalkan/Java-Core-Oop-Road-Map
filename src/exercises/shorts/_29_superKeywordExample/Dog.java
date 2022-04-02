package exercises.shorts._29_superKeywordExample;

public class Dog extends Animal {

    // Special feature for DOG just dog can bark
    public void bark(){
        System.out.println(name + " is barking");
    }

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
}
