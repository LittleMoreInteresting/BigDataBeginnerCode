package Lesson_1122;

import java.util.ArrayList;
import java.util.List;

public class TransferAccounts {

    public static void main(String[] args) {
        Bank bankObj = new Bank();
        for(int i=0;i<10 ; i++){
            bankObj.createAccount(10000);
        }
        System.out.println(Bank.getAccountList().get(Bank.getAccountCode().get(1)).toString());
    }
}
