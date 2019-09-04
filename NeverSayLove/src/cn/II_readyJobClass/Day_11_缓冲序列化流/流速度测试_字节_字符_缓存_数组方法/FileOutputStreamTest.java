package cn.II_readyJobClass.Day_11_缓冲序列化流.流速度测试_字节_字符_缓存_数组方法;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        long o = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("bb.txt");
        int a ;
        while((a = fis.read())!=-1){
            fos.write(a);
        }
        fis.close();
        fos.close();
        long n =System.currentTimeMillis();
        System.out.println(n-o);
        /*1213, 1286 */
    }
}
