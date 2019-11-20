package Lesson_1118;

import java.io.*;

public class FileUtil {
    public static void copyFile(String src, String dest){
        File srcFile = new File(src);
        if(!srcFile.exists()){
            return;
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        String fileName = srcFile.getName();
        File destFile = new File(dest);
        if(destFile.isDirectory()){
            destFile = new File(destFile,fileName);
        }
        try {
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            byte[] bs = new byte[256];
            int len = 0;
            while(-1!=(len=fis.read(bs))){
                fos.write(bs,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void cutFile(String src, String dest){

    }
}
