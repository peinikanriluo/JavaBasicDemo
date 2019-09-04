package cn.I_basic.day8_String;

public class NewOrNo {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");//new出来都是要进堆的，进不了字符串常量池。
        String c =new String (new byte[]{97,98,99});
        String f = new String(new byte[]{97,98,99});
        String d = new String (new char[]{'a','b','c'});
        String e = "abc";
        System.out.println("(a==b) = " + (a==b));
        System.out.println("(a==e) = " + (a==e));
    }
}
