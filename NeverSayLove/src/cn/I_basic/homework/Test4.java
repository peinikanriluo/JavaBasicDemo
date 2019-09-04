package cn.I_basic.homework;
/*编写一个Java程序，定义一个String字符串"   ab123cd  "，
首先去除字符串两端的空白，然后截取出字
符串中的最后3个字符并在控制台输出。（可以自己查一下API）*/
public class Test4 {
    public static void main(String[] args) {
        String nidaye ="                ab123cd ";
        nidaye = nidaye.replace("   ","");
        System.out.println("nidaye = " + nidaye);
        String nierye = nidaye.substring(nidaye.length()-3,nidaye.length());
        System.out.println("nierye = " + nierye);
    }
}
