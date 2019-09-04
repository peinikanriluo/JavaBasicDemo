package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.HomeWork;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Random100NumberThreeThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(3);
        average av = new average();
        Integer e1 = (Integer)es.submit(av).get();
        Integer e2 = (Integer)es.submit(av).get();
        Integer e3 = (Integer)es.submit(av).get();
        System.out.println("三线程随机各自平均数分别是:[   "+e1+"   "+e2+"   "+e3+"   ]");
        Integer ave = (e1+e2+e3)/3;
        System.out.println("三线程总平均数为:"+ave);
        es.shutdown();
    }
}
class average implements Callable {

    @Override
    public Integer call()  {
        Random r = new Random();
        int num=0;
        for (int i = 0; i < 10; i++) {
            num+=r.nextInt(99)+1;
        }
        return num/10;
    }
}