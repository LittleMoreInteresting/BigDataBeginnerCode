package Lesson_1102;

/**
 * 编写一个比较器比较实现了Areable接口的任意图形的面积。Circle，Triangle，Rectangle等等。编写一个测试类，
 * AreaComparatorTest来测试任意图形的比较结果。
 */
public class AreaComparatorTest {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        Circle c = new Circle(10);
        areaComparator(r,c);
    }

    public static void areaComparator(Areable a, Areable b){
        double areaA = a.getArea();
        double areaB = b.getArea();
        if(areaA==areaB){
            System.out.println("Area a ("+areaA+")= Area B ("+areaB+")");
        }else if (areaA>areaB){
            System.out.println("Area a("+areaA+") > Area B("+areaB+")");
        }else{
            System.out.println("Area a("+areaA+") < Area B("+areaB+")");
        }
    }
}
