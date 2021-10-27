package exercises.classAndObjects;

/**
 * @author esalkan
 */
public class Notes {

	/**
	 * @param args
	 */
	
	/* Classes : Where Objects Come From
	 *
	 * - A class is an entity that determines how an object will behave and what the object will contain.
	 * - A class is a blueprint or set of instruction to build a specific type of object.
	 * 
	 * 
	 * E.g : 
	 * 
	 * 
	 * 		DOG			- a class
	 *  |-----------|
	 * 	|   size    |
	 * 	|   age     | 	- Data Members
	 * 	|	color   |
	 * 	|-----------|
	 *  |	eat()	|
	 * 	|	sleep()	|
	 * 	|	sit()	|	- Methods	
	 * 	|	run()	|
	 * 	-------------
	 * 
	 * 		
	 */
	
	
	/*
	 * 	  OBJECTS
	 * 
	 * - Objects of the same type are defined using a common class.
	 * - An object is an instance of a class.
	 * - An object can store data. The data stored in an object are commonly called fields.
	 * - An object can perform operations. The operations that an object can perform are called methods.
	 * 
	 * 							breed = "Neapolitan Mastiff"
	 * 		DOG					size  = "Large"
	 *  -------------    /----  age	  = "5 Years Old"
	 * 	|	breed	|	/		color = "Black"
	 * 	|   size    |  /
	 * 	|   age     | /			
	 * 	|	color   |/			breed = "Maltese"
	 * 	|-----------|--------	size  = "Small"
	 *  |	eat()	|\			age   = "2 Years"
	 * 	|	sleep()	| \			color = "White"
	 * 	|	sit()	|  \	
	 * 	|	run()	|   \		breed = "Chow chow"
	 * 	-------------	 -----	size  = "Medium"
	 * 							age   = "3 Years Old"
	 * 							color = "Brown"
	 * 
	 */
	
	
	/*
	 * 	A Simple Class Example
	 *  
	 * 	 _ _ _ _ _ _ _ _ 		 _ _ _ _ _ _ _ _
	 * 	|				|		|				|
	 * 	|	Class Name	|		|		Dog		|
	 * 	| 				|		|				|	
	 * 	 ---------------		 - - - - - - - - 
	 * 	|				|		|	breed		|
	 * 	|	Fields		|		|	size		|
	 * 	|				|		|	age			|	
	 * 	 ---------------		|	color		|
	 * 	|				|		 - - - - - - - - 
	 * 	|	Methods		|		|				|
	 * 	|				|		|	getInfo()	|
	 * 	 ---------------		|				|	
	 * 							 - - - - - - - -
	 * 
	 * 
	 * 
	 * 	public	= Access modifier
	 * 	class	= keyword
	 * 	Dog		= Class Name
	 * 
	 * 
	 * 	public class Dog{
	 * 	
	 * 		String breed;
	 * 		String size;
	 * 		int	age;
	 * 		String color;
	 * 
	 * 
	 * 		
	 * 
	 * 
	 * 		public String getInfo(){
	 * 			return ("This is my new Dog");
	 * 		}
	 * 	}
	 * 
	 * 
	 */
	
	/*
	 * 
	 * Access Modifier
	 * 
	 * - An access modifier indicates how the class may be accessed.
	 * - The public access modifier indicates that the class will be publicly available to code that is written outside of the class.
	 * 
	 */
	
	/*
	 * Writing a Method
	 * 
	 * - Notice that the word static does not appear in the method header.
	 * - When a method is designed to work on an instance of a class, it is referred to as an instance method, 
	 * 	 and you do not write the word static in the header.
	 * 
	 * 	Public	= Access Modifier
	 * 	String	= Return Type
	 * 	getInfo	= Method Name
	 * 	()		= Parameter Declaration
	 * 
	 * 	Example Method ;
	 * 
	 * 		public String getInfo(){
	 * 			return ("This is my new dog");
	 * 		}
	 * 
	 */
	

}
