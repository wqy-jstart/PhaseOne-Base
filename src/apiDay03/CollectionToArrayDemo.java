package apiDay03;

import java.util.ArrayList;//List为Collection的子接口
import java.util.Arrays;
import java.util.Collection;//Collection为所有集合的顶级接口

/**
 *集合转换为数组
 * Collection提供了一个方法toArray()，可以将当前集合给转换为数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        //若参数数组元素个数==集合元素个数，那就正常转换
        //若参数数组元素个数>集合元素个数，则正常转换，同时末尾补默认值null
        //若参数数组元素个数<集合元素个数，则会按照集合大小转给数组
        String[] arr = new String[c.size()];
        //toArray()方法中需要传一个数组以供转换
        String[] array = c.toArray(arr);
        //String[] array = c.toArray(new String[c.size()]);也可以
        System.out.println(Arrays.toString(array));

    }
}
