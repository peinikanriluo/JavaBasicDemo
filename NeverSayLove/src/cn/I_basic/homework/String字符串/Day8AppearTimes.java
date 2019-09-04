package cn.I_basic.homework.String字符串;

import java.util.Scanner;
/*
* 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
  分析：
  		A:键盘录入一个字符串数据
  		B:定义三个统计变量，初始化值都是0
  		C:遍历字符串，得到每一个字符
  		D:拿字符进行判断
 			假如ch是一个字符。
 			大写：ch>='A' && ch<='Z'
  			小写：ch>='a' && ch<='z'
  			数字：ch>='0' && ch<='9'
  		E:输出结果*/
public class Day8AppearTimes {
    public static void main(String[] args) {
        Scanner places = new Scanner(System.in);
        String st = "adsigh389TIF";
        int a=0,A=0,num=0;
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)>='a'&&st.charAt(i)<='z') a++;
            else if (st.charAt(i)>='A'&&st.charAt(i)<='Z') A++;
            else if (st.charAt(i)>='0'&&st.charAt(i)<='9') num++;

        }
        System.out.println("a = " + a+"A="+A+"num="+num);

    }
}
