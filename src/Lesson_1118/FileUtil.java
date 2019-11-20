package Lesson_1118;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class FileUtil {
    public static void copyFile(String src, String dest){
        File srcFile = new File(src);
        if(!srcFile.exists()){
            System.out.println(src+"文件不存在");
            return;
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        String fileName = srcFile.getName();
        File destFile = new File(dest);
        if(destFile.isDirectory()){//未指定目前文件名
            destFile = new File(destFile,fileName);
        }
        if(destFile.exists()){//目标文件名已存在
            int index = destFile.getPath().lastIndexOf(File.separatorChar);
            String pathDir = destFile.getPath().substring(0,index+1);
            String newName = "Copy"+System.currentTimeMillis()+'_'+destFile.getPath().substring(index+1);
            destFile = new File(pathDir+newName);
        }
        try {
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            byte[] bs = new byte[256];
            int len = 0;
            while(-1!=(len=fis.read(bs))){
                fos.write(bs,0,len);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void cutFile(String src, String dest){
        File srcFile = new File(src);
        if(!srcFile.exists()){
            return;
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        String fileName = srcFile.getName();
        File destFile = new File(dest);
        if(destFile.isDirectory()){//未指定目前文件名
            destFile = new File(destFile,fileName);
        }
        if(destFile.exists()){//目标文件名已存在
            System.out.println("目标文件已存在");
            System.out.println("请选择：1覆盖(default)；2重命名；3取消");
            Scanner sc = new Scanner(System.in);
            int typeInt = sc.nextInt();
            if(typeInt==2){
                int index = destFile.getPath().lastIndexOf(File.separatorChar);
                String pathDir = destFile.getPath().substring(0,index+1);
                String newName = "Copy"+System.currentTimeMillis()+'_'+destFile.getPath().substring(index+1);
                destFile = new File(pathDir+newName);
            }else if (typeInt==3){
                return;
            }
        }
        try {
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            byte[] bs = new byte[256];
            int len = 0;
            while(-1!=(len=fis.read(bs))){
                fos.write(bs,0,len);
            }
            fis.close();
            fos.close();
            srcFile.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
