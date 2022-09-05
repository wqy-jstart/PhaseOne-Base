package apiDay04;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 */
public class ListDemo3 {
    public static void main(String[] args) {
        //数组没有重写toString()方法,故需调用Arrays类中的toString()方法来输出
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));

        //将数组转化为集合，存储了数组的引用，指向了同一个对象
        List<String> list = Arrays.asList(array);
        System.out.println("list:"+list);

        //修改数组，会影响集合
        array[2] = "six";
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("list:"+list);

        //修改集合，同样会影响数组
        list.set(3,"seven");
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("list:"+list);
    }
}
