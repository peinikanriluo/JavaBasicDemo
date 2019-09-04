package cn.II_readyJobClass.Day_12_网络编程.TestDemo343;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class sdafsdf {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket soc = serverSocket.accept();
        InputStream is = soc.getInputStream();
        FileOutputStream fos = new FileOutputStream("邓紫棋的小米地.jpg");
        byte [] bt = new byte[1024];
        int length;
        while((length = is.read(bt,0,1024))!=-1){
            fos.write(bt,0,length);
        }
        fos.close();
        serverSocket.close();
        System.out.println("接收成功");
    }
}
class  dsfoiajfo{
    public static void main(String[] args) throws IOException {
        Socket soc = new Socket("localhost",9999);
        OutputStream outputStream = soc.getOutputStream();
        FileInputStream fis = new FileInputStream("邓紫棋.jpg");
        byte[] by = new byte[1024];
        int length;
        while((length = fis.read(by,0,1024))!=-1){
            outputStream.write(by,0,length);
        }
        soc.close();
        System.out.println("发送成功");
    }
}