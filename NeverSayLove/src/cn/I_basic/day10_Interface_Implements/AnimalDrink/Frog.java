package cn.I_basic.day10_Interface_Implements.AnimalDrink;

public class Frog extends Animal implements Swim{

    @Override
    public void eat() {
        System.out.println("给青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }
}
