package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */

/*
 * final class
 * 
 * • When a class is declared with final keyword, it is called a final class. A
 * final class cannot be extended(inherited).
 * 
 * • You can not make a class immutable without making it final.(String class)
 */

// if we put final access modifier to class as shown below. Sub class will complain. that is as explained above. 
// Final class can not be extended (Inherited)
final public class FinalClass {


}

/*
class SubClass extends FinalClass {


}
*/