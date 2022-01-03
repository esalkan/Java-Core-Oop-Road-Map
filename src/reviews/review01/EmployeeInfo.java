package reviews.review01;

/**
 * @author esalkan
 * @project java-notes
 */
public class EmployeeInfo {
    public static void main(String[] args) {
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

        String name = "Oscar";
        String companyName = "Cybertek";
        String jobTitle = "SDET";
        String gender = "Male";
        int salary = 100_000;
        int employeeID = 12345;
        boolean hasBenefits = true;
        boolean isMarried = true;

        System.out.println(name + " " + companyName + " " + jobTitle + "\n "
                + gender + " " + salary + " TL\n " +
                "Employee ID :\t" + employeeID +
                "hasBenefits :\t" + hasBenefits +
                "\nis he married:\t " + isMarried);


    }
}
