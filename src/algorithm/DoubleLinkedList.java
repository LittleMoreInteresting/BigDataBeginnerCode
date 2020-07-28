package algorithm;

public class DoubleLinkedList {
    private final HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead(){
        return  head;
    }

    public void list(){
        System.out.println("-------------------------------");
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

    public void update(HeroNode newNode){
        HeroNode temp = head;
        while (temp != null){
            if (temp.num == newNode.num){
                temp.setName(newNode.getName());
                temp.setNikeName(newNode.getNikeName());
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found");
    }

    public void delete(int num){
        HeroNode temp = head;
        while (temp != null){
            if(temp.num==num){
                temp.pre.next = temp.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found");
    }

}

class HeroNode {
    public int num;
    private String name;
    private String nikeName;
    public HeroNode(){

    }

    public HeroNode(int num,String name,String nikeName){
        this.name = name;
        this.nikeName = nikeName;
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getName() {
        return name;
    }

    public String getNikeName() {
        return nikeName;
    }

    @Override
    public String toString() {
        return "N:"+num+"-"+name+"["+nikeName+"]";
    }

    public HeroNode pre;

    public HeroNode next;
}
