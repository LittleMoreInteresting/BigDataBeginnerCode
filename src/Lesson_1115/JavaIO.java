package Lesson_1115;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIO {
    public static void main(String[] args) throws IOException {
        File div = new File("E:/test");
        if(!div.exists()){
            div.mkdir();
        }
        File divIn = new File(div,"abc");
        if(!divIn.exists()){
            divIn.mkdir();
        }
        File testFile = new File(divIn,"test.txt");
        testFile.createNewFile();
        FileWriter fw = new FileWriter(testFile);
        fw.write("I Love Big Data");
        fw.flush();
        fw.close();
        FileReader fr = new FileReader(testFile);
        char[] a = new char[50];
        fr.read(a);
        for (char c : a)
            System.out.print(c);
        fr.close();


    }
}
