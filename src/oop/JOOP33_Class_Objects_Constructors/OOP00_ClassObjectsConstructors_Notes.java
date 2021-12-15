package oop.JOOP33_Class_Objects_Constructors;

/**
 * @author esalkan
 *
 */
public class OOP00_ClassObjectsConstructors_Notes {

	/**
	 * 
	 * ***** o ***** Classes & Objects ***** o *****
	 * 
	 * • Class is a template/blueprint, where we define variable and methods
	 * 
	 * • Objects are the instances of the class. Each object will have its own copy
	 * of variables.
	 * 
	 * 
	 * ***** o ***** Constructors ***** o *****
	 * 
	 * • A constructor is a method that is automatically called when an object is
	 * created.
	 * 
	 * • Constructors are used to initialize the object’s instance fields.
	 * 
	 * • They are called constructor because the help construct an object.
	 * 
	 * • new keyword invokes the constructor of the class.
	 * 
	 * ***** o ***** Creating Constructors ***** o *****
	 * 
	 * • Constructor is a special method that matches the name of the class and has
	 * no return type.
	 * 
	 * ***** o ***** Types of Constructors ***** o *****
	 * 
	 * • No-argument Constructor: A constructor that has no parameter is known as
	 * default constructor. If we do not define a constructor in a class, then
	 * compiler creates default constructor(with no argument) for the class. If we
	 * write a constructor with arguments or no-arguments then the compiler does not
	 * create a default constructor. Default constructor provides the default values
	 * to object like 0, null, etc. depending on the type.
	 * 
	 * • Parameterized Constructor: A constructor that has parameters is known as
	 * parameterized constructor. If we want to initialize fields of the class with
	 * your own values, then use parameterized constructor.
	 * 
	 * 
	 * ***** o ***** this Keyword ***** o *****
	 * 
	 * • this is a reference variable in Java that refers to the current object.
	 * 
	 * 
	 * ***** o ***** Constructors Overloading ***** o *****
	 * 
	 * • Like methods, we can overload constructors for creating objects in
	 * different ways. Compiler differentiates constructors on the basis of numbers
	 * of parameters, types of the parameters and order of the parameters.
	 * 
	 * 
	 * ***** o ***** Constructors Chaining ***** o *****
	 * 
	 * • Constructor chaining is the process of calling one constructor from another
	 * constructor with respect to current object.
	 * 
	 * • Chaining can be done using this() keyword.
	 * 
	 * • this() keyword should always be the first line of the constructor.
	 * 
	 * 
	 * 
	 * ***** o ***** Difference Between Constructors and Methods ***** o *****
	 * 
	 * • Java Constructor •
	 * 
	 * •• A constructor is used to initialize the variables of a Class
	 * 
	 * •• A constructor must not have return type
	 * 
	 * •• The constructor has invoked automatically at the time of object creation.
	 * Constructors can be called explicitly when there are multiple constructors
	 * are defined.
	 * 
	 * •• The java compiler provides a default constructor if you do not have any
	 * constructor
	 * 
	 * •• Constructor name must be same as the class name
	 * 
	 * 
	 * • Java Method •
	 * 
	 * •• A method is used to define the behavior/functionalities of an object
	 * 
	 * •• The method may or may not have a return type
	 * 
	 * •• The method is invoked explicitly using the dot operator
	 * 
	 * •• There is no existence of default Method
	 * 
	 * •• Method name may or may not be same as class name
	 * 
	 * 
	 * ***** o ***** Passing Objects as Arguments ***** o *****
	 * 
	 * • When an object is passed as an argument to a method, the object’s address
	 * is passed into the method’s parameter variable. As a result, the parameter
	 * references the object.
	 */
}
