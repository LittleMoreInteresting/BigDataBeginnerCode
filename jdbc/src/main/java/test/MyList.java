package test;
import java.util.ArrayList;
import java.util.List;

public class MyList<Object> {
    private List<Object> values= new ArrayList<Object>();
    void add(Object value){
        values.add(value);
    }
    void remove(Object value){
        values.remove(value);
    }
}

class TestML{
    public static void main(String[] args) {
        MyList<Object> list= new MyList<Object>();
        list.add("a");  //会认为你写入的数据类型为String类型
        list.remove("b");
        list.add(1);  //自定义的集合只能存储字符串

        MyList<Integer> list1 = new MyList<Integer>();
        list1.add(1);
        list1.add(1);

        //new MyList<T>() 必须是引用数据类型

    }
}
