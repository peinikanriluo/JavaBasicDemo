package cn.I_basic.day02;

public class TypeChange {
    public static void main(String[] args) {
        int a = 'A';
        byte b = 1;
        byte c = 5+77;
        System.out.println(c);
        System.out.println(a);
        int i= 2000000000;
//        long h=3000000000;//报错，超出int范围
        long j = 2000000000+ 2000000000;//不报错，但是数据溢出
        //编译器还是low，不计算超int范围的加法，但是限定单个数的范围
        System.out.println(j);
    }
}
