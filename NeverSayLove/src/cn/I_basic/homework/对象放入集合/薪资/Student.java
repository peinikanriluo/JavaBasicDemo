package cn.I_basic.homework.对象放入集合.薪资;

public class Student {
    private int sal;
    public void boo(){
        if (getSal()<10000) {
            setSal(getSal()+2000);
        }

    }
   private String name ;

    public Student(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Student() {
    }


}
