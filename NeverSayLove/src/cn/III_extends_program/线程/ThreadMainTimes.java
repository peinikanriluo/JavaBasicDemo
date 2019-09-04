package cn.III_extends_program.线程;

/**
 * @author taoqi
 * @date 2019/8/9
 */
public class ThreadMainTimes {
    private static ThreadMethods threadMethods = new ThreadMethods();

    /**
     * @描述: 要求：子线程运行执行10次后，主线程再运行5次。这样交替执行三遍
     */
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    threadMethods.ziMethod();
                }
            }
        }).start();
        for (int i = 0; i < 3; i++) {
            threadMethods.zhuMethod();
        }
    }
}
