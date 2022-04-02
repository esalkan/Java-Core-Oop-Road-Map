package exercises.shorts._29_superKeywordExample;

public class Fish extends Animal {

    // Special just for FISH
    public void liveUnderWater(){
        System.out.println(name + " is swimming under the water");
    }

    // If parent class doesnt have any default constructor
    // If parent class have parameterized constructor.
    // Than child class need to create a constructor with super class
    public Fish(String name, String breed, char gender, int age, String size, String color) {
        // this.name = name; // no need to do that. because parent class have that method and not need.
        super(name, breed, gender, age, size, color);
    }
}
