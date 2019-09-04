package cn.II_readyJobClass.Day_11_缓冲序列化流.流速度测试_字节_字符_缓存_数组方法;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        long od = System.currentTimeMillis();
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("bb.txt");
        char[] ch = new char[8048];
        int read;
        while((read=fr.read(ch,0,8048))!=-1){
            fw.write(ch,0,read);
        }
        long ne = System.currentTimeMillis();
        fr.close();
        fw.close();
        System.out.println(ne-od);
        /*85,95     char数组形式 : 28*/
    }
}
