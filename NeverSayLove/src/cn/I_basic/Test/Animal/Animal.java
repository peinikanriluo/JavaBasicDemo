package cn.I_basic.Test.Animal;

public abstract class Animal {
    String name;
    public abstract void speak(String str);

    public Animal() {
    }

    public Animal(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
