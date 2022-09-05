package apiDay03;
import java.util.ArrayList;
import java.util.Collection;
/**
 * 集合的演示
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection b = new ArrayList();
        /**
         * 1）添加(地址)元素
         */
        //new Point(1,2)是对象,指向它的是地址，故添加的是地址
        b.add(new Point(1,2));
        b.add(new Point(3,4));
        b.add(new Point(5,6));
        b.add(new Point(7,8));
        b.add(new Point(9,0));
        b.add(new Point(1,2));
        /*
          集合重写了Object的toString()方法，格式如下：
          [元素1.toString(),元素2.toString(),元素3.toString()]
         */
        System.out.println(b); //相当于System.out.println(b.toString());
        System.out.println(b.toString()); //调用了重写后的toString()方法

        /**
         * 2）判断b中是否包含p
         */
        Point p = new Point(1,2);
        //判断b中是否包含p，判断依据是p是否与集合元素存在equals为true的情况
        //目前b中输出的是在重写状态下的属性值，p中依然为对象地址,所以equals()下为false
        //Point类中重写了equals()方法,new完对象后比较的为属性值，相同即返回true
        boolean contains = b.contains(p);
        System.out.println("是否包含："+contains); //true

        /**
         * 3）删除boolean remove(Object o)
         */
//从集合中删除与给定元素equals比较为true的元素，若存在重复元素则只删除第一次
        b.remove(p);//判断集合b中是否有与p比较equals()方法为true的元素
        System.out.println(b);

        System.out.println("=============================================================");



        Collection c = new ArrayList();//若没有元素则输出[]
        /**
         * 1)添加(字符串)元素(因在List类中，故元素可重复，若Set类中则不能重复)
         */
        c.add("one");
        c.add("two");
        c.add("tree");
        c.add("four");
        c.add("five");
        System.out.println(c);//[one, two, tree, four, five]
//系统默认有一个toString()方法,集合里重写过toString()方法，故输出的不是地址而是属性值
        System.out.println(c.toString());//[one, two, tree, four, five]

        /**
         * 2)获取集合元素个数
         */
        int size = c.size(); //获取集合元素个数
        System.out.println("size="+size);

        /**
         * 3)判断集合中是否为空集
         */
        boolean isEmpty = c.isEmpty();//判断集合中是否为空集(size为0即为空)
        System.out.println(isEmpty);//若为空则返回true,否则返回false

        /**
         * 4)清空集合
         */
        c.clear();//清空集合
        System.out.println("集合已清空");
        System.out.println(c); //[]
        System.out.println("size="+c.size()); //0
        System.out.println("是否为空集："+c.isEmpty()); //true
    }
}

