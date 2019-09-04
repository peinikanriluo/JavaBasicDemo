package cn.II_readyJobClass.Day_00_小程序_文件删除查看复制;


import java.io.*;
import java.util.Random;

public class FileCopyDemo {
    public static void main(String[] args) {
        File f = new File("neversaylove/src/cn/readyJobclass");
        File f1= new File("D:\\TestDirectory\\JavaSETest"+"/"+f.getName());
        if(!f.exists()){
            System.out.println("需要复制的文件夹不存在,已终止程序");
            return;
        }
        if(!f1.exists()){
        f1.mkdirs();}
        Random r = new Random();
        DiguiMethod(f, f1, r);
    }

    public static void DiguiMethod(File f, File f1, Random r)  {
        File[] farr = f.listFiles();
        File[] f1arr = f1.listFiles();
        for (int i = 0;  farr.length>i; i++) {
            if(farr[i].isFile()) {
                FileReader fr = null;
                try {
                    fr = new FileReader(farr[i]);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                String name=farr[i].getName();
                for (int i1 = 0; i1 < f1arr.length; i1++) {
                    if(f1arr[i1].getName().equals(farr[i].getName())){
                        System.out.println("存在同名文件 : "+farr[i].getName()+",默认覆盖");
                    }
                }
                FileWriter fw = null;
                int num;
                try {
                    fw = new FileWriter(f1.getPath()+"/"+name);
                    while((num=fr.read())!=-1){
                        fw.write(num);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        fr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            else{
                Random ra = new Random();
                File f2=new File(f1.getAbsolutePath()+"/"+farr[i].getName());
                f2.mkdirs();
                System.out.println("开始写入文件夹 : "+f2.getAbsolutePath());
                DiguiMethod(farr[i],f2,ra);
            }
        }
    }
}
