package cn.I_basic.day9_Extends_Abstract.Extendsproject;

public class Staff{
    public Staff() {
    }

    public Staff(String name, int number,int salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    private String name;
    private int number;
    private int salary;
    public void work(){
        System.out.println();
        System.out.print("编号为"+number+"的"+name+"正在");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


