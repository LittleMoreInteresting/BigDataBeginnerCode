package exam;

public class Person {
    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person(18,"Andy");
        System.out.println(p);
    }
}
