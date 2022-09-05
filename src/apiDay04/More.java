package apiDay04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Set集
 * java.util.Set：不可重复集合，大部分实现类是无序的
 */
public class More {
    public static void main(String[] args) {
        //★小面试题：如何去重
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("two");
        list.add("five");
        System.out.println(list);
        //转换为Set去重
        Set<String> set1 = new HashSet<>();
        set1.addAll(list);
        System.out.println(set1);
        System.out.println("=============================================");

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("two");
        set.add("five");
        System.out.println(set);
    }
}
