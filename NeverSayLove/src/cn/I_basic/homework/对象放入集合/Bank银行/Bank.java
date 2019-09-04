package cn.I_basic.homework.对象放入集合.Bank银行;

public class Bank {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Bank() {

    }

    public Bank(int balance) {

        this.balance = balance;
    }

    public void save(int inMonney){
        System.out.println("正在存入");
        this.balance = balance + inMonney;
        System.out.println("存入成功,当前余额"+balance);
    }
    public void draw(int  outMonney){
        if (balance < outMonney) {
            System.out.println("您当前余额不足!");
        }else{
            System.out.println("正在取出");
        this.balance = balance - outMonney;
        System.out.println("操作成功,当前余额"+this.balance);
    }}
}
