package cn.I_basic.day10_Interface_Implements.LapTop_NoteBookComputer;

public class Mouse implements USB{

    public void open() {
        System.out.println("鼠标已发出美丽的绿光");
    }
    public void close() {
        System.out.println("鼠标已关闭");
    }
    public void method(){
        System.out.println("鼠标可以使用");
    }
}
