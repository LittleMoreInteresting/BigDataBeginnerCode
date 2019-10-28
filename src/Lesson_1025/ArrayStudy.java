package Lesson_1025;


import java.util.Arrays;

/**
 * @author ：sunhaoran
 * @date ：2019/10/27 20:56
 */
public class ArrayStudy {
    public static void main(String[] args) {
        countRabbit();
    }
    /**
     * 有一只兔子，从出生后第3个月起每个月都生只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问第20个月的兔子总数为多少？
     */
    public static void countRabbit(){
        int months = 20;
        int[] rabbits = new int[21];
        rabbits[0] = 1;
        for(int m = 1; m<=months; m++){
            for (int j=m ; j>0 ; j--){
                rabbits[j] = rabbits[j-1];
                rabbits[j-1] = 0;
            }
            for (int j=m ; j>=3 ; j--){
                rabbits[0] += rabbits[j];
            }
            System.out.println(Arrays.toString(rabbits));
        }
        int count = 0;
        for (int num:rabbits) {
            count += num;
        }
        System.out.println(months+"个月后有"+count+"只；");
    }


    /**
     * 现有一个数组int [ ]  arr={12,23,34,34,45,43,32,21}，求出该数组中的最大值,最小值,以及平均值.
     */
    public static void arrAnalysis(){
        int[]  arr={12,23,34,34,45,43,32,21};
        int max = arr[0],min = arr[0],avg,total = 0;
        for(int item:arr){
            if(item>max){
                max = item;
            }
            if(item<min){
                min = item;
            }
            total += item;
        }
        avg = total/arr.length;
        System.out.println("最大值："+max+";最小值："+min+";平均值："+avg);
    }

    /**
     * 已知数组int[] nums = {5,10,15},要求创建一个新数组  1.新数组的长度和已知数组相同  2.新数组每个元素的值 是已知数组对应位置元素的2倍 3.在控制台中打印新数组的所有元素
     */
    public static void arr2Double(){
        int[] nums = {5,10,15};
        int[] arr2Double = new int[3];
        int i=0;
        System.out.println("新数组的值：");
        for(int item:nums){
            int newVal = item*2;
            arr2Double[i++] = newVal;
            System.out.print(newVal+"\t");
        }
    }
}
