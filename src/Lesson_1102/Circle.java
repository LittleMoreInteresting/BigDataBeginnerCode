package Lesson_1102;

public class Circle implements Areable {

    double radius = 0;

    public Circle(double r) {
        radius = r;
    }
    @Override
    public double getArea() {

        return Math.PI*Math.pow(this.radius,2);
    }
}
