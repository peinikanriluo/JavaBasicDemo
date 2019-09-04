package cn.I_basic.day05Array;

public class TestDynamicArray {
    public static void main(String[] args) {
        char[] arrayA = new char[3];
        System.out.println(arrayA);//内存地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0
//  整数类型默认为0；浮点类型默认为0.0；
//  字符类型默认为'\u0000';布尔类型默认为false;
//    引用类型默认为null
        arrayA[1] = '你';
        System.out.println(arrayA[1]);
        arrayA[0] = '\u0100';
        System.out.println(arrayA[0]);
        arrayA[2] = 97;
        System.out.println(arrayA[2]);//打印a
    }
}
