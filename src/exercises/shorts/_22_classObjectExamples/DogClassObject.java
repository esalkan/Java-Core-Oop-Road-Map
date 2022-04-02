package exercises.shorts._22_classObjectExamples;

public class DogClassObject {
    public static void main(String[] args) {
        DogClass dog1 = new DogClass();

        dog1.name = "Bobi";
        dog1.breed = "Kangal";
        dog1.size = "XXL";
        dog1.age = 9;
        dog1.color = "white-Gray";

        dog1.eat();
        dog1.play();
        dog1.bark();

        // to use that need toString() method in the reference class
        System.out.println(dog1);

    }
}
