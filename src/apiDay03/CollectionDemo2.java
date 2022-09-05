package apiDay03;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:"+c1); //[java,c++,.net]

        Collection c2 = new ArrayList();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2); //[android,ios,java]

        /**
         * 集合之间相并
         */
        /*并boolean addAll(Collection c)
         *将参数给定的集合中的所有元素添加到当前集合中，添加后当前集合发生改变则返回true
         *因为该类允许重复元素，无论如何都会添加成功
         */
        c1.addAll(c2);//c2并到c1中
        System.out.println("c1:"+c1);//[java, c++, .net, android, ios, java]
        System.out.println("c2:"+c2);//[android, ios, java]

        /**
         * 判断当前集合中是否包含参数集合中的所有元素
         */
        Collection c3 = new ArrayList();
        c3.add("c++");
        c3.add("android");
        c3.add("php");
        System.out.println("c3:"+c3);//[c++, android, php]
        /*
          boolean containsAll(Collection c)
          判断当前集合中是否包含参数集合中的所有元素
         */
        boolean contains = c1.containsAll(c3); //判断c1中是否包含c3中所有元素
        System.out.println("是否包含所有?"+contains);

        //取交集，仅保留c1与c3的公有元素
        //c1.retainAll(c3);
        //System.out.println("c1:"+c1);
        //System.out.println("c3:"+c3);

        //删交集，将c1中与c3的公有元素删除，c3不变
        c1.removeAll(c3);
        System.out.println("c1:"+c1);//[java, .net, ios, java]
        System.out.println("c3:"+c3);//[c++, android, php]
    }
}
