package cn.I_basic.day10_Interface_Implements.Interface_IPlay;

public class OldPhone extends Phone {

    @Override
    public void SendMsg() {
        System.out.println("旧手机在发信息");
    }

    @Override
    public void Call() {
        System.out.println("旧手机正在打电话");
    }
}
