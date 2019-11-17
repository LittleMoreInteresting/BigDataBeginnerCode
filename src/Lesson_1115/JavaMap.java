package Lesson_1115;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args) {
        HashMap<Husband , Wife> hashmap = new HashMap<>();
        Husband husband = new Husband("Tom",34);
        Wife wife = new Wife("Lily",35);
        hashmap.put(husband,wife);
        for (Map.Entry<Husband, Wife> entry : hashmap.entrySet()){
            System.out.println(entry.getKey().name+" Love "+entry.getValue().name);
        }
    }
}

class Wife {
    public String name;
    public int age;
    public Wife(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Husband {
    public String name;
    public int age;
    public Husband(String name, int age) {
        this.name = name;
        this.age = age;
    }
}