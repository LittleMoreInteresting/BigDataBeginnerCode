package codewars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/tribonacci-sequence/train/java
 */

public class Xbonacci {

    public static void main(String[] args) {
        double[] ret =  tribonacci(new double []{1,1,1},10);
        System.out.println(Arrays.toString(ret));
    }
    public static double[] tribonacci(double[] s, int n) {
        System.out.println();
        double[] myList = new double[n];
        if (n <= 0){
            return new double[0];
        }
        int i=0;
        for (double item:s
             ) {
            myList[i++] = item;
            if(i>=n){
                break;
            }
        }
        while (i<n){
           if(i<3){
               myList[i] = 1;
           }else{
               myList[i] =  myList[i-1]+myList[i-2]+myList[i-3];

           }
            i++;
        }
        return myList;
    }
}
