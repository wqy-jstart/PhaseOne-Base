package apiDay04;

import java.util.ArrayList;//该类实现了List接口
import java.util.Collections;//导入集合的工具类Collections
import java.util.Comparator;
import java.util.List;//导入List的接口，该接口继承了Collection接口

/**
 * 排序自定义类型
 * Collections.sort(list, new Comparator<Point>() {}
 *<Point>该泛型应该与new对象时的匹配
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        //利用List接口类型引用list指向一个ArrayList对象
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,24));
        list.add(new Point(15,38));
        list.add(new Point(25,4));
        list.add(new Point(57,37));
        list.add(new Point(1,65));
        list.add(new Point(99,88));
   /*
     Collection.sort(List list)
     该方法要求List集合中的元素必须是可比较的，若不可比较则直接发生编译错误，不允许排序
     判定是否可比较的标准为元素是否实现了java.util.Comparable接口
   */
        //★利用此方法根据属性自定义进行排序时泛型要匹配
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                //return o1.getX()-o2.getX();//按x坐标升序排列
                //return o2.getY()-o1.getY();//按y坐标降序排列
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return len1-len2; //按到原点的距离升序排列
                //return len2-len1; //按到原点的距离降序排列
            }
        });
        System.out.println(list);

        //jdk1.8,List集合接口自身提供了sort方法进行排序,sort方法依然需要传入比较器
        list.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return len1-len2; //按到原点的距离升序排列
                //return len2-len1; //按到原点的距离降序排列
            }
        });
        System.out.println(list);
    }
}
