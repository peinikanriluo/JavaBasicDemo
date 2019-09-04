package cn.I_basic.day10_Interface_Implements.Laptop_USBInterface;

public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("链接键盘的USB");
    }

    @Override
    public void close() {
        System.out.println("断开键盘的USB");
    }
}
