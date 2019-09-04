package cn.II_readyJobClass.Day_11_缓冲序列化流.缓冲流输入需要刷新存档保存;

import java.io.*;
import java.util.Scanner;

public class BufferWriterPoint {
    /**/
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        Scanner s = new Scanner(System.in);
        bw.write(s.nextLine());
        bw.newLine();
        bw.write(s.nextLine());
        bw.newLine();
        bw.write(s.nextLine());
        bw.flush();//缓冲流输入时一定要知道不关流程序不写入
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String str = s.nextLine();
        if(str.equals(br.readLine())||str.equals(br.readLine())||str.equals(br.readLine())) System.out.println("验证成功!!");
        else System.out.println("验证失败");
        bw.close();
    }
}
