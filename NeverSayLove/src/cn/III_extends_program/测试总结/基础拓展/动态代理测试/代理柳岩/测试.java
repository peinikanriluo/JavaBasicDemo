package cn.III_extends_program.测试总结.基础拓展.动态代理测试.代理柳岩;

public class 测试 {
    public static void main(String[] args) {
        // 创建LiuYan对象
//		LiuYan ly = new LiuYan();
//		ly.sing(1000);
//		ly.liveShow(5000);
//		ly.sleep();
        //直接访问经纪人
        Star sg = new QiGe();
        sg.sing(200000);
        System.out.println("-----------------------------------");
        sg.liveShow(1000000);
        System.out.println("-----------------------------------");
        sg.sleep();
    }
}
