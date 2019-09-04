package cn.I_basic.Test;


import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        System.out.println("请瞎鸡巴敲点存在字母的字符串");
        Scanner s = new Scanner(System.in);
        String st = s.next();
        int num = 0,n=0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i)<='z'&&st.charAt(i)>='a'||st.charAt(i)<='Z'&&st.charAt(i)>='A') {
                n++;
                if (st.charAt(i)<='Z'&&st.charAt(i)>='A') {
                    num++;
                }
            }
        }
       if(n==0) System.out.println("带点字母呀!!!你这样我很难帮你办事啊");
        else System.out.println("大写字母出现的次数为"+num);
    }
}