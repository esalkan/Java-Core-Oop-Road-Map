package exercises.shorts._23_constructorsThisKeywordExamples;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    // Default / Non-Parameterized / Non-Argument constructor.
    public Employee(){

    }

    // Parameterized constructor
    public Employee(String adi, char cinsi, String gorevi, double maas){
        this.name = adi;
        this.gender = cinsi;
        this.jobTitle = gorevi;
        this.salary = maas;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
