package exercises.questionsANDanswers.replit.oop;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class PersonI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Person class has following attributes:
		 * 
		 * private String instance variables: firstName, lastName private int instance
		 * variable: age Methods:
		 * 
		 * getter and setter methods for each instance variable. try to use `this
		 * keyword toString method. No parameters and returns person info in this
		 * format: firstName | lastName | age Note: does not print! no println in the
		 * method! Constructors:
		 * 
		 * 1) No-Args constructor
		 * 
		 * sets default values for the Person object name and lastName => "undefined"
		 * age => -1 2) 3-Args Constructor:
		 * 
		 * accepts firstName, lastName, age parameters and assigns values to
		 * encapsulated instance variable try to use this keyword Examples:
		 * 
		 * Person person = new Person();
		 * 
		 * System.out.println(person.getFirstName()); //"undefined"
		 * 
		 * System.out.println(person.getLastName()); //"undefined"
		 * 
		 * System.out.println(person.getAge()); // -1
		 * 
		 * System.out.println(person.toString()); //"undefined | undefined | -1"
		 * 
		 * person.setFirstName("John");
		 * 
		 * person.setLastName("Doe");
		 * 
		 * person.setAge(44);
		 * 
		 * System.out.println(person.toString() ); // "John | Doe | 44"
		 * 
		 * 
		 * Person person = new Person("Fatima", "Lee", 22);
		 * 
		 * System.out.println(person.getFirstName()); //"Fatima"
		 * 
		 * System.out.println(person.getLastName()); //"Lee"
		 * 
		 * System.out.println(person.getAge()); // 22
		 * 
		 * System.out.println(person.toString()); //"Fatima | Lee | 22"
		 */
		Scanner in = new Scanner(System.in);
		Person person = new Person();
		System.out.println(person.getFirstName());
		System.out.println(person.getAge());
		person.setAge(in.nextInt());
		System.out.println(person.getAge());

		Person person2 = new Person(in.next(), in.next(), in.nextInt());
		System.out.println(person.getLastName());
		System.out.println(person2.toString());

		Person p1 = new Person();
		System.out.println("p1.toString() = " + p1.toString());

		p1.setFirstName("Eyup Sabri");
		p1.setLastName("ALKAN");
		p1.setAge(36);

		System.out.println("p1.toString() = " + p1.toString());

	}

}
