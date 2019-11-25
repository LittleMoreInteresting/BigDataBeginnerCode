package Lesson_1122;


import java.util.Map;

public class TransferAccounts {

    public static void main(String[] args) throws InterruptedException {
        //调用银行类；创建10个账户
        Bank bankObj = new Bank();
        for(int i=0;i<10 ; i++){
            bankObj.createAccount(10000);
        }
        //创建10个随机减 进程
        for (int j=0;j<10;j++){
            RandomCut rc = new RandomCut(2);
            rc.setName("rc"+j);
            rc.start();
            rc.join();
        }
        for (Object entry :Bank.getAccountList().entrySet()){
            System.out.println(entry);
        }
        System.out.println("账户总余额： "+bankObj.getTotalMoney());
    }
}
