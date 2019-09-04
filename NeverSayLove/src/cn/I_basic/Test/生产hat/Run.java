package cn.I_basic.Test.生产hat;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        FactoryImp f = new FactoryImp();
        List<Hat> l = f.piliang(11);
        for (int i = 0; i < l.size(); i++) {
            f.describe(l.get(i));
        }
    }
}
