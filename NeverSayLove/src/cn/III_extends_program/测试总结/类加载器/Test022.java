package cn.III_extends_program.测试总结.类加载器;

import java.io.FileInputStream;
import java.util.Properties;


public class Test022 {
    public static void main(String[] args) throws Exception {
//        Properties properties = new Properties();
//        InputStream resourceAsStream = Test022.class.getClassLoader().getResourceAsStream("party.properties");
//        properties.load(resourceAsStream);
//        System.out.println(properties.getProperty("singer"));

//        ResourceBundle party = ResourceBundle.getBundle("party");
//        String singer = party.getString("singer");
//        System.out.println("singer = " + singer);

        Properties properties = new Properties();
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\JAVAProjectProgram\\JavaProject/邓紫棋.properties"));
//        properties.load(bufferedInputStream);
        FileInputStream fileInputStream = new FileInputStream("C:\\JAVAProjectProgram\\JavaProject/邓紫棋.properties");
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("singer"));
    }
}
