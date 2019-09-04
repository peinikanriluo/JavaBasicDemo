package cn.I_basic.day6_Object.CatDog;

public class Cat {
    /*private*/ String color;
    /*private*/ String breed;

    public void eat() {
        System.out.println(color + "的" + breed + "正在吃鱼");
    }

    public void catchMouth() {
        System.out.println(color + "的" + breed + "正在逮老鼠");
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


    public String getColor() {

        return color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public Cat() {
    }
}
