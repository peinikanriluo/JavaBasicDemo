package cn.I_basic.day9_Extends_Abstract.Person_Worker_Strdent;

public class Run {
    public static void main(String[] args) {
        Student s = new Student("开飞机","12314213",32,"23","shc",32);
        s.work();
        Worker w = new Worker();
        w.work();

        StudentLeader st = new StudentLeader("飞机");
        st.meeting();
        st.setJob("打飞机");
    }
}
