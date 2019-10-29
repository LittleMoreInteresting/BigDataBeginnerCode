package Lesson_1028;

public class JavaObject {
    public static void main(String[] args) {
        /*Circle c = new Circle(10);
        double area = c.getArea();
        System.out.println("面积："+area);*/
        Person p = new Person("Tom");
        p.selfIntroduce();

        Person p2 = new Person("Henry","Shandong");
        p2.setAge(28);
        p2.selfIntroduce();
    }
}


/**
 1.定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个getArea
 1方法返回圆的面积。创建该类的对象,初始化属性值,调用方法打印圆的面积值

 （问答题）第2题：
 定义一个Person类,这个类中包含三个属性(其中有一个为类变量),两个方法;创建该类的对象,使用构造器对属性赋值,调用对象的方法.

*/