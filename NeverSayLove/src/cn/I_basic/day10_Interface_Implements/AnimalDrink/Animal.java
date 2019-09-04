package cn.I_basic.day10_Interface_Implements.AnimalDrink;

public abstract class Animal {
    private int age;
public void feed(Animal a){}
    public Animal() {
    }

    public Animal(int age) {

        this.age = age;
    }

    public void drink(){

        System.out.println("上面那玩意在喝水");
    }
    public abstract void eat();

}
