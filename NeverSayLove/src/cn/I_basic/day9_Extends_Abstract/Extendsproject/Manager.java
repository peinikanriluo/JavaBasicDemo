package cn.I_basic.day9_Extends_Abstract.Extendsproject;

public class Manager extends Staff{
    private int reward  ;
    public Manager() {
    }
    public void work(){
        super.work();
        System.out.println("检查工作");
    }

    public Manager(String name, int number, int salary,int reward) {
        super(name, number, salary);
        this. reward = reward;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
