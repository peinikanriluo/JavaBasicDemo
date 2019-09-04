package cn.I_basic.day10_Interface_Implements.Laptop_USBInterface;

public class Mouse implements USB{


    @Override
    public void open() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标的USB");
    }

}
