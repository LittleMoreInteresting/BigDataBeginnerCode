package algorithm;

public class App {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1,"A","a");
        HeroNode hero2 = new HeroNode(2,"B","b");
        HeroNode hero3 = new HeroNode(3,"C","c");
        HeroNode hero4 = new HeroNode(4,"D","d");
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(hero1);
        list.add(hero3);
        list.add(hero2);
        list.add(hero4);
        list.list();

        HeroNode hero33 = new HeroNode(3,"C_#","c1");
        list.update(hero33);
        list.list();

        list.delete(2);
        list.list();

    }
}
