package Lesson_1029;

public class ObjectStudy {
    public static void main(String[] args) {
        Person personA = new Person();
        personA.setName("Tommy");
        personA.setAge(3);
        personA.setSchool("春田花花幼稚园");  
        personA.setGender('M');
        System.out.println(personA.toString());
    }
}


