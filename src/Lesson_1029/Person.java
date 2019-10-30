package Lesson_1029;

/**
 * 定义一个Person类，有4个属性：String name，int age，String school，char gender。进行数据封装。并对
 * setter的参数进行验证。(输出一下setter设置的值)
 */
public class Person {
    private String name;
    private int age;
    private String school;
    private char gender;

    public Person() {
        this.name = "unknown";
        this.age = 0;
        this.school = "unknown";
        this.gender = 'N';
    }

    public Person(String name, int age, String school, char gender) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.gender = gender;
    }

    public void setName(String name) {
        System.out.println("set name :"+name);
        this.name = name;
    }
    public void setAge(int age) {
        System.out.println("set age :"+age);
        this.age = age;
    }
    public void setSchool(String school) {
        System.out.println("set school :"+school);
        this.school = school;
    }

    public void setGender(char gender) {
        System.out.println("set gender :"+gender);
        this.gender = gender;
    }

    public String toString(){
        return "Name:"+this.name+"\n"+ "Age:"+this.age+"\n"+"School:"+this.school+"\n"+"Gender:"+this.gender+"\n";
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public char getGender() {
        return gender;
    }
}
