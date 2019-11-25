package Lesson_1122;
/**
 * 账户
 */
public class Account {
    private double totalMoney = 0;
    private int accountCode = 0;

    public Account(int accountCode, double total) {
        this.totalMoney = total;
        this.accountCode = accountCode;
    }

    public int getAccountCode() {
        return accountCode;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public synchronized void  CutMoney(double cgMoney) {
        this.totalMoney -= cgMoney;
    }

    @Override
    public String toString() {
        return "{code:"+this.accountCode+" ,money:"+this.totalMoney+"}";
    }
}
