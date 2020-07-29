package algorithm;

public class Josepfu {
    public static void main(String[] args) {

    }
}


class LinkedSignalList {
    BabyNode first = null;


    /**
     * 队列里添加节点
     * @param num 节点数
     */
    public void addBaby(int num){
        if (num <1){
            System.out.println("Error num");
            return;
        }
        BabyNode current = null;
        for (int i=1;i<=num;i++) {
            BabyNode node = new BabyNode(i);
            if (i==1){
                first = node;
                first.setNext(first);
                current = first;
            }else{
                current.setNext(node);
                node.setNext(first);
                current = node;
            }
        }

    }

    public void show(){
        if (first==null){
            System.out.println("Empty");
            return;
        }
        BabyNode current = first;
        while (true){
            System.out.println("B:"+current.getNum());
            if (current.getNext().equals(first)){
                break;
            }
            current = current.getNext();
        }
    }


}

class BabyNode{
    private int num;
    private BabyNode next;

    public BabyNode() {
    }

    public BabyNode(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public BabyNode getNext() {
        return next;
    }

    public void setNext(BabyNode next) {
        this.next = next;
    }
}