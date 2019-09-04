package cn.III_extends_program.测试总结.数据结构.Map测试题;

import cn.I_basic.day9_Extends_Abstract.RedPackage.User;

import java.util.*;

/**
 * @author taoqi
 * @date 2019/8/4
 */
/*已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现对
HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散。
*/
public class HashMap排序 {
    public static void main(String[] args) {
        HashMap<Integer, User> users = new HashMap<>();
        users.put(1, new User("张三", 25));
        users.put(3, new User("李四", 22));
        users.put(2, new User("王五", 28));
        users.put(6, new User("哈哈", 11));
        users.put(5, new User("呼呼", 25));
        users.put(4, new User("拉拉", 26));
        HashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
        ArrayList<Map.Entry> userEntrys = new ArrayList<>();
        Set<Map.Entry<Integer, User>> entries = users.entrySet();
        for (Map.Entry<Integer, User> entry : entries) {
            userEntrys.add(entry);
        }
        Collections.sort(userEntrys, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return (int) (((User)o1.getValue()).getCount() - ((User)o2.getValue()).getCount());
            }
        });
        for (Map.Entry userEntry : userEntrys) {
            linkedHashMap.put(userEntry.getKey(),userEntry.getValue());
        }
        System.out.println("linkedHashMap = " + linkedHashMap);
    }
}
