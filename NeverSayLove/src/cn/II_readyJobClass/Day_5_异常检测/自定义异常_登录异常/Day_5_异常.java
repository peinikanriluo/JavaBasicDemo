package cn.II_readyJobClass.Day_5_异常检测.自定义异常_登录异常;

import javax.security.auth.login.LoginException;

public class Day_5_异常 {
    // 模拟数据库中已存在账号
    private static String[] names = {"bill","hill","jill"};

    public static void main(String[] args) {
        //调用方法
        try{
            // 可能出现异常的代码
            checkUsername("bill");
            System.out.println("注册成功");//如果没有异常就是注册成功
        }catch(LoginException e){
            //处理异常
            System.out.println("出现异常");
            e.printStackTrace();
        }
    }

    //判断当前注册账号是否存在
    //因为是编译期异常，又想调用者去处理 所以声明该异常
    public static boolean checkUsername(String inputname) throws LoginException{
        for (String name : names) {
            if(name.equals(inputname)){//如果名字在这里面 就抛出登陆异常
                throw new LoginException("亲"+name+"已经被注册了！");
            }
        }
        return true;
    }
}
