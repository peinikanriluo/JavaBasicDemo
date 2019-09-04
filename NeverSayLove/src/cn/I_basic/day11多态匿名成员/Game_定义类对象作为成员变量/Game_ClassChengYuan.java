package cn.I_basic.day11多态匿名成员.Game_定义类对象作为成员变量;

public class Game_ClassChengYuan {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("张大炮");
        hero.setAge(18);
        hero.setWeapon(new Weapon("小拳拳"));
        // 给英雄设置个武器
        hero.setHujia(new Hujia("9999"));
        //实际上类作为变量类型就是传递对象
        hero.attrak();

    }

    public static class Hero {
        private String name;
        private int age;
        private Weapon weapon;
        private Hujia hujia;

        public Hujia getHujia() {
            return hujia;
        }

        public void setHujia(Hujia hujia) {
            this.hujia = hujia;
        }

        public void attrak() {
            System.out.println(age + "岁的" + name + "护甲为" +
                    ""+hujia.getHujia()+"正在用" + weapon.getWeapon() + "攻击敌人");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Weapon getWeapon() {
            return weapon;
        }

        public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
        }

        public Hero() {

        }

        public Hero(String name, int age, Weapon weapon) {

            this.name = name;
            this.age = age;
            this.weapon = weapon;
        }
    }

    public static class Weapon {
        private String weapon;

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public Weapon() {
        }

        public Weapon(String weapon) {

        this.weapon = weapon;
        }
    }
    public static class Hujia{
        private String hujia;

        public Hujia() {
        }

        public Hujia(String hujia) {

            this.hujia = hujia;
        }

        public String getHujia() {
            return hujia;
        }

        public void setHujia(String hujia) {
            this.hujia = hujia;
        }
    }
}