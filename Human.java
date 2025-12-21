public class Human {

    public int age;
    public String name;
    public boolean male;

    public Human(int age, String name, boolean male) {
        this.age = age;
        this.name = name;
        this.male = male;
    }

    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }

    public String role() {
        return "Human";
    }
}
