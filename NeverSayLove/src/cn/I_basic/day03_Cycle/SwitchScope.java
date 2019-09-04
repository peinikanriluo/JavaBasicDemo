package cn.I_basic.day03_Cycle;

import java.util.Scanner;

//switch结构可以作用于字符串。
public class SwitchScope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String zhu = input.next();
        switch(zhu){
            case ("你是猪"):
                System.out.println("反弹^v^ 难受不，狗砸");
                break;
            case ("我是猪"):
                System.out.println("真棒");
            break;
        }
    }
}
