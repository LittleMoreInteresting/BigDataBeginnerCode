package algorithm;

import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("环形队列测试---");
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        CircleArrayList arr = new CircleArrayList(4);
        char key;
        while (loop){
            System.out.println("s:show;a:add;g:get;q:quite");
            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    arr.show();
                    break;
                case 'a':
                    System.out.println("input number:");
                    int val = scanner.nextInt();
                    arr.addQuery(val);
                    break;
                case 'g':
                    try {
                        int num = arr.getQuery();
                        System.out.printf("number is %d \n",num);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'q':
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("quite");
    }
}

class CircleArrayList{
    private int maxLength ;
    private int head;
    private int tail;
    private int size;
    private int[] arr;
    private Boolean isEmpty;
    public CircleArrayList(int maxLength){
        this.maxLength = maxLength;
        arr = new int[maxLength];
        isEmpty = true;
    }

    public boolean isFull(){
        return (tail+1)%maxLength == head;
    }

    public void addQuery(int val){
        if(isFull()){
            System.out.println("队列已满~~");
            return;
        }
        if(isEmpty){
            isEmpty = false;
        }else{
            tail = (tail+1)%maxLength;
        }
        arr[tail] = val;
        size++;
    }

    public int getQuery(){
        if(isEmpty){
            throw new RuntimeException("队列为空*");
        }
        int temp = arr[head];
        if(head==tail){
            isEmpty = true;
        }else{
            head = (head+1)%maxLength;
        }
        size--;
        return temp;
    }

    public void show(){
        System.out.println(size);
        System.out.println(head);
        for (int i = 0;i<size;i++){
            int index = (head+i)%maxLength;
            System.out.printf("arr[%d] = %d\n",index,arr[index]);
        }
    }



}
