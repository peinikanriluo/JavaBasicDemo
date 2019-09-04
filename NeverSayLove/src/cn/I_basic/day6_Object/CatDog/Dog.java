package cn.I_basic.day6_Object.CatDog;

public class Dog {
    private String color;
    private String breed;

    public String getBreed() {
        return breed;
    }

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String color) {

        this.color = color;
    }

    public void eat(){
        System.out.println(color+"的"+breed+"正在啃骨头");
    }
    public void work(){
        System.out.println(color+"的"+breed+"正在看家");
    }
}
