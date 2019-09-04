package cn.II_readyJobClass.Day_11_缓冲序列化流.流速度测试_字节_字符_缓存_数组方法;

import java.io.*;

public class BufferWriterTest {
    public static void main(String[] args) throws IOException {
        long od = System.currentTimeMillis();
        BufferedWriter bw = new BufferedWriter(new FileWriter("bb.txt"));
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        char[] ch = new char[8048];
        int read ;
        while ((read = br.read(ch,0,8048))!=-1){
            bw.write(ch,0,read);
        }
        long ne = System.currentTimeMillis();
        bw.close();
        br.close();
        System.out.println(ne-od);
        /*35,42     char数组形式: 17 */
    }
}
