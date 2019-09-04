package cn.I_basic.day10_Interface_Implements.LapTop_NoteBookComputer;

public class KeyBoard implements USB {


    public void open() {
        System.out.println("键盘已发出耀眼的光芒");
    }
    public void close() {
        System.out.println("键盘已关闭");
    }
    public void method(){
        System.out.println("键盘可以敲了");
    }
}
