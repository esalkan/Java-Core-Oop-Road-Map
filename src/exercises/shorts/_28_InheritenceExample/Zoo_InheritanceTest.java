package exercises.shorts._28_InheritenceExample;

public class Zoo_InheritanceTest {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Bobi";          // Inherited from Animal Class
        dog.breed = "Yes";          // Inherited from Animal Class
        dog.gender = 'F';           // Inherited from Animal Class
        dog.age = 5;                // Inherited from Animal Class
        dog.color = "Gray-White";   // Inherited from Animal Class
        dog.sleep();                // Inherited from Animal Class
        dog.bark();                 // Coming from DOG Class
        System.out.println(dog.toString()); // Inherited from Animal Class
        System.out.println(dog.name);
        System.out.println(dog.breed);
        System.out.println(dog.gender);
        System.out.println(dog.age);
        System.out.println(dog.color);

        System.out.println("----------o----------o----------");

        Cat cat = new Cat();
        cat.name = "Arwen";         // Inherited from Animal Class
        cat.breed = "Yes";          // Inherited from Animal Class
        cat.gender = 'F';           // Inherited from Animal Class
        cat.age = 3;                // Inherited from Animal Class
        cat.color = "White";        // Inherited from Animal Class
        cat.sleep();                // Inherited from Animal Class
        cat.meow();                 // Coming fromm CAT Class
        cat.scratch();              // Coming from CAT Class
        System.out.println(cat.toString()); // Inherited from Animal Class
        System.out.println(cat.name);
        System.out.println(cat.breed);
        System.out.println(cat.gender);
        System.out.println(cat.age);
        System.out.println(cat.color);

        System.out.println("----------o----------o----------");

        Fish fish = new Fish();
        fish.name = "Dolphin";      // Inherited from Animal Class
        fish.breed = "Yes";         // Inherited from Animal Class
        fish.gender = 'F';          // Inherited from Animal Class
        fish.age = 10;              // Inherited from Animal Class
        fish.color = "Gray";        // Inherited from Animal Class
        fish.sleep();               // Inherited from Animal Class
        fish.liveUnderWater();      // Coming From FISH Class
        System.out.println(fish.toString()); // Inherited from Animal Class
        System.out.println(fish.name);
        System.out.println(fish.breed);
        System.out.println(fish.gender);
        System.out.println(fish.age);
        System.out.println(fish.color);
    }
}
