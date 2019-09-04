package cn.I_basic.Test.生产hat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FactoryImp implements Factory{


    @Override
    public void describe(Hat hat) {
        if(hat.color%2==0) System.out.println("颜色为红色"+",价格为:"+hat.price+"元的"+hat.type);
        else System.out.println("颜色是黄色"+",价格为:"+hat.price+"元的"+hat.type);
    }

    @Override
    public List<Hat> piliang(int num) {
        Random s = new Random();
        List l = new ArrayList();
        for (int i = 0; i < num; i++) {
            l.add(new Hat(s.nextInt(3333),s.nextInt(2222),"太阳帽"));
        }
        return l;
    }
}
