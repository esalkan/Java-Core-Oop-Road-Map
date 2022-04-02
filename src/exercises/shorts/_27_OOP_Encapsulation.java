package exercises.shorts;

public class _27_OOP_Encapsulation {

    private String name;
    private double salary;

    // getting private instance variable value and return it.
    public String getName() {
        return name;
    }

    // setting private instance variable value.
    public void setName(String name){
        this.name = name;
    }

    // getting private instance variable value and return it.
    public double getSalary(){
        return salary;
    }

    // setting private instance variable value.
    public void setSalary(double salary){
        if (salary <= 0){
            System.err.println("Invalid salary : " + salary);
        }
        this.salary = salary;
    }

    // For print all the data need to create toString method
    public String toString(){
        return "Employee {" +
                "name = " + name +
                ", " +
                "salary = " + salary +
                "}";
    }



}
