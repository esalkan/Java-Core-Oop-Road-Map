package oop.day_38_InheritanceContinue;

/**
 * @author esalkan
 *
 */
public class _13_CompanyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// From Patent Class create an object
		_10_Employee emp = new _10_Employee();

		// From Sub class created an object
		_11_FullTimeEmployee ft = new _11_FullTimeEmployee();

		// From Sub class created an object
		_12_Contractor ct = new _12_Contractor();

		// From Parent class calculatePay() method called.
		emp.calculatePay(40, 40);

		// From SubClass Overrided calculatePay() method called from Parent class
		ft.calculatePay(40, 40);

		// From SubClass Overrided calculatePay() method called from Parent class

		ct.calculatePay(40, 40);

	}

}
