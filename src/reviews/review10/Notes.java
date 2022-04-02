package reviews.review10;

public class Notes {
/*
 OOP Inheritance review
 Overriding   (PIQ: What is the difference between overloading and overriding?)
 
 	Inheritance: building Is A relation between classes (Has A relation) 
 	(super / sub  --- Parent / child)
 	Sub Class: inherits all VISIBLE variables and methods of Super class
 				Constructor of parent class is not inherited 
 				(However the sub class MUST call parent constructor)
 				
 				***Only parameterized constructor inside super class, have to be 
 				explicitly called
 				
 	Super Class: Can Not inherit anything from the Sub Class
 	
 class Person{
 name,gender,dateofBirth, eat(), drink(), sleep()  // Super Class
 }	
 
 class Student extends Person{  // Is A relation
 studentId, study()
 }
 
 class Teacher extends Person{ // Is A relation
 teacherId, teach()
 }
 
 class CodesOfMine{          CodesOfMine class Has A student, Has A teacher
 		Student student1;
 		Teacher teacher1;
 }
 
 
 Employee Task;
 	Employee:
 	name, gender, age, jobTitle, salary
 	work()

 Tester extends Employee
 	work()----> testing
 
 Developer extends Employee
 	work()----> coding
 
 SupportPersonel extends Employee
 	work()----> supporting the technical people
 	
AmazonInc  class to test our objects 	
 
 Instance Block : works everytime we create an object
 Static Block : works one time when we call the class 
 
 
 Method OverRiding: giving different implementation to the method at sub class
 
 only the instance method can be overridden 
 
 Access modifier need to be same or more visible (sub class)
 
 return type, method name, parameters MUST be same
 
 @Override annotation should be applicable 
 
 Private and final method cannot be overridden
 
 
 (OverLoading: same method name with different parameters 
 / methods need to be at the same class 
   Does not care about return type)
 
 
 WebDriver
 		get()
 		close()
 
 ChromeDriver          creating a chrome driver object
 		get(URL)  : opens in chrome browser
 
 FireFoxDriver         creating a firefox driver object
 		get(URL) : opens in firefox browser
 		
 		
 
 
 */

}
