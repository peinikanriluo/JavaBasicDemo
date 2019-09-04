package cn.II_readyJobClass.Day_12_网络编程.客户端循环发送;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TeacherServerSocketDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器正在等待");
        ExecutorService ex = Executors.newFixedThreadPool(2);
        //服务端开一个就够了
        ServerSocket serverSocket = new ServerSocket(9988);
        while (true) {
            // 阻塞方法(客户端没有请求,会一直卡在这里)
            // 有一个客户端发过来图片,就写一张
            // 一张图片要写3s  1s 2s连续两张
            Socket soc = serverSocket.accept();
            Thread th =new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = soc.getInputStream();
                        long time = System.currentTimeMillis();
                        FileOutputStream fos = new FileOutputStream("e:/测试文件夹/" + time + ".jpg");
                        int length;
                        byte[] buffer = new byte[1024];
                        while ((length = is.read(buffer)) != -1) {
                            fos.write(buffer, 0, length);
                        }

                        fos.close();
                        soc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }); // 子线程
            ex.execute(th);
        }

//        serverSocket.close();
//        System.out.println("上传成功");
    }
}

class SendMsgCilentDemo {
    public static void main(String[] args) throws IOException {
        while (true) {
        Socket soc = new Socket("localhost", 9988);
            OutputStream outputStream = soc.getOutputStream();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                    try {
                        FileInputStream fis = new FileInputStream("dzq.jpg");
                        byte[] by = new byte[4048];
                        int num;
                        while ((num = fis.read(by, 0, 4048)) != -1) {
                            outputStream.write(by, 0, num);
                        }
                        fis.close();
                        soc.close();
//                        outputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
        }
    }
}

