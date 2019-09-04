package cn.II_readyJobClass.Day_10_字节流_查看文件.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCopyTest {
    public static void main(String[] args) throws IOException {
        long old = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("邓紫棋.jpg");
        FileOutputStream fos = new FileOutputStream("dzq.jpg");
        int content;
        while ((content = fis.read())!=-1){
            fos.write(content);
        }
            fos.close();
            fis.close();
        long ne = System.currentTimeMillis();
        System.out.println("时长:"+(ne-old));
    }
}
