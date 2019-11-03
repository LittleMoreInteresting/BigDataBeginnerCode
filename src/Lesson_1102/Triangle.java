package Lesson_1102;

public class Triangle implements Areable {

    double height = 0;
    double base = 0 ;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return base*height/2;
    }
}
