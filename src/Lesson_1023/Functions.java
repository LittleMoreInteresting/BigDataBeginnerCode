package Lesson_1023;

import java.math.BigInteger;

public class Functions {

    public static void main(String[] args) {
        System.out.println("1000! = "+getFactorial(1000));
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

    /**
     * 编写一个可以求得两个数中较大值的方法.    然后通过调用该方法求得三个数中的较大值.
     */

    /**
     * 请作答：
     *
     * （问答题）第3题：
     * 编写两个方法名相同但是参数列表不同的方法,分别实现:
     * 方法一:比较周长相同的条件下,圆的面积和正方形的面积哪个大?
     * 方法二,比较面积相同的情况下正方形和三角形的面积哪个大?
     *
     * 请作答：
     *
     * 图片
     */
}
