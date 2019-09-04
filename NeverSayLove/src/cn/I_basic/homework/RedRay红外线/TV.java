package cn.I_basic.homework.RedRay红外线;

public class TV {
    private String name;
    void play(String channel){
        System.out.println(name+"电视正在播放"+channel+"节目");
    }

    public TV() {
    }

    public TV(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
