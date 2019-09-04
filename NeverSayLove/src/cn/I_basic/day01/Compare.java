package cn.I_basic.day01;


public class Compare {

    public static void main(String[] args) {
        byte a = 55;
        byte b = 54;
        System.out.println(twoNum(a, b));
        int c = 66;
        int d = 66;
        System.out.println(twoNum(c, d));
        System.out.println(twoNum((short) 550635, (short) 554));
        System.out.println(twoNum(100l,100l));
    }

    public static String twoNum(byte a, byte b) {
        String same;
        if (a == b) same = "相等";
        else same = "不相等";
        return same;
    }

    public static char twoNum(short a, short b) {
        char c = a == b ? 'Y' : 'N';
        return c;

    }

    public static boolean twoNum(int a, int b) {
        boolean same;
        if (a == b) same = true;
        else same = false;
        return same;
    }

    public static boolean twoNum(long a, long b) {
        //      boolean same;
//        same = a == b ? true : false;  //废话太多
//        same = a == b// 还是不够简短，
        return a == b;
//        简单粗暴，不是针对本方法，我是说上面所有方法都是渣渣
    }
}
