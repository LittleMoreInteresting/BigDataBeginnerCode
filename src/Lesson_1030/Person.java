package Lesson_1030;

/**
 * 编写一个Person类，包括属性（name，age），构造器，方法say（返回自我介绍的字符串）。编写一个
 * Student类，继承Person类，增加id,score属性，以及构造器，并重写say方法。
 * 编写Test类，创建Person和Student对象，调用say方法输出自我介绍。
 */
public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println("My name is "+this.name+" , "+this.age+" years old");
    }
}
