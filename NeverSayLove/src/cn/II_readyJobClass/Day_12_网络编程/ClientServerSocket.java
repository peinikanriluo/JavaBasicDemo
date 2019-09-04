package cn.II_readyJobClass.Day_12_网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientServerSocket {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9999);
        while (true) {
            System.out.println("准备接收文件");
            Socket accept = ss.accept();
            System.out.println("正在接收文件");
            InputStream inputStream = accept.getInputStream();
            FileOutputStream fos = new FileOutputStream("20190706我创建了.txt");
            byte[] by = new byte[1024];
            int num;
            while ((num = inputStream.read(by, 0, 1024)) != -1) {
                fos.write(by, 0, num);
            }
            fos.close();
            int times = 1;
            System.out.println("已接收文件" + (times++));
        }
    }
}

class client {
    public static void main(String[] args) throws Exception {
        Socket soc = new Socket("localhost", 9999);
        OutputStream outputStream = soc.getOutputStream();
        FileInputStream fis = new FileInputStream("map.txt");
        byte[] by = new byte[1024];
        int length;
        while ((length = fis.read(by, 0, 1024)) != -1) {
            outputStream.write(by, 0, length);
        }
        outputStream.close();
    }
}

