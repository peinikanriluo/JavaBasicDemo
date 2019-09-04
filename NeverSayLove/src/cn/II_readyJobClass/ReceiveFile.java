package cn.II_readyJobClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveFile {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(55556);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\sn\\Desktop\\资料\\wps.zip");
        byte[] bt = new byte[8096];
        int num;
        System.out.println("-------------正在接收----------------");
        while ((num=is.read(bt,0,8096))!=-1){
            fos.write(bt,0,num);

        }
        fos.close();
        ss.close();
    }
}
