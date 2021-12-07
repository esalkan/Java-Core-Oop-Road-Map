package oop.day_38_InheritanceContinue;

/**
 * @author esalkan
 *
 */
public class _12_Contractor extends _10_Employee {

	// Override the method from Parent Class _10_Employee
	@Override
	void calculatePay(int hours, double rate) {
		double total = (hours * rate) + 200;
		System.out.println("Contractor Total Pay : " + total);
	}
}
