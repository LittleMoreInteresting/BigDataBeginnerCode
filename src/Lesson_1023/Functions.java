package Lesson_1023;

import java.math.BigInteger;

public class Functions {

    public static void main(String[] args) {
        BigInteger big = new BigInteger("1111111111111111111111111111111111111111");
        System.out.println(big);
        getFactorial(30);
    }

    /**
     * 编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5;    6的阶乘是1*2*3*4*5*6;调用该方法算出1000的阶乘的值并打印.
     */
    public static  int getFactorial(int n ){
        int result = 1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        System.out.println(result);
        return result;
    }

    /**
     * function multiply1(string $a, string $b): string {
     *   $a = array_reverse(str_split(ltrim($a, '0')));
     *   $b = array_reverse(str_split(ltrim($b, '0')));
     *   $r = [];
     *
     *   foreach ($a as $ai => $av) {
     *     foreach ($b as $bi => $bv) {
     *       $m = $av * $bv;
     *       $r[$ai + $bi] += $m;
     *       if ($r[$ai + $bi] >= 10) {
     *         $r[$ai + $bi + 1] += floor($r[$ai + $bi] / 10);
     *         $r[$ai + $bi] = $r[$ai + $bi] % 10;
     *       }
     *     }
     *   }
     *
     *   return implode('', array_reverse($r));
     * }
     */

    /**
     * 1、编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5;    6的阶乘是1*2*3*4*5*6;调用该方法算出1000的阶乘的值并打印.
     *
     * 请作答：
     *
     * （问答题）第2题：
     * 编写一个可以求得两个数中较大值的方法.    然后通过调用该方法求得三个数中的较大值.
     *
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
