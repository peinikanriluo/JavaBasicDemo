package cn.I_basic.homework.RedRay红外线;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        RemoteControl r = new RemoteControl();
        TV tv = new TV();
        p.connecting();
        tv.setName("沙雕牌");
        p.controlTV(tv);
        r.control(tv);
    }
}
