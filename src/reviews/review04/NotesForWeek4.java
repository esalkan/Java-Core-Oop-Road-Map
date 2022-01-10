package reviews.review04;

public class NotesForWeek4 {
	/*
	 * Method Overloading
Classes and objects
Java memory
Scanner

*  Methods: Group of statements that do some action

!!!!!!custom methods help with making our code reusable and also maintainable.!!!!!

reusable -> we can call the method multiple times and it will work same way each time.

maintainable -> if we used the method in many different classes, 
and when there is need to update, we update in one place and it will affect each place 
it is called from.
----------------------------

*  declaring method: MUST be within class

Syntax:
*  AccessModifier  specifier   returnTYPE   MethodName (Parameter)
{statements}


   - AccessModifier: public, protected, default, private

FOR NOW ONLY USE PUBLIC
public: open to the worldspecifier 

  -  static, final, abstract, synchronized
FOR NOW ONLY USE STATIC

static: can be called through the class name
ClassName.MethodName


  -  returnType: void, any dataType
void: method does not return any    (Give the Etsy Example)

dataparameter: any dataType
void vs return
void: method will do an action, but there is no return value
return: method will do an action, and a single value is returned which can be used 
where the method is called


*  parameters: these are information passed to the method when its called. 
If a method has any parameters you must give the matching type
 when calling the method otherwise the code will not compile

	-  without parameter: if all info are known for completing the functionality

	-  with parameter: additional information that's must needed for the method 
	to complete the functionality

 *** if method passes parameter, we MUST give argument to the method when we call it

Give the calculator example




Method Overloading: multiple methods sharing the same name
Parameters MUST BE DIFFERENT (either data type or number of parameters)
SAME METHOD NAME DIFFERENT PARAMETERS
return does not matter (can be same or different)

advantage:1. easy to remember
2. easy to read
3. reusuable
4. flexible n


Give the example of Art
_____________________________________________________

	println(int)
	println(String)


Datatype parameter promotion 

	byte -> short -> int -> long -> float -> double

	If a given argument does not match exactly to a methods parameters, 
	it will try to promote to the closest bigger datatype in order to execute 
	that overloaded version

What is the role of returns types in method overloading

	- We cannot overload by changing the return type

	- If you overload successfully you can change the return type

_____________________________________________________

Classes and Objects

Class: template of an object. It will define attributes (data) and behaviors (actions)

Object: an instance of a class

class: Templete of object. where all objects are caming from
		indicates the attributes and actions/beharios of the object

CLASS is a blueprint/template for OBJECTS.
From CLASS we can create MULTIPLE OBJECTS.
CLASS is general description with ATTRIBUTES/DATA and BEHAVIOUR/ACTIONS.
OBJECT will have real DATA values, and can do ACTIONS. that are described in CLASS.

		Circle:
			attributes:
				radius

			action/behaviors:
					area()
					perimeter()


Instance variables: data which belongs to each object. 

Every object made will have its own copy of those variables

	default values:
		int = 0
		double = 0.0
		boolean = false
		object = null
		char = \u0000

Instance methods: action that belongs to each object

Local variables vs Instance variables

	java prioritizes local variables 


	toString(): converst the object to String
				executes automatically wheneever the object is passed to the console


Scrum Team example, Test Case example

Salary:
		attributes
			rate, weeklyHour, taxRate

		actions:
			setInfo(), salary(), totalTax(), salaryAfterTax(), toString()

Pizza:
		attribue:
			size
			numberOfCheeseTopping
			numberOfPeperoniTopping

		Actions:
			setInfo(), calculatePrice(), toString()

			assume that:
				size:
					small ==> $10
					medium ==> $11
					large ==> $12

				one cheese topping 1$
				one peporoniz topping 2$

___________________________________________________

Again a scope related question: can one call a method within another 
class/file in the same library > in the Eclipse project folder?

static vs non static
_____________________________________________________

Java memory

	Stack: methods, local variables, references 

	Heap: Objects

	Garbage Collection: clean the memory by removing objects with no references

garbage collector: responsible for collecting the objects that are eligible 
for garbage collection. and destroying it

	Garbage Collection: collection of garbage objects (unreferenced objects)
			
		unreferenced objects:
				1. re-assigning reference variables 
						String str = "java";
						str = "python";  // "java" is unreferenced and 
						eligible for garbage collection

						sout(str); // python

				2. assigning null
						String str = "Java";
							str = null;  // "java" is unreferenced and 
							eligible for garbage collection
_____________________________________________________

java file
.java

PIC -> package, import, class

	the .java file name needs to match the public class

Importing: when using files outside of the package

	import packageName.Class;

	import packageName.*;


java.lang package is automatically imported

_____________________________________________________

Scanner
	
	- helps us get user inputs from the console. 
	Allows us to get and use dynamic values to avoid hard coding

	import java.util.Scanner;

	Scanner obj = new Scanner(System.in);

Methods

	nextByte();
	nextShort();
	nextInt();
	nextLong();
	nextFloat();
	nextDouble();

next() vs nextLine()  GIVE the example 

	next(): only reads one word

	nextLine(): reads multiple words and accepts enter inputs


Common problem: 
	Whenever we use any Scanner method before a nextLine() method call 
	we have to handle the enter input by declaring an extra nextLine() 
	before the String input is saved

	 * 
	 * 
	 */

}
