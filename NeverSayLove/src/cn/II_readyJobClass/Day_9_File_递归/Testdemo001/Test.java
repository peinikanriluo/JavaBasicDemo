package cn.II_readyJobClass.Day_9_File_递归.Testdemo001;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        String s = sc.nextLine();
        File f = new File(s);
        getSum(f);

    }

    public static void getSum(File f) {
        Map<String, Integer> map = new HashMap<>();
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isFile()){
                String name = file.getName();
                System.out.println(name);
                String[] ssss = name.split("\\.");
                System.out.println("split[0] = " + ssss[0]);
                if(!map.containsKey(ssss[0])){
                    map.put(ssss[0],1);
                }else{
                    map.put(ssss[0],map.get(ssss[0])+1);
                }
            }else{
                getSum(file);
            }
        }
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+"的类型有"+map.get(s)+"个");
        }
    }
}
