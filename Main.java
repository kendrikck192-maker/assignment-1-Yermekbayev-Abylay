public class Main {
    public static void main(String[] args) {

        Human h = new Human(20, "Abylai", true);
        h.sayHello();
        System.out.println(h.role());

        Employee e = new Employee(25, "Aibar", true, "Programmer", 1200);
        e.sayHello();
        System.out.println(e.role());

        Student s = new Student(19, "Aruzhan", false, "IT", 3.8f);
        s.sayHello();
        System.out.println(s.role());
    }
}
