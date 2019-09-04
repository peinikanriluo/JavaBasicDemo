package cn.I_basic.day11多态匿名成员;

 class Run {
    public static void main(String[] args) {
       Heart h = new Heart();
       h.xintiao();
       h.run(h);
    }




}
class Heart {
    private String minute;

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public void xintiao(){
        System.out.println("心脏不跳,你们都是弟弟");
    }
    public void run(Heart heart){

        System.out.println("心脏运行了");
    }
}