package reviews.review08;

public class Microsoft {

	public static void main(String[] args) {
		
	// 	Employee emp1 = new Employee();  since we don't have a default a constructor anymore it gives error
		
	int [] nums = {1 , 2, 3};	// dataType is int
	
	// my data type will be from Employee class, dataType is Employee
		
//	Employee emp1 = new Employee("Eyup", "SDET", 10, 100.000); 
//	Employee emp2 = new Employee("Vasilica","ScrumMaster",5,120.000);
	
	// dataType is Employee
	Employee [] testers = {
			new Employee("Eyup", "SDET", 10, 100_000),
			new Employee("Vasilica","ScrumMaster",5,120_000),
			new Employee("Selena","QA Engineer",7,85_000),
			new Employee("Merve","Senior_SDET",8,150_000)
	};
	
	double minSalary = Double.MAX_VALUE;
	double maxSalary = Double.MIN_VALUE;
	
	String personWhoMakesMax = "";
	String personWhoMakesMin = "";
	
	// for(int  each: nums) {	}
	
	for(Employee each: testers) {
		if(each.salary>maxSalary) {
			maxSalary = each.salary;
			personWhoMakesMax = each.name;
			System.out.println(each.companyName);
		}
		if(each.salary<minSalary) {
			minSalary = each.salary;
			personWhoMakesMin = each.name;
		}
	}
	
	System.out.println(personWhoMakesMax+" makes maximum salary : "+ maxSalary);
	
	System.out.println(personWhoMakesMin+ " makes minumum salary : "+ minSalary);
	
	
	
	
	}

}
