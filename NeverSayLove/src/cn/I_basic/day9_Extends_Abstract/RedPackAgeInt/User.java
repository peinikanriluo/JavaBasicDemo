package cn.I_basic.day9_Extends_Abstract.RedPackAgeInt;

public class User {
   private String name ;
   private int acountBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcountBalance() {

        return acountBalance;
    }

    public void setAcountBalance(int acountBalance) {
        this.acountBalance = acountBalance;
    }

    public User() {

    }

    public User(String name, int acountBalance) {

        this.name = name;
        this.acountBalance = acountBalance;
    }

}
