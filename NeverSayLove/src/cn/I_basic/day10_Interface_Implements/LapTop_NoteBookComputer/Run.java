package cn.I_basic.day10_Interface_Implements.LapTop_NoteBookComputer;

public class Run {
    public static void main(String[] args) {

    Laptop la = new Laptop();
    USB m = new Mouse();
    USB k = new KeyBoard();
    USB y = new UnknownDevice();
    la.open();
    m.open();
    la.method(m);
    k.open();
    la.method(k);
    y.open();
    la.method(y);

    }
}