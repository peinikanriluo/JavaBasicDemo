package cn.II_readyJobClass.Day_11_缓冲序列化流.缓冲流输入需要刷新存档保存;

import java.io.*;

public class GbkTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt "),"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a1.txt"),"gbk");
        char[] by = new char[4048];
        int num;
        while((num= isr.read(by,0,4048))!= -1){
            osw.write(by,0,num);
        }
        osw.close();
        isr.close();

    }
}
