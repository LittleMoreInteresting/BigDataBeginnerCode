package Lesson_1106;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Account : "+str);
        checkAccount(str);
        checkAccount2(str);
    }

    public static void checkAccount(String account){

        String pattern = "^[a-zA-Z]\\d{11}$";
        boolean isMatch = Pattern.matches(pattern, account);
        if(isMatch){
            System.out.println("RegEx： account Enabled");
        }else{
            System.out.println("RegEx： account error");
        }
    }

    public static void checkAccount2(String account){
        int firstChar = account.charAt(0);
        int charLowerA = 'a',charLowerZ = 'z',charUpperA = 'A',charUpperZ = 'Z',numberZero = '0',numberNine = '9';
        boolean isMatch = true;
        int len = account.length();
        if(len==12){
            if(firstChar>=charLowerA && firstChar<=charLowerZ || firstChar>=charUpperA && firstChar<=charUpperZ){
                for (int i =1;i<12;i++){
                    int nextChar = account.charAt(i);
                    if(nextChar<numberZero || nextChar>numberNine){
                        isMatch = false;
                        break;
                    }
                }
            }else{
                isMatch = false;
            }
        }else{
            isMatch = false;
        }
        if(isMatch){
            System.out.println("String： account Enabled");
        }else{
            System.out.println("String： account error");
        }
    }
}
