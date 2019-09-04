package cn.I_basic.day6_Object.Manage;
//构造方法只要无参和满参数就行了，有的时候要注意会出现构造函数不重载
public class Detail {
    public static void main(String[] args) {

        Manager mana = new Manager("woaini",1324,34);
        mana.intro();
        mana.showSalary();
        mana.work();
        mana.setName("猪八戒");
        mana.setNumber(00000);
        mana.setSalary(000000);
        System.out.println(mana.getName());
        System.out.println(mana.getNumber());
        System.out.println(mana.getSalary());
        System.out.println("======================");

        Coder shuaibi = new Coder("qi",88888,2000000000,2000000000);
        shuaibi.intro();

        shuaibi.showSalary();
        shuaibi.work();
    }
}
