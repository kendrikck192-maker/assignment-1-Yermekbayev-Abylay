public class Employee extends Human {

    public String job;
    public float salary;

    public static String company = "MyCompany";

    public Employee(int age, String name, boolean male, String job, float salary) {
        super(age, name, male);
        this.job = job;
        this.salary = salary;
    }

    public String role() {
        return "Employee";
    }
}
