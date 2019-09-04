package cn.I_basic.day10_Interface_Implements.AnimalDrink;

public class Dog extends Animal implements Swim {
    public void eat(){
        System.out.println("给狗狗啃骨头");
    }
    @Override
    public void swim() {
        System.out.println("狗子在狗刨式游泳");
    }
}
