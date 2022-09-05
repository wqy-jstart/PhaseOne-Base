package apiDay01;
//4)
//String的演示
public class StringDemo {
    public static void main(String[] args) {
        String s = new String("hello"); //创建了2个对象
        /*
        创建了两个对象
         */
        String s1 ="hello"; //复用常量池中的字面量对象
        System.out.println(s1.length());//输出字符串s1的长度用length()方法
        System.out.println("s:"+s);
        System.out.println("s1:"+s1);
        System.out.println(s==s1); //false，==比较的是地址是否相同

        //在实际应用中，String比较相等一般都是比较字符串内容是否相等
//因此我们需要使用equals()方法来比较两个字符串的内容是否相同，因为String类中重写了equals()方法
        System.out.println(s.equals(s1)); //true，equals()比较的是内容是否相同
    }
}
