package oop.JOOP43_Polymorphism;

public class AppleStore {
    public static void main(String[] args) throws NoSuchMethodException {
        // From AppleDevice Reference, we created Mac() object. which is extends AppleDevice.
        AppleDevice mac = new Mac();    // Polymorphic way creating an object.
        // Call the object method polymorphic way.
        mac.use();
        // mac.code();  // That code() method is inside the Mac class, but we create mac object with polymorphic way
                        // because of that, compiler firstly go to mac object class which is Mac(), check the lines
                        // search one @Override code() method. if it is not exist. compiler will give error.

        // The rule is ; Reference type decides what is accessible (If we create object polymorphic way), this is
        // weird portion of polymorphism

        System.out.println("-----o-----o-----o-----o-----o-----");

        Mac myMac = new Mac();
        myMac.use();
        myMac.code();

        System.out.println("-----o-----o-----o-----o-----o-----");

        AppleDevice watch = new AppleWatch();
        watch.use();
        // watch.wear();    // Compile error; because wear is not @Override


    }
}
