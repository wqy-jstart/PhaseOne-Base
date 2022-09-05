package Day03;

public class OperDemo{
    public static void main(String[] args) {
        /*
         1.算数运算符：+，-，*，/，%，++，--
         (1)%：取模/取余，余数为零即为整除
         (2)++/--：自增1/自减1，可在变量前也可在变量后
           (2.1)单独使用时，在前在后都一样(都自增或自减)
           (2.2)被使用时，在前在后不一样
               a++的值为a--------（a--的值为a）
               ++a的值为a+1-------（--a的值为a-1）
         */
        /*（++型）
        int a=5,b=5;
        int c=a++;//1）保存a++的值5  2）a自增1变为6  3)将第一步保存的值5赋值给c--底层运算过程
                       //粗暴计法：a++的值为5，c就是5
        int d=++b;//1）保存++b的值6  2）b自增1变为6  3)将第一步保存的值6赋值给d--底层运算过程
                       //粗暴计法：++b的值为6，d就是6
        System.out.println(a);//6,相当于单独使用时a++的值
        System.out.println(b);//6,相当于单独使用时++b的值
        System.out.println(c);//5,相当于被使用时a++的值
        System.out.println(d);//6,相当于被使用时++b的值
        */

        /*（--型)
        int a=5,b=5;
        int c=a--;//1)保存a--的值5  2）a自减1变为4  3)将第一步保存的值5赋值给c--底层运算过程
        int d=--b;//1）保存--b的值4  2）b自减1变为4  3)将第一步保存的值4赋值给d--底层运算过程
        System.out.println(a);//4
        System.out.println(b);//4
        System.out.println(c);//5
        System.out.println(d);//4
        */


        /*（%型）
        System.out.println(8%2);//取余。商4余0--整除
        System.out.println(5%2);
        System.out.println(2%8);
        */


        /*
        2.关系运算符:(利用boolean进行判断）
        <, <=, >, >=, +, -, !=, ==, ++, --。

        int a=5,b=10,c=5;
        boolean b1 = a>b;
        System.out.println(b1);//false
        System.out.println(c<b);//true
        System.out.println(a>=c);//true
        System.out.println(a==c);//true
        System.out.println(a!=c);//false
        System.out.println(a>=b);//false
        System.out.println(a+c>b);//false
        System.out.println(a%2==0);//false
        int d =c++;//1）保存c++的值5  2）c自增1，初始值变为6  3）将第一步保存的值赋值给d得5
        int e =++c;//1)保存++C的值7  2)c自增1，初始值变为7  3）将第一步保存的值赋值给e得7
        int f =c++;//1）保存c++的值7  2）c自增1，初始值变为8  3）将第一步保存的值赋值给f得7
        int g =++c;//1）保存++c的值9  2）c自增1，初始值变为9  3）将第一步保存的值赋值给g得9
        int h =c++;//1）保存c++的值9  2）c自增1，初始值变为10  3）将第一步保存的值赋值给h得9
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(c++>5);//true------被使用时c++为10
        System.out.println(++c>5);//true-------被使用时++c为11
        */

        /*
        3.逻辑运算符：
          1）&&:逻辑与(并且）
             ||：逻辑或（
             ！：逻辑非。
          2）逻辑运算是建立在关系运算的基础之上的。
         */
        /*
        // &&的演示
        int a=5,b=10,c=5;
        boolean b1 = b>=a && b<c;
        System.out.println(b1);         //true&&false=false
        System.out.println(b<=c && b>a);//false&&true=false
        System.out.println(a==b && c>b);//false&&false=false
        System.out.println(b!=c && a<b);//true&&true=true
        System.out.println(c!=b && a==b);//true&&false=false
        System.out.println(a+c!=b && b*2>a+c);//false&&true=false
        int age =25;//声明一个年龄整型变量，并赋值为25
        System.out.println(age>=18 &&age<=50); //看age是否在18到50之间

        //||的演示
        System.out.println(b>=a || b<c);//true||false=true
        System.out.println(b<=c || b>a);//false||true=true
        System.out.println(b!=c || a<b);//true||true=true
        System.out.println(a==b || c>b);//false||false=false
        int score = 89;
        System.out.println(score<0 || score>100);//看score是否不合法

        //!的演示
        boolean b2 = !(a<b);//a<b结果的否定
        System.out.println(b2);     //!true=false
        System.out.println(!(a>b)); //!false=true

        //短路的演示
        System.out.println(c++);//结果为5（被使用取保存的值,初始值自增变为6）
        boolean b3 = a>b && c++>2;//位置调换不会短路两个都执行了
        System.out.println(b3); //false c++不走了系统见false则false
        System.out.println(c);  //6，发生短路了上一个c++没有执行
        System.out.println(c++);//被使用取保存的值6，初始值自增变为7

        boolean b4 = a<b || c++>2;
        System.out.println(b4); //true第一个为true，系统见true则true不走后面c++
        System.out.println(c);  //7，发生短路了，上一个c++没有执行
        // 单|或单&不会短路
        */


        /*
        4.赋值：=，+=，-=，*=，/=，%=
          简单赋值运算符：=
          扩展赋值运算符：+=，-=，*=，/=，%=
          扩展赋值自带强转功能
        */

        /*
        int a = 5;
        a += 10; //相当于a=(int)(a+10)
        System.out.println(a); //15
        a *= 2; //相当于a=(int)(a*2)
        System.out.println(a); //30
        a /= 6; //相当于a=(int)(a/6)
        System.out.println(a); //5
        */


        //小面试题:
        short s = 5;
        //s = s+10; //编译错误，需强转: s=(short)(s+10);
        s += 10; //相当于s=(short)(s+10)
        System.out.println(s);//结果为15

        /*
        5.字符串连接：+
        ◾+：
        ◾ 若两边为数字，则做加法运算
        ◾若两边出现了字符串，则做字符串连接
        ◾任何类型与字符串相连，结果都会变为字符串类型----同化作用

        //字符串拼接演示
        int age = 18;
        System.out.println("age="); //age=
        System.out.println(age);    //18
        System.out.println("age="+age); //age=18
        System.out.println("我的年龄是"+age); //我的年龄是18
        System.out.println("我今年"+age+"岁了"); //我今年18岁了


        String name = "武清源";
        System.out.println("name="+name); //name=武清源
        System.out.println("大家好，我叫"+name); //大家好，我叫武清源
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了"); //大家好，我叫武清源，今年18岁了

        //同化作用演示
        System.out.println(10+20+30+""); //60---------String
        System.out.println(10+20+""+30); //3030-------String
        System.out.println(""+10+20+30); //102030-----String
        */


        /*
        6.条件/三目(操作三个数)：?:
        ◾语法：
        boolean?数1:数2
        ◾执行过程：
        注：整个表达式是有值的，它的值要么是(?号后的数1)，要么是(:号后的数2)
        ◾计算boolean的值：
        ◾若为true，则整个表达式的值为?号后的数1
        ◾若为false，则整个表达式的值为:号后的数2
        */

        int num = 5;
        int flag = num>0?1:-1;
        System.out.println(flag); //1

        int a=8,b=55;
        int max = a>b?a:b;
        System.out.println("max="+max); //55
        

























































    }
}

