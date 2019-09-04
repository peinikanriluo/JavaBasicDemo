package cn.I_basic.homework;

import java.util.Arrays;
/*请使用Arrays 相关的API，
将一个随机字符串中的所有字符升序排列，并倒序打印。*/
public class Test2 {
    public static void main(String[] args) {
        String a ="wheiohwaengjkIOAJIoIHIOJ235让3itjjfiaj";
        char []arr = a.toCharArray();
        Arrays.sort(arr);
        char []chars=new char[arr.length];
        a = new String(arr);
        System.out.println("a = " + a);
        for (int i = 0; i < arr.length; i++) {
            chars[i] = arr[arr.length-1-i];
        }
        System.out.println("new String(chars) = " + new String(chars));
    }
}
