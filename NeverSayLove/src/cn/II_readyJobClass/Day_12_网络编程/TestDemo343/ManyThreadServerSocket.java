package cn.II_readyJobClass.Day_12_网络编程.TestDemo343;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ManyThreadServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        ExecutorService es = Executors.newFixedThreadPool(10);
        System.out.println("服务器启动,等待接收数据");
        while (true){
            Socket accept = ss.accept();
             es.submit( new Thread(new Runnable() {
                @Override
                public void run() {
                        try {
                            InputStream is = accept.getInputStream();
                            long l = System.currentTimeMillis();
                            FileOutputStream fos = new FileOutputStream("E:\\测试文件夹\\"+l+".jpg");
                            byte[] by = new byte[1024];
                            int length;
                            while((length= is.read(by,0,1024))!=-1){
                                fos.write(by,0,length);
                            }
                            is.close();
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    System.out.println(Thread.currentThread()+" 已启动!!!");
                    }
                }
            ));


        }
    }
}
