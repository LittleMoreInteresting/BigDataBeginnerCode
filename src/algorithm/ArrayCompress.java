package algorithm;

import java.io.*;
import java.util.Arrays;

/**
 * 数组压缩
 */
public class ArrayCompress {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int baseArr[][] = new int[11][11];
        baseArr[1][2] = 1;
        baseArr[2][3] = 2;
        int total = 0;
        for (int[] lineArr :baseArr) {
            for (int column: lineArr) {
                System.out.print(column+"\t");
                if(column!=0){
                    total++;
                }
            }
            System.out.println("");
        }
        int smallArr[][] = new int[total+1][3];
        smallArr[0][0] = 11;
        smallArr[0][1] = 11;
        smallArr[0][2] = total;
        int line = 0;
        for (int i=0;i<11;i++) {
            for (int j=0 ;j<11;j++) {
                if(baseArr[i][j]!=0){
                    line++;
                    smallArr[line][0] = i;
                    smallArr[line][1] = j;
                    smallArr[line][2] = baseArr[i][j];
                }
            }
        }
        System.out.println("-------------压缩并写入文件-----------------");
        for (int[] lineArr :smallArr) {
            for (int column: lineArr) {
                System.out.print(column+"\t");
            }
            System.out.println("");
        }
        FileOutputStream fos;
        fos = new FileOutputStream("small.var");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(smallArr);
        oos.close();
        System.out.println("-------------读取文件·  -----------------");
        FileInputStream fis = new FileInputStream("small.var");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int[][] o = (int[][]) ois.readObject();

        for (int[] lineArr :o) {
            for (int column: lineArr) {
                System.out.print(column+"\t");
            }
            System.out.println("");
        }
        System.out.println("-------------还原数组·  -----------------");
        int[][] back = new int[o[0][0]][o[0][1]];
        for(int i=1;i<o[0][2]+1;i++){
            back[o[i][0]][o[i][1]] = o[i][2];
        }
        for (int[] lineArr :back) {
            for (int column: lineArr) {
                System.out.print(column+"\t");
            }
            System.out.println("");
        }
    }
}
