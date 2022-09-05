package apiDay03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 将数组转换为集合
 * 数组的工具类java.util.Arrays提供了一个静态的方法：asList()
 * 该方法可以将一个数组转化成一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));


//asList()方法会返回Arrays定义的内部类ArrayList,该集合内部直接引用给定数组array
        List<String> list = Arrays.asList(array);
        System.out.println("list:"+list);

        //对数组操作后，集合也会做相应的改变
        array[1] = "six";
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("list:"+list);
        //添加或删除元素相当于要往数组中加或删内容，数组是定长的，
        //因此会发生不支持操作的异常
        //list.add("!!!!!"); //运行时发生不支持操作的异常

        //如果我们需要增删元素，可另行创建一个集合同时包含list集合的元素即可
        List<String> list2 = new ArrayList<>(list);  //等同于先new再addAll()
        System.out.println("list2:"+list2);
        list2.add("!!!!!");
        System.out.println("list2:"+list2);
    }
}
