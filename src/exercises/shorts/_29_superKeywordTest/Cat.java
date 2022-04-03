package exercises.shorts._29_superKeywordTest;

public class Cat extends Animal {

    // Special just for CAT
    public void meow(){
        System.out.println(name + " is meow now");
    }

    // Special just for CAT
    public void scratch(){
        System.out.println(name + " is scratch");
    }


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
}
