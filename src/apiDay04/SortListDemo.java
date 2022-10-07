package apiDay04;
//导入可以动态修改数组的类ArrayList，提供添加,修改,删除,遍历功能。
import java.util.ArrayList;//该类实现了List接口
import java.util.Collections;//导入集合的工具类Collections
import java.util.List;//导入List的接口，该接口继承了Collection接口
import java.util.Random;//导入随机数的类

/**
 * List集合的排序
 */
public class SortListDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        /**
         * 1)整数排序
         */
        List<Integer> list = new ArrayList<>();
        //因为是对集合，故for循环中长度要固定，不能i<list.size();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println("list原始数据："+list);

        Collections.sort(list);//自然排序(从小到大)
        System.out.println("list排序后的数据："+list);

        Collections.reverse(list); //反转list集合(数据已经变化了)
        System.out.println("list反转后："+list);

        Collections.shuffle(list);//乱序排列
        System.out.println("List乱序后的数据: "+list);
    }
}
