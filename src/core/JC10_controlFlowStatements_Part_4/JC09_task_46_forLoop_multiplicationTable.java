package core.JC10_controlFlowStatements_Part_4;

import java.util.Scanner;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC09_task_46_forLoop_multiplicationTable {

	/**
	 * @param args
	 */

	// Write a program that the user to declare a positive integer.
	// it should then print the multiplication table of declared number.

	public static void main(String[] args) {
		int num = 10;

		for (int i = 1; i <= num; i++) {
			System.out.println(i + " * " + num + " = " + i * num);
		}

		// kullanıcının dışarıdan sayı girmesini isteyelim
		// ve girdiği sayının çarpım tablosunu oluşturalım.

		int tableRow = 10;

		Scanner input = new Scanner(System.in);
		System.out.println("Çarpım Tablosu Oluşturulacak olan sayıyı girin : \n");
		int number = input.nextInt();

		for (int i = 1; i <= tableRow; i++) {
			System.out.println(i + " * " + number + " = " + i * number);
		}
	}

}
