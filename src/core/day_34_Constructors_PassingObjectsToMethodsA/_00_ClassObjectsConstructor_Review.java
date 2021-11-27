package core.day_34_Constructors_PassingObjectsToMethodsA;

/**
 * @author esalkan
 *
 */
public class _00_ClassObjectsConstructor_Review {

	/**
	 * Constructors:
	 * 
	 * - is a method that is automatically called when an object is created
	 * 
	 * - used to initialize object's instance fields
	 * 
	 * - new keyword invoked the constructor
	 * 
	 * Creating Constructor
	 * 
	 * - matches the name of the class
	 * 
	 * - has no return type
	 * 
	 * public class Car{
	 * 
	 * 		public Car(){
	 * 
	 * 		}
	 * 
	 * }
	 * 
	 * Type of constructors:
	 * 
	 * - No argument constructors (default constructor)
	 * 
	 * - Parameterized constructors
	 * 
	 * Default constructor: if you do not have any custom constructor, then JVM will
	 * create one no-argument constrcutor for you
	 * 
	 * public class Car{
	 * 
	 * 		public Car(int make){
	 * 
	 * 		}
	 * 
	 * }
	 * 
	 * Car c1 = new Car(5); //will invoke the default construfctor
	 * 
	 * this keyword: reference variable that refers to the current object
	 * 
	 * public class Test{
	 * 
	 * 		int a;
	 * 
	 * 		int b;
	 * 
	 * 		public Test(int a,int b){
	 * 
	 * 		this.a=a;
	 * 
	 * 		this.b=b;
	 * 
	 * 		}
	 * 
	 * }
	 * 
	 * Constructor Overloading
	 * 
	 * - Basis of number of parameters, types of parameters, and the order
	 * 
	 * of paramters
	 * 
	 * public Car(int a){}
	 * 
	 * public Car(int a,int b){}
	 * 
	 * public Car(long b){}
	 * 
	 * Constructor Chaining : Calling one constructor from another constructor.
	 * 
	 * Chaining can be done using this() keyword. this() keyword should be always
	 * 
	 * be the first line of the constructor.
	 * 
	 * public void mA(int x){
	 * 
	 * 
	 */
}
