package Lesson_1112;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    /**
     *从键盘随机输入10个整数，保存到List中，并按照倒序，从大到小的顺序显示出来。
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("请输入10个整数：");
        for (int i =0 ; i<10; i++){
            int val = scanner.nextInt();
            list.add(val);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list.toString());
    }
}
