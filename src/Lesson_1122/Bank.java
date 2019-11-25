package Lesson_1122;

import java.util.*;

/**
 * 账户管理类
 */
public class Bank {
    private static HashMap<Integer,Account> accountList = new HashMap<>();
    private static ArrayList<Integer> accountCode = new ArrayList<>();
    public void createAccount(double bgMoney){
        int code = this.getBankCode();
        accountCode.add(code);
        Account accNew = new Account(code,bgMoney);
        accountList.put(accNew.getAccountCode(),accNew);
    }

    public static ArrayList<Integer> getAccountCode() {
        return accountCode;
    }

    public static HashMap getAccountList() {
        return accountList;
    }

    public double getTotalMoney(){
        double sum = 0;
        for (Map.Entry<Integer, Account> entry :accountList.entrySet()){
            Account acc = entry.getValue();
            sum += acc.getTotalMoney();
        }
        return  sum;
    }

    private int getBankCode(){
        Random r = new Random();
        int number = r.nextInt(100000);
        return number;
    }
}
