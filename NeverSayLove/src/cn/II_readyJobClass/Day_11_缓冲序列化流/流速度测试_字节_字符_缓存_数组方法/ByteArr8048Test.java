package cn.II_readyJobClass.Day_11_缓冲序列化流.流速度测试_字节_字符_缓存_数组方法;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArr8048Test {
    public static void main(String[] args) throws IOException {
        long o = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("bb.txt");
        byte[] by = new byte[8048];
        int len = by.length;
        int num;
        while ((num = fis.read(by,0,len))!= -1){
            fos.write(by,0,num);
        }
        long n = System.currentTimeMillis();
        fis.close();
        fos.close();
        System.out.println(n-o);
        /*我操了个dj  time:6 , 3 ,2*/
    }
}
