package exercises.shorts;


import exercises.shorts._28_Inheritence.Animal;
import exercises.shorts._28_Inheritence.Cat;

public class _44_referenceTypeCasting {
    /*
        OOP POLYMORPHISM
        REFERENCE TYPE CASTING
            - Its mean casting one reference type to another reference type
            - IS-A (Inheritance) relationship must be, between the object type and reference type, we are casting
              it to, Otherwise ClassCastException will be thrown
            - There are two type of reference type casting;
                1. Up casting:
                    - Casting smaller reference type (Sub Type) to larger reference type (Super Type)
                    - Up casting will be done IMPLICITLY and cast operator is NOT REQUIRED
                    - Allows us to achieve polymorphism without any explicit action
                        Example Syntax:
                            Animal aCat = new Cat(); // up casting

                2. Down casting
                    - Casting the larger reference type (Super Type) to smaller reference type (sub-type)
                    - Down casting is done EXPLICITLY and cast operator MANDATORY
                    - Allows us to access the features of the objects type that are not in reference type.
                        Example Syntax:
                            Animal aCat = new Cat(); // up Casting
                            Cat cat = (Cat) aCat;    // down Casting
                            cat.meow();

                            Animal aCat = new Cat(); // up Casting
                            ((Cat)aCat.meow());     // down Casting
     */

    public static void main(String[] args) {
        // ----------o----------o----------o  UP CASTING  o----------o----------o----------o----------o----------

        Animal aCat = new Cat(); // up casting
        String name = aCat.name = "Arwen"; // reaching super type reference instances 
        System.out.println("aCat = " + name);
        aCat.sleep(); // using super reference type instance method.


        // ----------o----------o----------o DOWN CASTING o----------o----------o----------o----------o----------

        Cat cat = (Cat) aCat; // down casting
        cat.scratch(); // using Cat class instance method.
        cat.sleep();
        System.out.println("cat.toString() = " + cat.toString());

        // short way to down casting
        ((Cat) aCat).scratch();
    }
}
