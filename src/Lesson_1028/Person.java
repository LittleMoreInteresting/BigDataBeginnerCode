package Lesson_1028;

//定义一个Person类,这个类中包含三个属性(其中有一个为类变量),两个方法;创建该类的对象,使用构造器对属性赋值,调用对象的方法.
public class Person {
    String name="anonymous";
    String address = "not found";
    private static int age = 23;
    public Person(String name){
        this.name = name;
        this.address = "Beijing";
    }
    public Person(String name,String address){
        this.address = address;
        this.name = name;
    }
    public void selfIntroduce(){
        String introduce = "My name is "+this.name+" ;";
        if(this.address.length()>0){
            introduce += "I'm from "+this.address;
        }
        introduce += " I'm "+age+" years old";
        System.out.println(introduce);
    }
    public void setAge(int yourAge){
        age = yourAge;
    }
}
