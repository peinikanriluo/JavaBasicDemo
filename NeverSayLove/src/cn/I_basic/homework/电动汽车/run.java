package cn.I_basic.homework.电动汽车;

public class run {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        Car c1 = new Car("大众",999499,453);
        Car c2 = new Car("奇瑞",452344,1211);
        Car c3 = new Car("迈凯轮",4433533,1211);
        Car c4 = new Car("迈轮",443533,1211);
        Car c5 = new Car("凯轮",4433533,1211);
        cars[1] = c5;
        cars[2] = c4;
        cars[3] = c3;
        cars[4] = c2;
        cars[0] = c1;
        select s = new select();
        Car[] c = s.sel(cars);
        for (int i = 0; i < c.length; i++) {
        System.out.println(c[i].getName()+" "+c[i].getPrice()+" "+c[i].getMile());

        }
    }
}
