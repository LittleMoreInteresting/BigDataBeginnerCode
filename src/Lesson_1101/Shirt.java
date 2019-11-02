package Lesson_1101;

public class Shirt extends Frock {

    public int size = 0;

    public Shirt(int size) {
        this.size = size;
    }

    public void calcArea(){
        System.out.println("衬衣所需的布料面积:"+this.size*1.3);
    }
}
