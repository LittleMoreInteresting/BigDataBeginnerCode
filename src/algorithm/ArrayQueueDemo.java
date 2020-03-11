package algorithm;

public class ArrayQueueDemo {

    public static void main(String[] args) {

    }
}

class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] queue;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
    }

    /**
     * 判断队列已满
     * @return boolean
     */
    public boolean isFull(){
        return rear == maxSize-1;
    }

    /**
     * 判断是否为空
     * @return Boolean
     */
    public boolean isEmpty(){
        return  rear == front;
    }

    /**
     * 添加队列
     * @param n int
     */
    public void addQueue(int n){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        queue[++rear] = n;
    }

    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return queue[++front];
    }

    public void showQueue(){

    }

    public void peek(){

    }



}