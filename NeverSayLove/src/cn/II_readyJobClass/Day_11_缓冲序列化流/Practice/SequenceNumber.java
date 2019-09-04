package cn.II_readyJobClass.Day_11_缓冲序列化流.Practice;

import java.io.*;
import java.util.*;

public class SequenceNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"));
        Properties pro = new Properties();
        String line;
        int num = 0;
        while ((line = br.readLine()) != null) {
            if (line.contains(".")) {
                num = Integer.parseInt(line.split("\\.")[0]);
                pro.put(num, line.split("\\.")[1]);
            } else {
                String str= (String) pro.get(num);
                pro.put(num,str+line);
            }
        }
        Set key = pro.keySet();
        List list = new ArrayList();
        list.addAll(key);
        Collections.sort(list);
        for (Object o : list) {
            bw.write((String) pro.get(o));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
