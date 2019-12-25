package exam;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Signature{
    private Signature obj = new Signature();
    private Signature(){};
    public Signature getInterface(){
        return  obj;
    }
}

class Signature2{
    private Signature2 obj = null;
    private Signature2(){};
    public Signature2 getInterface(){
        if (obj==null){
            synchronized (Signature2.class){
                if(obj==null){
                    obj = new Signature2();
                }
            }
        }
        return  obj;
    }
}

public class Exam {

    public static void main(String[] args) throws IOException {
        String s = "hello";
        String t = "hello";
        char c[] = {'h','e','l','l','0'};
        System.out.println(s.equals(t));
        System.out.println(t.equals(c));
        /*FileWriter fw = new FileWriter("E:/test/itstart.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Big Data is good");
        bw.flush();
        bw.close();*/
        /*int[] arr = {121,12,232,2323,344};
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/
    }
}
