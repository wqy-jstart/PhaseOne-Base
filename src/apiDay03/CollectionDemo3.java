package apiDay03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合中存放的是元素的引用
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Point p = new Point(1,2);
        c.add(p);//将p添加到集合c中
        System.out.println("p:"+p);//(1,2)
        System.out.println("c:"+c);//[(1,2)]

        p.setX(100);
        System.out.println("p:"+p); //(100,2)
        System.out.println("c:"+c); //[(100,2)]
    }
}
