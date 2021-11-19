package day_31_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _02_ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ***** Array List Class *****
		 * 
		 * ArrayList is a class in the Java that is similar to an array and allows you
		 * to store objects.
		 * 
		 * -> Unlike an array, an ArrayList object’s size is automatically adjusted to
		 * accommodate the number of items being stored in it.
		 * 
		 * -> An ArrayList object automatically expands as items are added to it.
		 * 
		 * -> In addition to adding items to an ArrayList, you can remove items as well.
		 * 
		 * -> An ArrayList object automatically shrinks as items are removed from it.
		 * 
		 * 
		 * ***** java. util. package *****
		 * 
		 * -> The ArrayList class is in the java.util.package, so the following import
		 * statement is required
		 * 
		 * import java.util.ArrayList;
		 * 
		 * ***** Creating An ArrayList *****
		 * 
		 * ArrayList<String> nameList = new ArrayList<String>();
		 * 
		 * ***** ArrayList Methods *****
		 * 
		 * add(value) -> Appends value at end of list
		 * 
		 * add(index, value) -> Inserts given value just before the given index,
		 * shifting subsequent values to the right
		 * 
		 * clear() -> Removes all elements of the list
		 * 
		 * indexOf(value) -> Returns first index where given value is found in list
		 * 
		 * get(index) -> Returns the value at given index
		 * 
		 * remove(index) -> Removes/Returns value at given index
		 * 
		 * size() -> Returns the number of elements in list
		 * 
		 * set(index, value) -> Replaces value at given index with given value
		 * 
		 * 
		 * ***** Capacity *****
		 * 
		 * - When an ArrayList objects is first created, it has initial capacity of 10
		 * items. This means that it can hold up to 10 items without having to increase
		 * its size.
		 * 
		 * - We can specify a different starting capacity by passing an int argument to
		 * the ArrayList
		 * 
		 * ArrayList<String> nameList = new ArrayList<String>(100);
		 * 
		 * 
		 * ***** Differences Between Arrays and ArrayList
		 * 
		 * -> Creating An Array/ArrayList :
		 * 
		 * -- Array : String[] a = new String[10];
		 * 
		 * -- ArrayList : ArrayList<String> a = new ArrayList<String>();
		 * 
		 * -> Accessing an element :
		 * 
		 * -- Array : a[index];
		 * 
		 * -- ArrayList : a.get(index);
		 * 
		 * -> Returning size :
		 * 
		 * -- Array : a.length
		 * 
		 * -- ArrayList : a.size();
		 * 
		 * -> Adding a new element :
		 * 
		 * -- Array :
		 * 
		 * -- ArrayList : a.add("London");
		 * 
		 * -> Inserting a new element :
		 * 
		 * -- Array :
		 * 
		 * -- ArrayList : a.add(index,"London");
		 * 
		 * -> Removing an element :
		 * 
		 * -- Array :
		 * 
		 * -- ArrayList : a.remove(index);
		 * 
		 * -> Removing all elements :
		 * 
		 * -- Array :
		 * 
		 * -- ArrayList : list.clear();
		 * 
		 */

		// Creating an ArrayList
		ArrayList<String> list = new ArrayList<>();

		System.out.println("+-----o----- add() -----o-----+");
		// Assingning :
		// add() Method : Appending values at end of list one by one.
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add(new String("Java"));
		System.out.println("list.add(\"a\");\n" + "list.add(\"b\");\n" + "list.add(\"c\");\n" + "list.add(\"d\");\n"
				+ "list.add(\"e\");\n" + "list.add(new String(\"Java\"));");

		System.out.println("\n+-----o----- println(list) -----o-----+");
		System.out.println("print all list members : " + list);
		System.out.println("Print index value of list : " + list.get(list.size()-1));
		
		System.out.println("\n+-----o----- toString() -----o-----+");
		System.out.println(list.toString());

		System.out.println("\n+-----o----- add(index, value) -----o-----+");
		// add(index, value) Method:
		list.add(1, "1");
		System.out.println("list.add(1, \"1\");");

		System.out.println("\n+-----o----- indexOf(value) -----o-----+");
		// indexOf(value) Method : returns index of the given value in ArrayList
		int where = list.indexOf("b");
		System.out.println("indexOf(\"b\") is : " + where);

		System.out.println("\n+-----o----- get(index) -----o-----+");
		// get(index) Method : return member of given index
		String whereMember = list.get(2);
		System.out.println("list.get(2) is : " + whereMember);

		System.out.println("\n+-----o----- size() -----o-----+");
		// size() Method : Returns the number of elements in list
		int size = list.size();
		System.out.println("Size of the ArrayList (list) : " + size);

		System.out.println("\n+-----o----- remove(index) -----o-----+");
		// remove(index) Method : Removes/Returns value at given index
		String remove = list.remove(2);
		System.out.println("Will remove list.remove(2) is : " + remove);
		System.out.println("After remove \"b\" list is : " + list);

		System.out.println("\n+-----o----- set(index, value) -----o-----+");
		// set(index, value) Method : Replaces value at given index with given value
		String setValue = "Alkan";
		list.set(0, setValue);
		System.out.println("String setValue = \"Alkan\";\n" + "list.set(0, setValue);");
		System.out.println("After set(value) list members are : " + list);

		System.out.println("\n+-----o----- clear() -----o-----+");
		list.clear();
		System.out.println("After clear() list members are : " + list);
		System.out.println("After clear() list size is : " + list.size());
		

		System.out.println("\n+----- ----- ----- o ----- ----- -----+");
		System.out.println("Creating an ArrayList<Integer> nums = new ArrayList<>();");
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(3);
		nums.add(1453);
		nums.add(571);
		nums.add(1923);
		nums.add(1981);
		nums.add(new Integer("54"));
		System.out.println(nums);
		
		
		
	}

}
