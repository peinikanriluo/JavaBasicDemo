package cn.I_basic.day11多态匿名成员.Game_定义接口对象作为成员变量;

public class Run {
    public static void main(String[] args) {
        Role r = new Role();
        r.setName("大炮酱");
        Skill s = new Skill() {
            @Override
            public void skill() {
                System.out.println(r.getName()+"使用天女散花");
            }
        };
        r.setS(s);
        r.attack();
        r.setS(new Skill() {//更改技能(接口)对象
            @Override
            public void skill() {
                System.out.println(r.getName()+"小拳拳捶你胸口!");
            }
        });
        r.attack();
    }
}
