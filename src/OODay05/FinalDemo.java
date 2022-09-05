package OODay05;
//final的演示
public class FinalDemo {
}

//演示final修饰类
final class Doo{}
//class Eoo extends Doo{}//编译错误，final的类不能被继承
class Foo{}
final class Goo extends Foo{}//编译正确，final可以修饰子类去继承别人

//演示final修饰方法
class Boo{
    void show(){}
    final void test(){}
}
class Coo extends Boo{
    void show(){}
    //void test(){}//编译错误，final的方法不能被重写
}

//演示final修饰变量
class Aoo{
    final int a=5;
    void show(){
        //a=55;//编译错误，final的变量不能被改变
    }
}