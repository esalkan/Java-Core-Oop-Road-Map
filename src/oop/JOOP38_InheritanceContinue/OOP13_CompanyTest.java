package oop.JOOP38_InheritanceContinue;

/**
 * @author esalkan
 *
 */
public class OOP13_CompanyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// From Patent Class create an object
		OOP10_Employee emp = new OOP10_Employee();

		// From Sub class created an object
		OOP11_FullTimeEmployee ft = new OOP11_FullTimeEmployee();

		// From Sub class created an object
		OOP12_Contractor ct = new OOP12_Contractor();

		// From Parent class calculatePay() method called.
		emp.calculatePay(40, 40);

		// From SubClass Overrided calculatePay() method called from Parent class
		ft.calculatePay(40, 40);

		// From SubClass Overrided calculatePay() method called from Parent class

		ct.calculatePay(40, 40);

	}

}
