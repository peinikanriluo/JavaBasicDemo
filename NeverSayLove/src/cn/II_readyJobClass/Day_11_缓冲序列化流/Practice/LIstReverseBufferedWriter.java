package cn.II_readyJobClass.Day_11_缓冲序列化流.Practice;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LIstReverseBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        bw.write("我爱黑马");
        bw.newLine();
        bw.write("123456");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        List<String> list = new ArrayList();
        String str ;
        while ((str = br.readLine())!=null){
            list.add(str);
        }
        br.close();
        Collections.reverse(list);
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("a1.txt"));
        for (String o : list) {
            bw1.write(o);
            bw1.newLine();
        }
        bw1.close();
    }
}
