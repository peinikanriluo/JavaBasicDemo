package cn.III_extends_program.面试题;

/**
 * @author taoqi
 * @date 2019/8/13
 */
public class test03 extends Thread{
    public void run(){
        try{
            for (int i = 1; i < 5; i++) {
                System.out.println(i+"");
                if(i>2) interrupt();
                sleep(1000);
                if(interrupted()) break;
            }
        } catch (InterruptedException e){
            System.out.println("  caught");
        }
    }

    public static void main(String[] args) {
        test03 my = new test03();
        my.start();
    }
}
