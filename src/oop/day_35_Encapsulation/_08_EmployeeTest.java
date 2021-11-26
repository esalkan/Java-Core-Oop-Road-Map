package oop.day_35_Encapsulation;

/**
 * @author esalkan
 *
 */
public class _08_EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		_07_Employee e1 = new _07_Employee();
		_07_Employee e2 = new _07_Employee("Mark", 392119);
		_07_Employee e3 = new _07_Employee("Tedd", 817283, "Sales", "Sales Person");

		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
		System.out.println(e2.getName() + "|" + e2.getIdNumber() + "|" + e2.getDepartment() + "|" + e2.getPosition());
		System.out.println(e3.getName() + "|" + e3.getIdNumber() + "|" + e3.getDepartment() + "|" + e3.getPosition());

		e1.setName("Mike");
		e1.setIdNumber(89778);
		e1.setDepartment("Accounting");
		e1.setPosition("VP");

		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());

		System.out.println(e1.toString());

	}

}
