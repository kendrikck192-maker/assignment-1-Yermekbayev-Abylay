import model.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {

        // From class itself
        Student student = new Student("Alex", 19, "AITU");

        // From superclass
        Human employeeAsHuman = new Employee("John", 30, 250000);

        // From interface
        IWork employeeAsWorker = new Employee("Anna", 28, 300000);

        student.introduce();
        student.study();
        System.out.println(student.getUniversity());

        employeeAsHuman.introduce();

        employeeAsWorker.work();
        System.out.println(employeeAsWorker.getSalary());
    }
}