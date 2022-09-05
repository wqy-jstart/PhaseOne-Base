package OODay09;

public class StringDemo {
    public static void main(String[] args) {
        /*
         *使用☆(字面量/直接量)，创建字符串对象时，JVM会检查常量池中是否又该对象：
         * 1）若没有，则会创建该字符串对象，并将其引用存入常量池中
         * 2）若有，则直接将常量池中的对象(引用)返回--并不会创建新的字符串对象
         */
        String s1 ="123abc"; //常量池还没有，因此创建该字符串对象，并存入常量池中
        String s2 ="123abc"; //常量池中已经有了，因此没反复创建
        String s3 ="123abc"; //常量池中已经有了，因此没反复创建

        //引用类型==，比较的是地址是否相同-----这是规则
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //true
        System.out.println(s2==s3); //true

        s1 = s1 + "!";//非(字面量/直接量)，创建新的字符串对象("123abc!")，地址改变,s1改变
        System.out.println(s1); //123abc!
        System.out.println(s1==s2);//false
        System.out.println("===================================================");

        //编译器在编译时，若发现是两个字面量相连，则会直接连接好并将结果保存起来
        //如下语句相当于：String s4 = "123abc";
        String s4 ="123"+"abc"; //复用常量池中的对象
        System.out.println(s4==s2); //true

        String s5 = "123";
        //因为s5是一个变量，所以在编译期并不会直接编译好
        String s6 = s5+"abc"; //创建一个新的对象存储123abc
        System.out.println(s6==s4); //false
    }
}
