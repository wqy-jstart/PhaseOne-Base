package OODay04;
//静态变量和静态方法在调用时的演示
/* 1)静态变量：
        1.1)◾由static修饰
        1.2)◾属于类，存储在方法区中，只有一份
        1.3)◾常常通过类名点来访问
        1.4)◾何时用：所有对象所共享的数据(图片、音频、视频等)
2)◦静态方法：
        2.1)◾由static修饰
        2.2)◾属于类，存储在方法区中，只有一份
        2.3)◾常常通过类名点来访问
        2.4)◾静态方法没有隐式this传递(可能通过类来打点访问，但不通过对象，
            因此this不能指向合适的对象)所以不能直接访问实例成员
        2.5)◾何时用：方法的操作与对象无关
3)◦静态块:
        3.1)由static修饰
        3.2)属于类，在类被加载期间自动执行，因类只被加载一次，所以静态块也只执行一次
        3.3)何时用:加载/初始化静态资源(图片、音频、视频等)
 */
public class Static {
    public static void main(String[] args) {
//由于Boo的属性和方法都由静态static关键字修饰，故不需创建对象，直接类名点
        Boo.name="武清源";
        Boo.age=19;
        Boo.say();
        Boo.address="宁波";
        Boo.show();
    }
}
class Boo{//---------类的访问权限只能是public或默认
    //静态变量
    static String name;
    static int age;
    static String address;
    static String interesting;
    //静态块
    static {//----------静态块，给静态变量初始化(类似于实例变量中用构造方法进行初始化)
        address="宁波";
        interesting="打篮球";
    }
    //静态方法
    static void say(){
        System.out.println("我的名字是："+name+",今年"+age+"岁了！");
    }
    static void show(){
        System.out.println("地址是："+address+",比较喜欢"+interesting);
    }
}
