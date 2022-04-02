package exercises.shorts._22_classObjectExamples;

public class DogClass {

    public String name;
    public String breed;
    public String size;
    public int age;
    public String color;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void bark(){
        System.out.println(name + " is barking.");
    }

    public void play(){
        System.out.println(name + " is playing.");
    }

    // If that method is not added to the class, that will not print the selected instances
    @Override
    public String toString() {
        return "DogClass{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
