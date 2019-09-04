package cn.I_basic.day11多态匿名成员.Game_定义接口对象作为成员变量;

public class Role {
    String name;
    Skill s;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void attack(){
        System.out.println("使用技能");
        s.skill();
        System.out.println("技能使用完毕");
    }

    public Skill getS() {
        return s;
    }

    public void setS(Skill s) {
        this.s = s;
    }

    public Role() {
    }

    public Role(Skill s) {

        this.s = s;
    }
}
