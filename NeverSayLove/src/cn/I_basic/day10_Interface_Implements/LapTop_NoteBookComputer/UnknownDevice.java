package cn.I_basic.day10_Interface_Implements.LapTop_NoteBookComputer;

public class UnknownDevice implements USB {

    @Override
    public void open() {
        System.out.println(" SAMSUNGS8通电啦,距离爆炸还有10分钟 ");
    }

    @Override
    public void close() {
        System.out.println("fsdaf");
    }
}
