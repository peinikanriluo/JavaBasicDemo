package cn.III_extends_program.测试总结.基础拓展.动态代理测试.代理柳岩;

public class LiuYan implements Star {
    //唱歌
    public void sing(double money) {
        System.out.println("柳岩唱了一首：甜蜜蜜");
        System.out.println("赚了"+money+"元");
    }
    //参加综艺节目
    public void liveShow(double money) {
        System.out.println("柳岩参加了：奔跑吧，兄弟");
        System.out.println("赚了"+money+"元");
    }
    //睡觉
    public void sleep() {
        System.out.println("好累啊，休息一会。。。。。");
    }
}
