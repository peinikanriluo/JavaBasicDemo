package cn.II_readyJobClass.Day_12_网络编程.客户端多线程发送;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class MyThreadServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9988);
        System.out.println("正在等待链接.");
        while (true) {
        Socket accept = ss.accept();
            new Thread(new Runnable() {
                public void run() {
                    try {
                        InputStream is = accept.getInputStream();
                        String replace = UUID.randomUUID().toString().replace("-", "");
                        FileOutputStream fos = new FileOutputStream("e:/测试文件夹/" + replace + ".jpg");
                        byte[] by = new byte[1024];
                        int num;
                        while ((num = is.read(by, 0, 1024)) != -1) {
                            fos.write(by, 0, num);
                        }
                        fos.close();
                        accept.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            System.out.println("线程运行结束");
                }
            }).start();
        }

    }
}

class SendMsgCilent {
    public static void main(String[] args) throws IOException {
        while (true) {
        Socket soc = new Socket("localhost", 9988);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            OutputStream outputStream = soc.getOutputStream();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        FileInputStream fis = new FileInputStream("dzq.jpg");
                        byte[] by = new byte[4048];
                        int num;
                        while ((num = fis.read(by, 0, 4048)) != -1) {
                            outputStream.write(by, 0, num);
                        }
                        fis.close();
                        soc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

    }
//}
    }}