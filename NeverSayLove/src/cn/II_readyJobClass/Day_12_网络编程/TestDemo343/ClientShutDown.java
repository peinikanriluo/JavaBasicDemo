package cn.II_readyJobClass.Day_12_网络编程.TestDemo343;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientShutDown {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket soc =new Socket("localhost",9988);
        OutputStream outputStream = soc.getOutputStream();
        FileInputStream fis = new FileInputStream("邓紫棋.jpg");
        byte[] by = new byte[4048];
        int length;
        while ((length = fis.read(by,0,4048))!=-1){
            outputStream.write(by,0,length);
        }
        soc.shutdownInput();
        Thread.sleep(1000);
        FileInputStream fis1 = new FileInputStream("a.txt");
        while ((length = fis1.read(by,0,4048))!=-1){
            outputStream.write(by,0,length);
        }
        soc.close();
    }
}
