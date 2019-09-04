package cn.I_basic.day9_Extends_Abstract.Extendsproject;

public class Javacoder extends Staff {
    public Javacoder(String name, int number, int salary) {
        super(name, number, salary);
    }

    public Javacoder() {
    }
    public void work(){
        super.work();
        System.out.println("赶工程");
    }
}
