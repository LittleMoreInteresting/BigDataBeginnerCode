package Lesson_1029;

public class TriangleManager {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(5,10);
        Triangle triangleB = new Triangle(10,10);
        getArea(triangleA);
        getArea(triangleB);
    }

    public static void getArea(Triangle t){
        int area = t.base*t.height/2;
        System.out.println("三角形面积："+area);
    }
}
