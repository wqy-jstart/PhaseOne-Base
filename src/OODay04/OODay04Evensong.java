package OODay04;
//重写特殊演示
/*2.重写需遵循"两同两小一大"原则：-------------了解即可
    1）两同：
       1.1）方法名相同
       1.2）参数列表相同
    2）两小：
       2.1）派生类方法的返回值类型小于或等于超类方法的------演示见最下面
           (1)void和基本类型时，必须相同
           (2)引用类型时，小于或等于
       2.2）派生类方法抛出的异常小于或等于超类方法的-----------API时讲
    3）一大：
       3.1）派生类方法的访问权限大于或等于超类方法的
 */
public class OODay04Evensong {
    public static void main(String[] args) {
        Hoo o1 = new Hoo();
        o1.show();
        double a=o1.test();
        System.out.println(a);
        Woo b = o1.say();
        System.out.println(b);
        Woo c = o1.sayHi();
        System.out.println(c);
    }
}
//两小---------遵循超类大，派生类小
//重写时父子类返回值类型：1）void(空)  2）基本类型(八种)  3）引用类型(父子类)
class Koo{
    void show(){}//引用类型为void
    double test(){return 0.0;}//引用类型为基本数据类型
    Woo say(){return null;}//引用类型为子类
    Qoo sayHi(){return null;}//引用类型为父类
}
class Hoo extends Koo {//--------------子类/派生类
    //int show(){return 1;}//编译错误，相同方法名下返回值类型为void时父子必须相同
    //int test(){return 1;}//编译错误，基本类型时，返回值类型也必须相同
    //Qoo say(){return null;}//编译错误，引用类型时必须小于或等于,此法用的是父类引用类型
    Woo say(){return null;}//编译正确，此法引用的子类引用类型，等于
    Woo sayHi(){return null;}//编译正确，此法引用的子类引用类型，小于
}

class Qoo{//----------------超类(大)
}
class Woo extends Qoo {//----------------子类(小)
}

