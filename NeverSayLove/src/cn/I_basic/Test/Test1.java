package cn.I_basic.Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r = s.next();
        if (r.length() <10) {System.out.println("输入长度不合法");
        }else{
            String sub = r.substring(3,10);
            int sum = 0;
            for (int i = 0; i < sub.length(); i++) {
                if(sub.charAt(i)<='z'&&sub.charAt(i)>='a'||(sub.charAt(i)<='Z'&&sub.charAt(i)>='A'))
                    sum++;
            }
            System.out.println("sum = " + sum);
        }
    }
}
