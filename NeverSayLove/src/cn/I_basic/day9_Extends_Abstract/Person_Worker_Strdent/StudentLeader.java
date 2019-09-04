package cn.I_basic.day9_Extends_Abstract.Person_Worker_Strdent;

public class StudentLeader extends Student{
    String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public StudentLeader(String job) {
        super();

        this.job = job;
    }

    public void meeting(){
        System.out.println("学生干部喜欢开会");
        System.out.println("年龄"+age+"的"+name+"学生性别为"+gender+"睡觉了");
    }
}
