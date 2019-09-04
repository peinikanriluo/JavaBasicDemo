package cn.I_basic.day10_Interface_Implements.AnimalDrink;

public class feedMan extends Animal {

    @Override
    public void eat() {
        System.out.println("人也会吃饭");
    }
    public void feed(Animal a ){
        if(a instanceof Dog) {
            ((Dog)a).eat();
            ((Dog)a).drink();
            ((Dog)a).swim();
        }else if (a instanceof Sheep){
            ((Sheep)a).eat();
            ((Sheep)a).drink();
        }else if (a instanceof Frog){
            ((Frog)a).eat();
            ((Frog)a).drink();
            ((Frog)a).swim();
        }else System.out.println("老子喂你妈吃饭");
    }
}
