package cn.II_readyJobClass.Day_12_网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileTranspotCientService {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动,等待链接");
        ServerSocket ss = new ServerSocket(9898);
        Socket server = ss.accept();
        InputStream is = server.getInputStream();
        FileOutputStream fw = new FileOutputStream("dengziqihahahah.jpg");
        byte[] by = new byte[10];
        int num ;
        while((num = is.read(by,0,10))!=-1){
            fw.write(by,0,num);
        }
        fw.close();
        ss.close();
    }
}
/*192.168.28.78*/
class FileTransportCilent{
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        Socket s = new Socket("localhost",9898);
        OutputStream os = s.getOutputStream();
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("dzq.jpg"));
        int num;
        while ((num = fis.read())!=-1){
            os.write(num);
        }

        s.close();
    }
}
