package apiDay04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * List集合
 * 1.List接口中提供了一套通过下标来操作元素的方法
 * 2.线性表，是可以重复集合，并且有序
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//该集合被泛型只能装String类型
        list.add("one");//下标0
        list.add("two");//下标1
        list.add("three");//下标2
        list.add("four");//下标3
        list.add("five");//下标4
        System.out.println("list:"+list.toString());//[one, two, three, four, five]
        /**
         * 1)通过get()方法获取某一下标下的值
         */
        String e = list.get(2);
        System.out.println(e);

        //普通for循环
        //集合中获取长度用size()方法
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //增强for循环
        //String str为输出的类型及变量名，list为集合的变量名
        for (String str : list){
            System.out.println(str);
        }
        //迭代器迭代
        Iterator<String> it = list.iterator();//获取集合list的迭代器
        while (it.hasNext()){ //若有下一个元素
            //String str = it.next();//获取下一个元素
            //System.out.println(str);
            System.out.println(it.next());//获取下一个元素
        }

        System.out.println("========================================");

        /**
         * 2)通过set()方法给某一下标修改元素,并返回被替换的元素(用时接收)
         */
        String old = list.set(2,"six");
        //list.set(2,"six");//常规使用
        System.out.println(list);
        System.out.println(old);//将替换下来的值seven返回给old并输出

        /**
         * 3)反转list集合元素(下标变化了)
         */
        /*
         *java.util.Collections为集合的工具类，包含了集合相关(几乎静态)的方法
         * Collections类中提供反转静态方法reverse();
         */
        Collections.reverse(list); //反转list集合元素(下标变化了)
        System.out.println(list); //[five, four, six, two, one]

        /**
         * 4)add()的重载(index,E e)将元素e添加到index指定的位置，类似于insert()插入
         */
        list.add(3,"three");
        System.out.println(list);//[five, four, six, three, two, one]

        /**
         * 5)通过E remove(int index)删除指定位置元素，并返回指定位置元素(用时接收)
         */
        String o =list.remove(2);
        //list.remove(2);//常规使用
        System.out.println(list);//[five, four, three, two, one]
        System.out.println(o);//six
    }
}
