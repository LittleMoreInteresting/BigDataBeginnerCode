package sms;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Exam {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean goon = false;
        do{
            System.out.println("***********************************");
            banner();
            System.out.println("欢迎进入Stupid考试系统！");
            System.out.println("输入回车[Enter] 开始考试");
            System.out.println("输入 Q 退出考试系统");
            System.out.println("***********************************");
            System.out.print("请输入命令:");
            String line = scanner.nextLine();
            if(line.equals("")){
                goon = false;
                beginExam();
            }else if (line.toUpperCase().equals("Q")){
                goon = false;
                System.out.println("您已退出考试系统");
                System.exit(0);
            }else{
                goon = true;
            }
        }while (goon);
        DbUtil.close();
    }

    private static void beginExam(){
        System.out.println("您已开始Stupid考试,请认真作答,**中途不可退出考试否则考试无效**！");
        List<Integer> ids = ItemsDao.getIds();
        System.out.println(ids);
        for (Integer id:ids) {
            ItemsDao.getItems(id);
            String ans = Instructions.getAnswersInstruction();
            AnswersDao.update(id,ans);
        }
        int score = AnswersDao.getScore();
        System.out.println("您的最终得分："+score);
    }

    private static void banner(){
        String path = "E:/BigDataBeginnerCode/jdbc/src/main/java/sms/banner.txt";
        BufferedReader in= null;
        try {
            in = new BufferedReader(new FileReader(new File(path)));
            String str="";
            while ((str=in.readLine())!=null){
                System.out.println(str);
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
