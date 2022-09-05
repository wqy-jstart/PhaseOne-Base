package apiDay03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *泛型的演示
 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();//将集合所规定的泛型设为String类型
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);
        //c.add(123);//编译错误，参数类型违背了集合c所指定的泛型E的实际类型String
        //1)迭代器所指定的泛型应当与其遍历的集合的泛型一致
        Iterator<String> it = c.iterator();//获取迭代器
        while (it.hasNext()){ //当有下一个元素时
            String str = it.next();//指定泛型后，获取元素不需再强转
            System.out.println(str);//输出
        }
        System.out.println("===========================================");
        //2)新循环遍历集合---会被编译器改回迭代器遍历
        for (String str : c){//集合类型已设为String类型，输出不需要强转
            System.out.println(str);
        }
    }
}
