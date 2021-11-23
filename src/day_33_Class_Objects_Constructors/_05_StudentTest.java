package day_33_Class_Objects_Constructors;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class _05_StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		_06_StudentClass std1 = new _06_StudentClass("Alkan", 40, 'M', 1981, "Java");
		_06_StudentClass std2 = new _06_StudentClass("John", 30, 'M', 1990, "Java");
		
		System.out.println(std1.name);
		System.out.println(std1.age);
		System.out.println(std1.gender);
		System.out.println(std1.year);
		System.out.println(std1.course);
		System.out.println(std1.university);
		
		System.out.println();
		
		System.out.println(std2.name);
		System.out.println(std2.age);
		System.out.println(std2.gender);
		System.out.println(std2.year);
		System.out.println(std2.course);
		System.out.println(std2.university);
		
		System.out.println();
		
		std1.attendLab();
		std1.attendLectue();
		std1.submitAssignment();
		
		System.out.println();
		
		std2.attendLab();
		std2.attendLectue();
	
		
		
		

	}

}
