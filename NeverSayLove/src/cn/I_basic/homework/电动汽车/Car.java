package cn.I_basic.homework.电动汽车;

public class Car {
    String name ;
    int price;
    int mile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    public Car(String name, int price, int mile) {

        this.name = name;
        this.price = price;
        this.mile = mile;
    }

    public Car() {

    }
}
