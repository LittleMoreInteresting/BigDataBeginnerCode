package Lesson_1018;

/**
 * @author ：sunhaoran
 * @date ：2019/10/19 19:29
 */
public class Operations {

    public static void main(String[] args) {
        Operations  operations  = new Operations();

        /*System.out.println(operations.minutesToHours(150));
        System.out.println(operations.getBiggerOne(998,101));*/
        System.out.println("最大圆的面积："+operations.getBiggerArea());
    }

    /**
     * 两个圆的半径分别是5和10,分别计算两个圆的周长(2*PI*R),面积(PI*R*R),其中PI为常量!
     * 计算完后,比较两个圆的大小,输出面积较大的那个圆的值.
     * @return double mix area
     */
    public double getBiggerArea(){
        int radiusOne = 5;
        int radiusTwo = 10;
        double circumferenceOne = 2*Math.PI*radiusOne;
        double circumferenceTwo = 2*Math.PI*radiusTwo;
        double areaOne = Math.PI*radiusOne*radiusOne;
        double areaTwo = Math.PI*radiusTwo*radiusTwo;
        System.out.println("One: circumference:"+circumferenceOne+" area:"+areaOne);
        System.out.println("Two: circumference:"+circumferenceTwo+" area:"+areaTwo);
        return areaOne>=areaTwo?areaOne:areaTwo;
    }

    /**
     * @ 找出两个数中较大的数
     * @param number1
     * @param number2
     * @return int biggerOne
     */
    public int getBiggerOne(int number1,int number2){
        return number1>=number1?number1:number2;
    }

    /**
     * 将分钟数转换成小时加上分钟数(如150分钟可以转换为2小时30分钟)使用输出语句输出最后换算结果.
     */
    public String minutesToHours(int minutes){
        int hours = minutes/60;
        int leftMinutes = minutes%60;
        return  hours+"小时"+leftMinutes+"分钟";
    }
}
