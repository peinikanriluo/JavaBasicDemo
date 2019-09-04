package cn.II_readyJobClass.Day_9_File_递归;

import java.io.File;
import java.io.IOException;

/**
 * @author taoqi
 * @date 2019/8/22
 */
public class 创建文件夹 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\11350\\Desktop","hehe.html");
        file.createNewFile();
//        file.mkdir();
        System.out.println("file = " + file);
    }
}
