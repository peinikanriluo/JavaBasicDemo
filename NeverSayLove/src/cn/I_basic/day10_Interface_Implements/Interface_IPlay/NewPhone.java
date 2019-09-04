package cn.I_basic.day10_Interface_Implements.Interface_IPlay;

public class NewPhone extends Phone implements IPlay {

    @Override
    public void Play() {
        System.out.println("新手机游戏可好玩了");
    }

    @Override
    public void SendMsg() {
        System.out.println("新手机正在发信息");
    }

    @Override
    public void Call() {
        System.out.println("新手机还可以打电话,好厉害");
    }
}
