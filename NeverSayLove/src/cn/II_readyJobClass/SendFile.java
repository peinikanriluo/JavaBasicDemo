package cn.II_readyJobClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendFile {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.28.77", 10086);
        OutputStream os = s.getOutputStream();
        FileInputStream fis = new FileInputStream("D:\\啥笔java培训\\前端\\前端-day04.zip");
        byte[] bt = new byte[8048];
        int num;
        while ((num = fis.read(bt, 0, 8048)) != -1) {
            os.write(bt, 0, num);
        }
        fis.close();
        os.close();
    }
}
