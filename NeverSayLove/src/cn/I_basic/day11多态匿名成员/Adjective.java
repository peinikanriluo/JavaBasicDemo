package cn.I_basic.day11多态匿名成员;

class Adj{
    private String adj;

    public String getAdj() {
        return adj;
    }

    public Adj(String adj) {
        this.adj = adj;
    }

    public void setAdj(String adj) {
        this.adj = adj;
    }
}
public class Adjective {
    Adj a; /*= new Adj();*///如不补上" = new Adj()".使用这个对象是需要再次创造对象的,因为没有实际类型
    public static void main (String[]args){
        Adjective n = new Adjective();
//        n.a.setAdj(new Adj("激动的"));
//        System.out.println("我们很"+n.a.getAdj());

        n.a=(new Adj("妈的复杂的很,这里的setA是对n这个对象中a变量set"));
        System.out.println("所以给英雄设置武器是真的设置了武器这个对象\r\n"+n.a.getAdj());
    }
    public class inner{
        Adj a;
        public void run(){
            Adjective.this.a.setAdj("伤心的");
            System.out.println("我们正在"+Adjective.this.a.getAdj()+"的玩着游戏");
        }
    }

    public Adj getA() {
        return a;
    }

    public void setA(Adj a) {
        this.a = a;
    }
}
