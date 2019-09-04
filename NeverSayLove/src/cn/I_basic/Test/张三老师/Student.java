package cn.I_basic.Test.张三老师;

public class Student {
    private String name;
    private int score;
    private Teacher T;

    public void introduce() {
        System.out.println("我是学生" + name + ",我的老师是" + T.getName() + "她教我" + T.getSubject() + "学科!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Teacher getT() {
        return T;
    }

    public void setT(Teacher t) {
        T = t;
    }

    public Student() {

    }

    public Student(String name, int score, Teacher t) {

        this.name = name;
        this.score = score;
        T = t;
    }

    public void result() {
        if (score > 100 || score < 0) System.out.println("成绩不合法");
        if (score < 60)
            System.out.println("成绩太低了,老师" + T.getName() + "让我回去罚写100遍");
        else
            System.out.println("成绩太好了,老师" + T.getName() + "送我一本奥数题,并让我一个月写完!!!");
    }

}
