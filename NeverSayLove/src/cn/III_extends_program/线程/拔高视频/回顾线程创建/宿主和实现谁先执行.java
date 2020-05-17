package cn.III_extends_program.线程.拔高视频.回顾线程创建;

/**
 * @Author: sunset
 * @Date: 2019/9/12 0:34
 * @Description: cn.III_extends_program.线程.拔高视频.回顾线程创建
 */
public class 宿主和实现谁先执行 {
    public static void main(String[] args) {
        // 代码会先找当前Thread子类 中是否有方法 ,
        // 如果有,直接运行子类(Thread匿名实现类)run方法 , 而不会运行父类(Thread),
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("宿主执行 !!!!!");
            }
        }){
            @Override
            public void run() {
                System.out.println("实现执行 !!!!!!!!");
            }
        }.start();
    }
}
