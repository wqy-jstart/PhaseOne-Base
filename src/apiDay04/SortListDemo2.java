package apiDay04;

import java.util.ArrayList;//该类实现了List接口
import java.util.Collections;//导入集合的工具类Collections
import java.util.Comparator;//
import java.util.List;//导入List的接口，该接口继承了Collection接口

/**
 * 排序字符串
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        /**
         * 3)对中文排序
         */
        List<String> list1 = new ArrayList<>();
        list1.add("王克晶");
        list1.add("传奇");
        list1.add("国斌老师");
        System.out.println("list原始数据："+list1);
        //正常对汉字字符串排序时，会按首字的ASCII码排序，若相同往后推
        Collections.sort(list1);
        System.out.println("按list1集合中元素的首字ASCII码排序后:"+list1);
        /*
          compare()方法用于定义o1和o2比较大小的规则，并用返回值表达大小关系
          返回值实现的要求：
          1)如果返回值>0则表达的是o1>o2
          2)如果返回值<0则表达的是o1<o2
          3)如果返回值=0则表达的是o1=o2
          ★结论：
           1)前面的>后面的----升序
           2)前面的<后面的----降序
           */
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();//按照元素的长度属性进行升序
                //return o2.length()-o1.length();//按照元素的长度属性进行降序
            }
        });
        System.out.println("按list1集合中元素的长度排序后："+list1);
        System.out.println("==================================================================");


        /**
         * 2)英文字符串排序
         */
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("rose");
        list.add("tom");
        list.add("black");
        list.add("jerry");
        list.add("kabe");
        System.out.println("list原始数据："+list);
        //对英文字符串排序时，会按首字母的ASCII码排序
        //若首字母相同，则比较第2个字符的ASCII码，以此类推
        Collections.sort(list);
        System.out.println("按list集合中元素的首字ASCII码排序后："+list);
    }
}
