/**
 * 
 */
package core.reviews.week_02;

/**
 * @author esalkan
 *
 */
public class arithmeticOperatorsReview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Division in math 10/3 = 3.3333 in Java 10/3 = 3 the reason int/int=int in
		 * Java 10/3.0 = 3.3333 the reason int/double = double in Java 10.0/3= 3.3333
		 * double/int = double
		 */
		System.out.println("10/3 " + (10 / 3));

		System.out.println("10.0/3 " + (10.0 / 3));

		int num1 = 10;
		double num2 = 3.0; // when you divde int/double the result variable
		// type should be double
		int result = (int) (num1 / num2); // explicit casting, we do it not the compiler
		// if compiler do casting: implicit casting

		System.out.println("10/3.0 " + (10 / 3.0));

		System.out.println("result is " + result);

		// Salary Calculation
		int hourlyRate = 60; // in dollars
		double taxRate = 0.3; // deduct from yearly salary
		int weeklyHour = 40;
		// you are working 48 weeks a year
		// totalTax = salary*taxrate
		// calculate how much I will make a year after Tax deducted

		// annual salary before Tax
		int salary = (48 * weeklyHour) * hourlyRate;
		System.out.println("Your salary before tax is " + salary);

		// yearly Tax that I have to pay
		double totalTax = salary * taxRate;
		System.out.println("Total tax is " + totalTax);

		// My salary after I pay my tax to my nice government
		double salaryAfterTax = salary - totalTax;
		System.out.println("My salary after Tax is " + salaryAfterTax);

		// how much I am making every month after tax reduction

		double eachMonthSalary = salaryAfterTax / 12;
		System.out.println("I make every month after tax " + eachMonthSalary);

	}

}
