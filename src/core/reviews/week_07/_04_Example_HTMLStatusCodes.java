package core.reviews.week_07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _04_Example_HTMLStatusCodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// int [] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};
		// Ask the user what the user is getting as status code
		// 200 in scanner object --- > our method ---> return response statement
		Scanner scan = new Scanner(System.in);
		System.out.println("Tell me the status code you receive from the WebPage");
		int request = scan.nextInt();
		// System.out.println(responseConverter(request));
		System.out.println(responseConverterTWO(request));

	}

	// write a method called responseConverter (int request) -> return response
	// statement

	public static String responseConverter(int request) {
		String response = null;
		int[] statusCodes = { 200, 201, 204, 400, 401, 403, 404, 500 };
		String[] responseTypes = { "OK", "Created", "No Content", "Bad Request", "Unauthorized", "Forbidden",
				"Not Found", "Internal Server Error" };
		// Algorithm : compare request with int array, find the index of it then
		// give the index to second array and get the response
		int j = 0;

		for (int code : statusCodes) {

			if (code != request) {
				j++;
			} else {
				break;
			}
		}
		response = responseTypes[j];

		return response;
	}

	public static String responseConverterTWO(int request) {
		String response = "Status code not found";
		// 205 : -4
		int[] statusCodes = { 200, 201, 204, 400, 401, 403, 404, 500 };
		String[] responseTypes = { "OK", "Created", "No Content", "Bad Request", "Unauthorized", "Forbidden",
				"Not Found", "Internal Server Error" };

		int num = Arrays.binarySearch(statusCodes, request);
		// (-(insertion point) - 1)

		if (num >= 0 && num < statusCodes.length) {
			response = responseTypes[num];
		}

		return response;

	}
}
