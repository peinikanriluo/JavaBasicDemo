package cn.I_basic.day10_Interface_Implements.LapTop_NoteBookComputer;

public class Laptop  {

    public void open() {
        System.out.println("笔记本已开机");
    }

    public void close() {
        System.out.println("笔记本已关机");
    }

    public void method(USB a){
        if (a instanceof Mouse) ((Mouse)a).method();
        else if (a instanceof KeyBoard) ((KeyBoard) a).method();
        else System.out.println("你插的什么jb玩意");
    }

}
