package Lesson_1104;

import java.util.Scanner;

public class SymmetricStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Is Symmetric?:"+isSymmetric(str));
    }
    public static String isSymmetric(String string){
        if (string.length()<=1){
            return "Yes";
        }
        int i=0,j=string.length()-1;
        while (i<j){
            if(string.charAt(i)==string.charAt(j)){
                i++;
                j--;
            }else{
                return "NO";
            }
        }
        return "Yes";
    }
}
