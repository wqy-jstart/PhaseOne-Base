package apiDay04;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了获取子集的操作：
 * List subList(int start,int end): 含头不含尾
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//该集合只能装Integer类型
        for (int i = 0; i < 10; i++) {
            list.add(i*10); //自动装箱
        }
        System.out.println(list);//[0, 10, 20, 30, 40, 50, 60, 70, 80, 90]

        //获取下标3到7的子集
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);//[30, 40, 50, 60, 70]

        for (int i = 0; i < subList.size(); i++) {
            subList.set(i,subList.get(i)*10);
        }
        System.out.println(subList);//[300, 400, 500, 600, 700]

        //注意：对子集的操作就是对原集合对应元素操作
        System.out.println(list);//[0, 10, 20, 300, 400, 500, 600, 700, 80, 90]

        list.remove(0);
        System.out.println(list);
//一旦做了子集，则原集合不能做修改，否则与子集元素不对应会报错，但可以重新获取子集
        //System.out.println(subList);//发生不支持操作的编译异常

    }
}
