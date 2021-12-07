package oop.day_38_InheritanceContinue;

/**
 * @author esalkan
 *
 */
public class _11_FullTimeEmployee extends _10_Employee {

	// Override the method from Parent Class _10_Employee
	@Override
	void calculatePay(int hours, double rate) {
		double total = (hours * rate) * 1.05;
		System.out.println("FullTime Employee Total Pay : " + total);
	}

}
