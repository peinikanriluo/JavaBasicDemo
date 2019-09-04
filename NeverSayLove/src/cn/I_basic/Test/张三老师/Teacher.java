package cn.I_basic.Test.张三老师;

public class Teacher {
    private String setName;
    private String subject;

    public void introduce() {
        System.out.println("我是" + setName + "老师我教" + subject + "学科!");
    }

    public String getName() {
        return setName;
    }

    public void setName(String name) {
        this.setName = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {

    }

    public Teacher(String name, String subject) {

        this.setName = name;
        this.subject = subject;
    }
}
