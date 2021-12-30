package core.JC32_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Random;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_CustomMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating an ArrayList
		ArrayList<Integer> numsList = new ArrayList<Integer>();

		// Add the elements in numsList ArrayList
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);

		System.out.println("+----- ----- printList(numsList) Method ----- -----+");
		// Call the Method
		printList(numsList);

		System.out.println();

		ArrayList<Double> doubleList = new ArrayList<Double>();

		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);

		double sum = sumList(doubleList);

		System.out.println("\n+----- ----- sumList(doubleList) Method ----- -----+");

		// Print what return from custom method
		System.out.println(Math.round(sum));

		// out of the method make multiply
		sum *= sum;

		// Print new value of the sum
		System.out.println(Math.round(sum));

		System.out.println("\n+----- ----- getList(int) Method ----- -----+");

		// Below we create dynamic arrayList ;)
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());

		System.out.println("\n+----- ----- getRandomList(int) Method ----- -----+");
		// Below we create dynamic arrayList ;)
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());

		System.out.println("\n+----- ----- convertToIntList(String) Method ----- -----+");
		System.out.println(
				"This method will convert a string ArrayList elements to string and\nprint and calculate sum of each elements");
		ArrayList<String> strNums = new ArrayList<String>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");

		ArrayList<Integer> converted = convertToIntList(strNums);
		System.out.println("\nConverted to the integer all elements after convert : " + converted);

		int temp = 0;
		for (Integer each : converted) {
			temp += each;
		}

		System.out.println("\nSum of the all elements after convert : " + temp);
	}

	// Creating a Custom printList Method Accepting ArrayList in Integer
	public static void printList(ArrayList<Integer> arrList) {
		// Print array list
		System.out.println(arrList);

		// Print arrayList
		for (Integer each : arrList) {
			System.out.print(each + " ");
		}
	}

	// Creating a Custom sumList Method Accepting ArrayList in Double
	public static double sumList(ArrayList<Double> arrList) {
		double sum = 0;
		for (Double each : arrList) {
			sum += each;
		}
		return sum;
	}

	// Creating a custom getList method accepting primitive data type in integer and
	// return us an ArrayList
	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			result.add(i);
		}
		return result;
	}

	// Creating a custom getRandomList method accepting primitive data type in
	// integer and
	// return us an ArrayList
	public static ArrayList<Integer> getRandomList(int set) {
		// Creating a new ArrayList which will keep random nummbers inside it.
		ArrayList<Integer> result = new ArrayList<Integer>();

		// Creating a new Random() Class Object
		Random rn = new Random();

		// Store all new created Random numbers in our new Created above result
		// ArrayList
		for (int i = 1; i <= set; i++) {
			// rn.nextInt(101) : between 0 to 100 will create random numbers
			result.add(rn.nextInt(101));
		}

		return result;

	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String> strToNums) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (String each : strToNums) {

			// Integer num = Integer.parseInt(each);
			// result.add(num);

			// or just in one line
			result.add(Integer.parseInt(each));
		}

		return result;
	}

}
