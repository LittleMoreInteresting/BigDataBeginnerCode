package algorithm;

public class Josepfu {
    public static void main(String[] args) {
        LinkedSignalList signalList = new LinkedSignalList();
        signalList.addBaby(5);
        signalList.show();
        signalList.countBaby(1,2,5);
        signalList.show();
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

    /**
     * 出圈
     * @param start 报数开始位置
     * @param step 报数长度
     * @param total 总人数
     */
    public void countBaby(int start,int step,int total){
        if (first==null|| start<1 || start>total){
            System.out.println("Error Number !");
            return;
        }
        BabyNode helper = first;
        while (true){
            if (helper.getNext()==first){
                break;
            }
            helper = helper.getNext();
        }
        for(int i=0;i<start-1;i++){
            first = first.getNext();
            helper = helper.getNext();
        }
        while (true){
            if (helper==first){
                break;
            }
            for (int i=0;i<step-1;i++){
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println("Baby Out："+first.getNum());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.println("Baby ："+first.getNum());
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