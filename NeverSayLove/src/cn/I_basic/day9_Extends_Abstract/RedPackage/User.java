package cn.I_basic.day9_Extends_Abstract.RedPackage;

import java.util.Objects;

public class User {
    private String name ;
    private  double count;//当前用户拥有的钱
    public void show(){//得瑟一小会
        System.out.println("金额"+count+" 名字"+name);
    }

    public User(String name, double count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.count, count) == 0 &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public User() {

    }
}
