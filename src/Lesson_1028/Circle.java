package Lesson_1028;

public class Circle {
    double radius = 0;

    public Circle(double radius){
        this.radius = radius;
    }

    /**
     *
     * @return double Area
     */
    public double getArea(){
        return  Math.pow(this.radius,2)*Math.PI;
    }
}
