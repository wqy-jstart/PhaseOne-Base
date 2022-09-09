package apiDay03;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * 增强型for循环：新循环
 */
public class NewForDemo {
    public static void main(String[] args) {
        //1）遍历数组---for循环
        String[] array = {"one","two","three","four","five"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================================================");

        //新循环遍历数组---会被编译器改回普通的for循环
        for(String str : array){
            System.out.println(str);
        }
        System.out.println("================================================");

        //2）遍历集合---迭代器
        Collection c = new ArrayList();
        //虽然add中可以加Object类型，但类型要保持一致，
        //否则遍历强转时不同类型会抛出ClassCastException异常
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        Iterator it = c.iterator(); //获取集合c的迭代器
        while (it.hasNext()){ //当有下一个元素的时候
            //因为next()方法的返回值类型为Object，所以需强转为String类型
            String str = (String)it.next(); //获取下一个元素
            System.out.println(str);
        }
        System.out.println("================================================");

        //新循环遍历集合---会被编译器改回迭代器遍历
        for (Object obj : c){
            String str = (String)obj;
            System.out.println(str);
            //System.out.println((String)obj);
        }
    }
}
