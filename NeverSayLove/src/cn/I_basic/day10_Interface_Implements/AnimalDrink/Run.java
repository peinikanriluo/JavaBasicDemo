package cn.I_basic.day10_Interface_Implements.AnimalDrink;

public class Run {
    public static void main(String[] args) {
        Animal f = new feedMan();
        Animal d = new Dog();
        Animal S = new Sheep();
        Animal fr = new Frog();
        //事实上运行是就给变量f看成new feedMan()就行了
        f.feed(d);
        f.feed(S);
        f.feed(fr);
    }
}
