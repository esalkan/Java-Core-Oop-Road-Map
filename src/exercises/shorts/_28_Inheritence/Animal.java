package exercises.shorts._28_Inheritence;

public class Animal {
    // Common specifications for usage in Sub/Child Classes
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;


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
