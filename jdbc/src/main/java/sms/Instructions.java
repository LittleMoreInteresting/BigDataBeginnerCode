package sms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Instructions {
    public static String[] answers = {"A","B","C","D"};

    public static String[] exam = {"Q","N","P","S",""};
    private static Scanner scanner = new Scanner(System.in);
    public static String getAnswersInstruction(){
        String ins = null;
        boolean goon = false;
        do{
            String line = scanner.nextLine();
            ins = line.toUpperCase();
            List<String> answersList = Arrays.asList(answers);
            if(answersList.indexOf(ins)==-1){
                System.out.println("请输入正确选项：");
                System.out.println(answersList);
                goon = true;
            }else{
                goon = false;
            }
        }while (goon);
        return ins;
    }
}
