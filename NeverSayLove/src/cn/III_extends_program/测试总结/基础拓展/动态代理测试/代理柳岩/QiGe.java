package cn.III_extends_program.测试总结.基础拓展.动态代理测试.代理柳岩;

public class QiGe implements Star {
    // 持有被代理对象
    private LiuYan ly = new LiuYan();
    public void sing(double money) {
        // 对money变量进行判断，修改访问参数
        if (money < 100000) {
            System.out.println("滚，穷屌丝，一边玩泥巴去");
            return;
        }
        System.out.println("我抽取了" + money * 0.2 + "元代理费用");
        ly.sing(money * 0.8);
    }
    public void liveShow(double money) {
        // 对money变量进行判断，修改访问参数
        if (money < 500000) {
            System.out.println("滚，穷屌丝，一边玩泥巴去");
            return;
        }
        System.out.println("我抽取了" + money * 0.2 + "元代理费用");
        ly.liveShow(money * 0.8);
    }
    public void sleep() {
        ly.sleep();
    }
}
