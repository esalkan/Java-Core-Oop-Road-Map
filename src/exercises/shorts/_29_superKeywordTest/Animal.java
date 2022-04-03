package exercises.shorts._29_superKeywordTest;

public class Animal {
    // Common specifications for usage in Sub/Child Classes
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

//    public Animal(){
//        // Default Constructor and this is to implicitly inherited to the chilc/sub classes.
//    }

    // This is parameterized Animal Constructor
    public Animal(String name, String breed, char gender, int age, String size, String color) {
        // If default constructor is not created, about that parameterized constructor
        // java will return compile error.
        //
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }

    /*
    public void bark(){
        // This is special for dog. if we put unique method to parent it will be in fish too
        // and this is not a right way to usage.
        System.out.println(name + " is barking");
    }
     */

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
