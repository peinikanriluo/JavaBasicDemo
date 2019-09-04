package cn.III_extends_program.测试总结.基础拓展.递归;

/**
 * @author taoqi
 * @date 2019/8/9
 */
public class TestRecursion2 {
    /*第1个人10岁，第2个比第1个人大2岁，依次递推，请用递归方式计算出第8个人多大？ */
    public static void main(String[] args) {
        int age = recursionAge(10,8);
        System.out.println("age = " + age);
    }

    private static int recursionAge(int age, int times) {
        if (times==1){
            return age;
        }
        return recursionAge(age+2, times-1);
    }

}
