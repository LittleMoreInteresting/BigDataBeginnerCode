package Day16;

import java.util.ArrayList;
import java.util.List;

public class MyList02<T extends Number> {
    //extends换成super代表 T 类型必须是 Number 的父类
    private List<T> values= new ArrayList<T>();
    void add(T value){
        values.add(value);
    }
    void remove(T value){
        values.remove(value);
    }
}

class TestML02{
    public static void main(String[] args) {
        MyList02<Integer> list = new MyList02<Integer>();
        list.add(1);
        list.add(2);

      //  MyList02<String> list1 = new MyList02<String>();编译报错
    }
}
