package cn.II_readyJobClass.Day_8_Stream流.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class homeWork03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("《教父》");
        list.add("《肖申克的救赎》");
        list.add("《辛德勒的名单》");
        list.add("《公民凯恩》");
        list.add("《卡萨布兰卡》 ");
        list.add("《教父续集》");
        list.add("《七武士》");
        list.add("《星球大战》");
        list.add("《美国美人》");
        list.add(" 《飞跃疯人院》");
        list1.add("《霸王别姬》");
        list1.add("《大闹天宫》");
        list1.add("《鬼子来了》");
        list1.add("《大话西游》");
        list1.add("《活着》");
        list1.add("《饮食男女》");
        list1.add("《无间道》");
        list1.add("《天书奇谭》");
        list1.add("《哪吒脑海》");
        list1.add(" 《春光乍泄》");
        /*1）打印全球影片排行榜中的前三甲影片名
	2）打印华人影片排行榜中倒数5名的影片名
	3）将两个排行榜中的前5名挑出来共同存入新的集合
	4）定义电影Film类，以影片名为name创建Film对象并保存至集合*/
        list.stream().limit(3).forEach(a-> System.out.println(a));
        list1.stream().skip(5).forEach(a-> System.out.println(a));
        List<String> collect = Stream.concat(list.stream().limit(5),
                list1.stream().limit(5)).collect(Collectors.toList());

        List<Film> film = new ArrayList<>();
        for (String s : collect) {
        Film f = new Film();
            f.name=s;
            film.add(f);
        }
        System.out.println("---------------------film集合-------------------------");
        System.out.println(film);
//        collect.stream().map(a -> f.name = a).collect(Collectors.toList());

    }
}
class Film{
    String name;

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }
}
