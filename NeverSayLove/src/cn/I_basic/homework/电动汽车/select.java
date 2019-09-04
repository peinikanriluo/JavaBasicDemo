package cn.I_basic.homework.电动汽车;

public class select /*extends Car*/{
    public Car[] sel(Car[] cars){
        int num = 0 ;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getPrice()<1000000&&cars[i].getMile()>1000)
            num++;
        }
        Car[] nc = new Car[num];
        int n = 0;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getPrice()<1000000&&cars[i].getMile()>1000){
        nc[n] = cars[i];
                n++;
    }
        }
        return nc;
        }
}
