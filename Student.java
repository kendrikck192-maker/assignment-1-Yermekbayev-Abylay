public class Student extends Human {

    public String faculty;
    public float gpa;

    public Student(int age, String name, boolean male, String faculty, float gpa) {
        super(age, name, male);
        this.faculty = faculty;
        this.gpa = gpa;
    }

    public String role() {
        return "Student";
    }
}
