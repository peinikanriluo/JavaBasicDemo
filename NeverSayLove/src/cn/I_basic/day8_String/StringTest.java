package cn.I_basic.day8_String;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String s = new String(new char[]{'2', '3', '4'},0,2) ;
        String s1 = new String(new byte[]{91,92,93,94,95,96,97,99},0,7);
        System.out.println(s);
        System.out.println(s1);
        String ss = "qwertyuiopasdfghjklzxcvbnm1234567890qwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM";
//        System.out.println(ss.contains("q"));
//        System.out.println(ss.contains(";"));
//        System.out.println(ss.contains("q"));
//        System.out.println(ss.startsWith("qwer"));
//        System.out.println(ss.endsWith("reretfew"));
        System.out.println(ss.indexOf("w"));
        System.out.println(ss.indexOf('w'));
        System.out.println(ss.substring(1,10));
        System.out.println(ss.charAt(1));
        byte[] ssb = ss.getBytes();
        String sbb = new String(ssb);
        System.out.println(sbb);
        String ssr = ss.replaceAll("qwertyuiop","即使这么疯狂的爱上我");
        System.out.println(ssr);
        char[] chars = ssr.toCharArray();
        Arrays.sort(chars);
        ssr = new String (chars);
        System.out.println(ssr);
        String[] qs = ssr.split("0");
        System.out.println(Arrays.toString(qs));
    }
}
