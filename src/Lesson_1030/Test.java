package Lesson_1030;
import java.awt.Window;
public class Test {

    public static void main(String[] args) {
        Person p = new Person("Person",20);
        p.say();
        Student s = new Student("Student Boy",15);
        s.setId(789);
        s.setScore(99.99);
        s.say();
    }
}
