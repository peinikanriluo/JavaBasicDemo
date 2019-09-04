package cn.II_readyJobClass.Day_11_缓冲序列化流;

import java.io.*;

public class OutputStreamWriterAndInputStreamReader {
    public static void main(String[] args) throws IOException {
        long o = System.currentTimeMillis();
        OutputStreamWriter osw = new OutputStreamWriter
                (new FileOutputStream("a.txt"),"gbk");
        osw.write("zaijianlewodeai xiamiankaishi luanma\r\n天空灰的想哭过,酸酸的空气,只剩下可惜");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"gbk");
        char[] ch = new char[4048];
        int len = ch.length;
        int s ;
        while ((s = isr.read(ch,0,len))!=-1){
                osw.write(ch,0,s);
        }
        isr.close();
        osw.close();
        long n = System.currentTimeMillis();
        System.out.println();
        System.out.println(n-o);
    }
}
