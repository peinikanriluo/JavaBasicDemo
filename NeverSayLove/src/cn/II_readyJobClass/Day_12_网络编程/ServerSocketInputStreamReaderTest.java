package cn.II_readyJobClass.Day_12_网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketInputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("服务器正在等待");
        Socket so = ss.accept();
        InputStreamReader isr = new InputStreamReader(so.getInputStream());
        FileWriter fw = new FileWriter("b.txt");
        char[] ch = new char[1];
        int num;
        while ((num = isr.read(ch,0,1))!=-1){
            fw.write(ch,0,num);
        }
        fw.close();
        ss.close();
        System.out.println("传输结束");
    }
}
class SocketFileOutputStreamTest{
    public static void main(String[] args) throws IOException {
        Socket so = new Socket("localhost",9999);
        FileInputStream fis = new FileInputStream("a.txt");
        OutputStream outputStream = so.getOutputStream();
        byte[] by = new byte[1024];
        int num;
        while((num = fis.read(by,0,1024))!=-1){
            outputStream.write(by,0,num);
        }
        fis.close();
        so.close();
    }
}