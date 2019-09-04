package cn.II_readyJobClass.Day_11_缓冲序列化流.流速度测试_字节_字符_缓存_数组方法;

import java.io.*;

public class OutputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        long o = System.currentTimeMillis();
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("bb.txt"));
        int num;
        while ((num=isr.read())!=-1){
            osw.write(num);
        }
        long n = System.currentTimeMillis();
        isr.close();
        osw.close();
        System.out.println(n-o);
        /*gbk: 122 , 121        utf - 8 : 107 ,84, 69*/
    }
}
