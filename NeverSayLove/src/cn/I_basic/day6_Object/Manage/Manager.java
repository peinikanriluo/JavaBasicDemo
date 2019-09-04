package cn.I_basic.day6_Object.Manage;

public class Manager {
    private String name;
    private int number;
    private int salary;
    public void intro(){
        System.out.println("姓名："+name+";工号："+number);

    }
    public void showSalary(){
        System.out.println("工资："+salary);
    }
    public void work(){
        System.out.println("正在努力监视着程序员打代码");

    }

    public Manager(int number) {

        this.number = number;
    }

    public Manager(String name) {

        this.name = name;

    }

    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager(String name, int number, int salary) {
        this.name = name;

        this.number = number;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
