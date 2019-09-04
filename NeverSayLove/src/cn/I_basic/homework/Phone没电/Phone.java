package cn.I_basic.homework.Phone没电;

public class Phone {
    private String p;
    private int ele;
    public  void chekPower(){
        if (getEle()<20) {
            System.out.println("电量过低,请充电");
        }
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public int getEle() {
        return ele;
    }

    public void setEle(int ele) {
        this.ele = ele;
    }

    public Phone() {

    }

    public Phone(String p, int ele) {

        this.p = p;
        this.ele = ele;
    }
}
