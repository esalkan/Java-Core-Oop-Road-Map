package exercises.shorts._29_superKeywordExample;

public class Zoo_SuperKeyword {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobi", "Yes", 'F', 5,"Big","Gray-White");
        dog.sleep();                // Inherited from Animal Class
        dog.bark();                 // Coming from DOG Class
        System.out.println(dog.toString()); // Inherited from Animal Class
        System.out.println(dog.name);
        System.out.println(dog.breed);
        System.out.println(dog.gender);
        System.out.println(dog.age);
        System.out.println(dog.color);

        System.out.println("----------o----------o----------");

        Cat cat = new Cat("Arwen", "Yes",'F',3,"Small","White");
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

        Fish fish = new Fish("Dolphin", "Yes", 'F', 10, "small", "Gray");
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
