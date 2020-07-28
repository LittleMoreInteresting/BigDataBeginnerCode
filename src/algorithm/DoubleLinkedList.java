package algorithm;

public class DoubleLinkedList {
    private final HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead(){
        return  head;
    }

    public void list(){
        if (head.next==null){
            System.out.println("Empty List!");
            return;
        }
        HeroNode temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void add(HeroNode node){
        HeroNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }

}

class HeroNode {
    private int num;
    private String name;
    private String nikeName;
    public HeroNode(){

    }

    public HeroNode(int num,String name,String nikeName){
        this.name = name;
        this.nikeName = nikeName;
        this.num = num;
    }

    @Override
    public String toString() {
        return "N:"+num+"-"+name+"["+nikeName+"]";
    }

    public HeroNode pre;

    public HeroNode next;
}
