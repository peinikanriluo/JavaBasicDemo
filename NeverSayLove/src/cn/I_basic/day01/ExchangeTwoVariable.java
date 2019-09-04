package cn.I_basic.day01;

public class ExchangeTwoVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;
        System.out.println(a + "\n" + b);

    }
}
