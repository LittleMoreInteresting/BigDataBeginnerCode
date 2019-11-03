package Lesson_1102;

public class Rectangle implements Areable {

    double height = 0;
    double wight = 0;

    public Rectangle(double height, double wight) {
        this.height = height;
        this.wight = wight;
    }

    @Override
    public double getArea() {
        return height*wight;
    }
}
