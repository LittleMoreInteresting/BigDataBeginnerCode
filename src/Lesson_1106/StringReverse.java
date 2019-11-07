package Lesson_1106;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("INPUT   : "+str);
        System.out.println("REVERSE : "+getReverse(str));
    }

    public static String getReverse(String str){
        StringBuilder rev = new StringBuilder();
        int len = str.length();
        for(int i=0;i<len;i++){
            rev.append(str.charAt(len-i-1));
        }
        return rev.toString();
    }
}
