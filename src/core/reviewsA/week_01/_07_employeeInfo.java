/**
 * 
 */
package core.reviewsA.week_01;

/**
 * @author esalkan
 *
 */
public class _07_employeeInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * name
		 * companyName
		 * jobTitle
		 * gender
		 * salary
		 * employeeID
		 * hasBenefits(Y/N)
		 * isMarried
		 * 
		 * 
		 */
		
		String name = "ALKAN";
		String companyName = "CFM";
		String jobTitle = "SDET";
		String gender = "Male";
		int salary = 100_000;
		int employeeID = 12345;
		boolean hasBenefits = true;
		boolean isMarried = true;
		
		System.out.println(name+" "+companyName+" "+jobTitle+ "\n "
				+ gender+ " "+ salary+" TL\n "+ 
				"Employee ID :\t"+ employeeID+
				"hasBenefits :\t" + hasBenefits+
				"\nis he married:\t "+ isMarried);
		
	}

}
