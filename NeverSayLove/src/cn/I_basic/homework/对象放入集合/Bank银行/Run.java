package cn.I_basic.homework.对象放入集合.Bank银行;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Bank a = new Bank();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入当前账户余额");
        a.setBalance(s.nextInt());
        while (true){
        System.out.println("请选择你要进行的操作\r\n" +
                "1     存钱      \r\n" +
                "2     取钱");
        switch (s.next()) {
            case "1":
                System.out.println("请选择要存入的金额");
                a.save(s.nextInt());
                break;
            case "2":
                System.out.println("请选择要取出的金额");
                a.draw(s.nextInt());
                break;
                default:
                    System.out.println("输入有误,请重新输入");
        }
    }
}}