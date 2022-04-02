package exercises.shorts._23_constructorsThisKeywordExamples;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John",'M', "SDET",75000);
        Employee emp2 = new Employee("Jane",'F', "SDET",75000);

        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);
    }
}
