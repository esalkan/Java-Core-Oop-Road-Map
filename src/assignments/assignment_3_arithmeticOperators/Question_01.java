package assignments.assignment_3_arithmeticOperators;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Question_01 {

	/**
	 * @param args
	 */
	
	//	Write a program to convert gallons into Liters and display it.
	//
	//    Sample output:
	//
	//   15 gallon is 56.7812 liter
	
	public static void main(String[] args) {
		System.out.println("+-------------------------------------------+");
		System.out.println("+            Week 2 Assignment              +");
		System.out.println("+               Question 1                  +");
		System.out.println("+        Gallon to Liter Convertor          +");
		System.out.println("+                                           +");
		System.out.println("+         1 Gallon = 3.78541178             +");
		System.out.println("+-------------------------------------------+");
	
		final double oneGallon = 3.78541178;
		Scanner io = new Scanner(System.in);
		System.out.println("How many gallons do you have?\nPlease Enter value of Gallon :");
		int gallon = io.nextInt();
		double liters = gallon * oneGallon;
		
		System.out.println("\n" + gallon + " gallon(s) is : " + liters + " liter(s)");
	}

}
