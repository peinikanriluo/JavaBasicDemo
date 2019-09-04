package cn.II_readyJobClass.Day_10_字节流_查看文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByleOpen {
    public static void main(String[] args) throws IOException {
        long old = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\软件\\WPS Office\\10.1.0.5850\\office6\\wpsrenderer.exe");
        int content;
        int i = 0;
        FileOutputStream out = new FileOutputStream("C:\\软件\\WPS Office\\10.1.0.5850\\office6\\wpsrenderer1.exe");

        while ((content = fis.read())!=-1){
            if(content!=235) {
                out.write(content);
            }else {
                i++;
//                if(i!=456){
//                    out.write(content);
//                }else {
//                    System.out.println("已删除字节");
//                }
                out.write(123);
                System.out.println("已修改字节");
            }
        }
        System.out.println("写入假文件成功!");
        fis.close();
//        out.close();
        long ne = System.currentTimeMillis();
        System.out.println("时长:"+(ne-old));
    }
}
