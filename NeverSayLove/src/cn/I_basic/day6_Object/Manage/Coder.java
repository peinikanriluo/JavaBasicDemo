package cn.I_basic.day6_Object.Manage;

public class Coder {
    private String name;
    private int number;
    private int salary;
    private int reward;
    public void intro(){
        System.out.println("姓名："+name+"；工号："+number);

    }
    public void  showSalary(){
        System.out.println("基本工资："+salary+"；奖金："+reward);
    }
    public void work(){
        System.out.println("正在努力写代码并且默默诅咒经理中、、、、、");
    }

    public Coder(int number) {

        this.number = number;
    }

    public Coder(String name) {

        this.name = name;
    }

    public Coder() {
    }

    public Coder(String name, int number, int salary, int reward) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.reward = reward;
    }

}
