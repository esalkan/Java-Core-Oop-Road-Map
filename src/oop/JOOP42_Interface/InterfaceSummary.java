package oop.JOOP42_Interface;

public class InterfaceSummary {

    /*
     Abstract Class VS Interface
     - Abstract classes and Interfaces are used to achieve abstraction in JAVA

     - We can not instantiate abstract classes and Interfaces
            public abstract class Food{};
            public Interface Cookable{};

            Food food = new Food(); // Error
            Cookable cook = new Cookable(); // Error
      - We use abstract classes for setting foundation for subclasses. It is normally general idea.

      - Interfaces are used to add a feature to classes by providing abstract methods

      - Classes can extend one class/abstract class.
        Class can implement multiple interfaces
            public Interface Cookable{};
            public Interface Bakeable{};
            public abstract class Food{};

            Examples :
                public class Bread extends Food implements Bakeable{

                };

                public class Potatoes extends Food implements Cookable, Bakeable{

                };

      - Methods :
        - Abstract classes  : can have abstract and non-abstract methods.
        - Interfaces        : can have abstract, default and static methods.
        - Concrete class is responsible for providing implementation for the abstract methods.

            Examples :
                ABSTRACT CLASS METHODS EXAMPLE;

                public class abstract Food{
                    public abstract void eat(); // void eat() in abstract it will give ERROR. this class is not Interface

                    // This is instance method
                    public void serve(){
                        // Code.
                    }

                    // Static method.
                    public static void buy(){
                        // Code.
                    }
                }

               INTERFACE METHODS EXAMPLE;

               public interface Cookable{
                    public abstract void cook(); // A Abstract method
                    void store(); // A Abstract method too "public abstract" will be automatically added
               }

               public interface Bakeable{
                    // Default Method
                    public default void bakeInOven(){
                        // Code
                    }

                    // Static Method
                    public static void bake(String str){
                        // Code
                    }

                    public abstract void cook(); // A Abstract method
                    void store(); // A Abstract method too "public abstract" will be automatically added
               }


               public class Bread extends Food implements Bakeable{
                    @Override
                    public void eat(){
                        // Code
                    }
               }

               public class Potatoes extends Food implements Cookable, Bakeable{
                    @Override
                    public void eat(){
                    }

                    @Override
                    public void cook(){}

                    @Override
                    public void store(){}
               }

        NOTE : Abstract Class can have everything regular class has + Abstract class can have abstract method as well

        - VARIABLES :
            - Abstract classes can have instance, static and final variables.
            - Interfaces can oly have "public static final" variables

            Examples :
                Abstract Class Variables Example:
                    public abstract class Food{
                        String foodName;
                        public static int price;
                        public final boolean SPICY = true;

                    }

                Interface Variables Example:
                    public Interface Cookable{
                        public static final String ACTION = "Cook";
                        boolean CAN_BE_COOKED = true; // "public static final" is hidden and automatically added
                    }

       - Constructor :
            - Abstract classes can have constructors.
            - Interfaces can not have constructors.

            Examples :
                - Abstract Example;
                    public abstract class Food{
                        String name;

                        public Food(){
                            this.name = "Pizza";
                        }

                        public Food(String name){
                            this.name = name;
                        }
                    }

            - Interface Example;
                public Interface Cookable{
                    // We can not create constructor
                }

            public class Pizza extends Food{

                // We need the call the constructor explicitly
                public Pizza(){
                    super("Pasta");
                }
            }

       - Access Modifiers :
            - Abstract classes : can use all access modifiers with variables and methods.
            - Interfaces : can only use "public" access modifiers
                - Note : with JAVA-11 private final available too.

            Examples :
                - Abstract Example :
                    public abstract class Food{

                        public String name;
                        protected int quantity;
                        boolean isSpicy;
                        private boolean isTasty;

                        // NOTE : Abstract class have blocks.
                    }

                - Interface Example :
                    public Interface Cookable{
                        public static final String ACTION = "Cook";

                        // NOTE :Interfaces doesn't have blocks.
                    }

       - Inheritance :
            - Abstract classes : can extend a single abstract or non-abstract class and implement interfaces
            - Interfaces    : can extend multiple interfaces
                              support multiple Inheritance
                              can not extend classes

            public abstract class Food{}
            public Interface Friable{}
            public Interface Grillable{}

            public Interface Cookable extends Friable, Grillable{} // This is interface - can not extend classes.
                                                                   // Cookable is interface name here.

            public abstract class Soup extends Food{} // can extend a single abstract or non-abstract class and
                                                      // implement interfaces


            THE END.... :)
     */

}
