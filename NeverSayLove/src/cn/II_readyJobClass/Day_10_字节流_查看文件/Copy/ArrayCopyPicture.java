package cn.II_readyJobClass.Day_10_字节流_查看文件.Copy;

import java.io.*;

public class ArrayCopyPicture {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("dzq.jpg");
        FileOutputStream fos = new FileOutputStream("e:/邓紫棋.jpg");
        byte[] b =new byte[1024];
        int len;
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
        long l1 = System.currentTimeMillis();
        System.out.println("time="+(l1-l));
    }
}
