package algorithm;

public class ArrayStack {
    private int maxLength;
    private int[] stack;
    private int top;

    public ArrayStack(int length){
        this.maxLength = length;
        this.stack = new int[maxLength];
        this.top = -1;
    }

    public boolean isFull(){
        return top == maxLength-1;
    }

    public boolean isEmpty(){
        return  top == -1;
    }


    public void push(int value){
        if (isFull()){
            System.out.println("Stack is Full");
            return;
        }
        stack[++top] = value;
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("empty");
            return ;
        }
        System.out.println(stack[top--]);
    }
}
