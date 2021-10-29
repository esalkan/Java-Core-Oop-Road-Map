package oop.day_39_Inheritance_AccessModifiers;


import java.text.*;
import java.util.Scanner;

class deneme {



  public static void main (String[] args) {
	     String input = "1 fish 2 fish red fish blue fish";
	     Scanner sc = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(sc.nextInt());
	     System.out.println(sc.nextInt());
	     System.out.println(sc.next());
	     System.out.println(sc.next());
	     sc.close(); 
  }

}

