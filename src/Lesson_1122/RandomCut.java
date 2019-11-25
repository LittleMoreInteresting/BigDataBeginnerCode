package Lesson_1122;

import java.util.ArrayList;
import java.util.Random;

public class RandomCut extends Thread{
    private int cutNum =0;

    public RandomCut(int cutNum) {
        this.cutNum = cutNum;
    }

    @Override
    public void run() {
        ArrayList<Integer> accountCode = Bank.getAccountCode();
        for (int i=0;i<this.cutNum;i++){
            Random r = new Random();
            int codeIndex = r.nextInt(accountCode.size());
            int code = accountCode.get(codeIndex);
            int cutMoney = r.nextInt(1000);
            Account acc = (Account) Bank.getAccountList().get(code);
            acc.CutMoney(cutMoney);
            System.out.println(this.getName()+" acc:"+code+" : cut "+cutMoney);
        }
    }
}
