package Lesson_1114;

import java.util.*;

public class JavaSet {

    public static void main(String[] args) {
        System.out.println("输入5个整数：");
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++){
            treeSet.add(scanner.nextInt());
        }
        TreeSet<Integer> treeSet1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int item:treeSet){
            treeSet1.add(item);
            System.out.println(item);
        }
        System.out.println("--------------------");
        for(Iterator<Integer> it=treeSet1.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
}
