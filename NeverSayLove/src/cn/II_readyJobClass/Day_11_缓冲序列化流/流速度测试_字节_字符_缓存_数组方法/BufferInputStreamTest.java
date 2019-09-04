package cn.II_readyJobClass.Day_11_缓冲序列化流.流速度测试_字节_字符_缓存_数组方法;

import java.io.*;

public class BufferInputStreamTest {
    public static void main(String[] args) throws IOException {
        long o = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bb.txt"));
        byte[] by = new byte[8048];
        int a ;
        while((a = bis.read(by,0,8048))!= -1){
            bos.write(by,0,a);
        }
        long n = System.currentTimeMillis();
        bis.close();
        bos.close();
        System.out.println(n-o);
        /* 28 , 40   byte数组: 7, 4 , 8 , */
    }
}
