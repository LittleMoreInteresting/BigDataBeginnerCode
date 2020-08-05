package algorithm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*HeroNode hero1 = new HeroNode(1,"A","a");
        HeroNode hero2 = new HeroNode(2,"B","b");
        HeroNode hero3 = new HeroNode(3,"C","c");
        HeroNode hero4 = new HeroNode(4,"D","d");
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(hero1);
        list.add(hero3);
        list.add(hero2);
        list.add(hero4);
        list.list();

        *//*HeroNode hero33 = new HeroNode(3,"C_#","c1");
        list.update(hero33);
        list.list();*//*

        list.delete(1);
        list.list();*/

        /*LinkedSignalList signalList = new LinkedSignalList();
        signalList.addBaby(10);
        signalList.show();*/
        boolean goon = true;
        ArrayStack arrayStack = new ArrayStack(5);
        while (goon){
            System.out.println("1:push");
            System.out.println("2:pop");
            System.out.println("3:quit");
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
            switch (action){
                case 1:
                    int i = scanner.nextInt();
                    arrayStack.push(i);
                    break;
                case 2:
                    arrayStack.pop();
                    break;
                case 3:
                    goon = false;
                    System.out.println("quit");
                    break;
                default:
                    System.out.println("error");
            }
        }

    }
}
