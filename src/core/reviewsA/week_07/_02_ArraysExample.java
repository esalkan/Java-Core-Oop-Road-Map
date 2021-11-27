package core.reviewsA.week_07;

/**
 * @author esalkan
 *
 */
public class _02_ArraysExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create an int array which has HTML status codes of:
		// 200, 201, 204, 400, 401, 403, 404, and 500 "statusCodes"

		int[] statusCodes = { 200, 201, 204, 400, 401, 403, 404, 500 };

		System.out.println("--------size of my array----------");

		System.out.println(statusCodes.length);

		String[] responseTypes = { "OK", "Created", "No Content", "Bad Request", "Unauthorized", "Forbidden",
				"Not Found", "Internal Server Error" };

		// Loop through each element of these arrays you have two options:
		// for loop with index numbers, the first one "0" and last one "length-1", we
		// know the size
		// 200 Status Code : OK

		for (int i = 0; i < statusCodes.length; i++) {

			System.out.println(statusCodes[i] + " Status Code : " + responseTypes[i]);
		}

		// for each loop: this type loop only can be used with collections and Data Structures (like array)
		// Array, ArrayList, List, Map ..etc
		// advantages: easier syntax, no need to deal with index, disadvantage: you can not make your loop 
		// go backwards 

		System.out.println("----for each loop----");
		int j = 0;
		for (String response : responseTypes) {
			System.out.println(statusCodes[j] + " Status Code : " + response);
			j++;
			// System.out.println(response);
		}

	}

}
