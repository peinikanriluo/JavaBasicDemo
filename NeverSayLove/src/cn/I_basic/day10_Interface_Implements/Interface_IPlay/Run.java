package cn.I_basic.day10_Interface_Implements.Interface_IPlay;

public class Run {
    public static void main(String[] args) {
        Phone o = new OldPhone();
        Phone n = new NewPhone();
        usePhone(o);
        usePhone(n);
    }

    public static void usePhone(Phone p) {
        if (p instanceof OldPhone) {
            ((OldPhone) p).Call();
            ((OldPhone) p).SendMsg();
        } else if (p instanceof NewPhone) {
            ((NewPhone) p).Call();
            ((NewPhone) p).SendMsg();
            ((NewPhone) p).Play();
        } else System.out.println("无法识别");
    }
}
