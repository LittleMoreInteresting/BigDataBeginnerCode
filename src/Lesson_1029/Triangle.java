package Lesson_1029;

/**
 * 编写一个类Triangle，有2个属性：边长base和高height，进行数据封装。编写一个TriangleManager类，定义一
 * 个方法public static void getArea(Triangle t)计算三角形的面积(方法里传入的是Triangle类的对象)，定义主方法测试运行。
 */
public class Triangle {
    public int base;
    public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
}
