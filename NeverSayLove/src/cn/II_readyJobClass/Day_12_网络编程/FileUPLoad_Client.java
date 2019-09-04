package cn.II_readyJobClass.Day_12_网络编程;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class FileUPLoad_Client {

    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1 创建输入流,读取本地文件
        while (true) {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("邓紫棋.jpg"));
            // 1.2 创建输出流,写到服务端
            Socket socket = new Socket("196.168.28.72", 10010);
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

            //2.写出数据.
            byte[] b = new byte[1024 * 8];
            int len;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
                bos.flush();
            }
            System.out.println("文件发送完毕");
            // 3.释放资源
            bos.close();
            socket.close();

            bis.close();
            System.out.println("文件上传完毕 ");
        }
    }
}
