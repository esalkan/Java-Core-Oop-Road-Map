package exercises.shorts;

public class _29_superKeyword {
    /*

    SUPER KEYWORD

    - Functionality of super keyword as same as this keyword.
    - super keyword functionality for calling instance variables, methods, constructors of super/parent class
    - usage is call and use super/parent instances(methods & variables)

    WHAT IS INHERITED TO THE SUBCLASS?
    - All the accessible variables and methods (depending on the access modifiers)
    - Private variables and methods are NOT inherited
    - Constructors are NOT inherited, but child class MUST call one of parent class' constructor.

    CALLING THE SUPER CLASS CONSTRUCTOR.
    - If parent class has default constructor, subclass calls it implicitly, otherwise super class' constructor need
    to be called explicitly in the subclass
    - The super keyword refers to an object's super class. We can use the super keyword to call a super class constructor.
    - super() is used call parent class constructor from Child class constructor.
    - If parent class has default (No-Argument) constructor, compiler will put super() automatically.
    - If parent class only has constructor with parameters, then child constructor MUST make a matching super(param) call.


    Example:

    // Animal (Parent/Super) Class
    public class Animal{
        public String name;
        public int age;

        public Animal(String name, int age){
            this.name = name;
            this.age = age;s
        }

        public void eat(){
           System.out.println(name + " is eating");
        }
    }



    // Dog (Sub/Child Class)
    public class Dog extends Animal{

        public Dog(String name, int age){
            super(name, age)
        }
    }

     */
}
