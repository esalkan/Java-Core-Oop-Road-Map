package exercises.shorts;

public class _27_OOP_Encapsulation_Test {

    public static void main(String[] args) {
        _27_OOP_Encapsulation employee = new _27_OOP_Encapsulation();

        System.out.println("employee.toString() = " + employee.toString());

        // employee.name = "John"; // Instance variable is private and can not accessible
        // employee.salary = 15000; // Instance variable is private and can not accessible

        employee.setName("John");
        employee.setSalary(0);
        System.out.println("employee.toString() = " + employee.toString());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

    }
}
