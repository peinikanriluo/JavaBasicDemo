package cn.I_basic.Test.Animal;

public class Dog extends Animal implements Sport {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak(String str) {
        System.out.println(name + "说" + str);

    }

    @Override
    public void swimming() {
        System.out.println(name + "狗刨中");
    }
    public void goPlay(String str){
        speak(str);
        swimming();
    }
}
