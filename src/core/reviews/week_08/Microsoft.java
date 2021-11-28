package core.reviews.week_08;

/**
 * @author esalkan
 *
 */
public class Microsoft {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Eyüp", "SDET", 10, 100.000);
		
		Employee[] testers = {
				emp1, // This is created as an object
				new Employee("Enis", "QA", 8, 100.000),
				new Employee("Erdem", "Automation", 5, 100.000),
				new Employee("Cihan", "SDET", 1, 100.000),
				
		};
		
		double minSalary = Double.MIN_VALUE;
		double maxSalary = Double.MAX_VALUE;
		
		
		
		String personWhoMakesMax = "";
		String personWhoMakesMin = "";
		
		for (Employee each : testers) {
			if (each.salary > maxSalary) {
				maxSalary = each.salary;
				personWhoMakesMax = each.name;
			} 
			
			if (each.salary < minSalary) {
				minSalary = each.salary;
				personWhoMakesMin = each.name;
			}
		}
		
		System.out.println(personWhoMakesMax + " makes maximum salary " + maxSalary);
		System.out.println(personWhoMakesMin + " makes maximum salary " + minSalary);

	}

}
