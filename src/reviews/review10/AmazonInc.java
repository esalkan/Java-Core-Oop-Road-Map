package reviews.review10;

public class AmazonInc {

	public static void main(String[] args) {
		
		Tester tester = new Tester("Polad", "SDET", 'M', 35, 100000);
		
		tester.setJobTitle("Quality Engineer");
		tester.setAge(25);
		tester.findBugs();
		
		Developer developer = new Developer("Ibrahim", "Front End Developer", 'M', 35, 150000);
		
		developer.fixBugs();
		developer.setSalary(0);
		System.out.println(developer.getSalary());
		
		
		

	}

}
