package Lesson_1106;

import java.util.Arrays;
import java.util.Scanner;

public class StringDeal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("INPUT   : "+str);
        dealString(str);
    }

    public static void dealString(String strInput){
        int len = strInput.length();
        char[] charArr = new char[len];
        for (int i=0;i<len;i++){
            if(i%2==0 && i!=0 && i!=(len-1)){
                //除首尾字符，偶数位 ~
                charArr[i] = '~';
            }else{
                // 字符转小写
                int charCode = strInput.charAt(i);
                char current = (char)(charCode<97?charCode+32:charCode);
                charArr[i] = current;
            }
        }
        if((len-1)%2==0){
            //末位 为偶数  第四步 交换忽略；
            charArr[len-1] = '~';
        }else{
            //末位 为奇数 第四步 判断交换；
            if(charArr[0] != charArr[len-1]){
                charArr[len-1] = charArr[0];
            }
        }
        //首位 '~'
        charArr[0] = '~';
        System.out.println(Arrays.toString(charArr));
    }
}
