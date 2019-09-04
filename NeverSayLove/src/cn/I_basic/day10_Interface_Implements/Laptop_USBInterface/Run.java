package cn.I_basic.day10_Interface_Implements.Laptop_USBInterface;

public class Run {
    public static void main(String[] args) {
        USB u = new Mouse();
        USB s = new Keyboard();
        Laptop l = new Laptop();
        l.open();
        l.run(u);
        l.run(s);
        l.close();
    }
}
