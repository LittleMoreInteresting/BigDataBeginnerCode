package Lesson_1023;

import java.math.BigInteger;

public class Functions {

    public static void main(String[] args) {

        sameCompare(160);
        sameCompare((double) 9);
    }

    /**
     * 请作答：
     * （问答题）第3题：
     * 编写两个方法名相同但是参数列表不同的方法,分别实现:
     * 方法一:比较周长相同的条件下,圆的面积和正方形的面积哪个大?
     * 方法二,比较面积相同的情况下正方形和正三角形的周长哪个大?
     */

    public static void sameCompare(int s){
        double areaCircle = Math.pow(s,2)/(4*Math.PI);
        double areaSquare = Math.pow(s,2)/16;
        System.out.println("周长="+s+"时;圆形面积："+areaCircle);
        System.out.println("周长="+s+"时;正方形面积："+areaSquare);
        if(areaCircle>areaSquare){
            System.out.println("圆形面积较大");
        }else if (areaCircle<areaSquare){
            System.out.println("正方形面积较大");
        }else{
            System.out.println("圆形和正方形面积相等");
        }
    }

    public static void sameCompare(double area){
        double square = Math.sqrt(area)*4;
        double triangle = Math.sqrt(area*4/Math.sqrt(3))*3;
        System.out.println("面积="+area+"时;正方形周长："+square);
        System.out.println("面积="+area+"时;三角形周长："+triangle);
        if(square>triangle){
            System.out.println("正方形周长较大");
        }else if (square<triangle){
            System.out.println("三角形周长较大");
        }else{
            System.out.println("周长相等");
        }
    }


    /**
     * 编写一个可以求得两个数中较大值的方法.   然后通过调用该方法求得三个数中的较大值.
     */
    public static int getBigger(int a,int b){
        //return Math.max(a,b);
        return a>=b?a:b;
    }

    /**
     * 编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5;
     * 6的阶乘是1*2*3*4*5*6;调用该方法算出1000的阶乘的值并打印.
     */
    public static BigInteger getFactorial(int n ){
        BigInteger result = new BigInteger("1");
        for(int i=2;i<=n;i++){
            String i2Str = String.valueOf(i);
            BigInteger i2Big = new BigInteger(i2Str);
            result = result.multiply(i2Big);
        }
        return result;
    }




}
