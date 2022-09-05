package OODay07;

public class InterfaceDemo {
    public static void main(String[] args) {
        //Inter5 o = new Inter5();//编译错误，接口为不完整的类，无法被实例化
        //接口类型指向实现接口的对象
        Inter5 o1 = new Doo(); //向上造型，接口5含两种方法
        o1.show();
        o1.test();
        Inter4 o2 = new Doo(); //向上造型，接口4仅含一种方法
        o2.show();
    }
}

//1)演示接口的语法
interface Inter{
    public static final int NUM =5;
    public abstract void show();
    int COUNT =5; //默认public static final
    void test(); //默认public abstract
    //int bumber; //编译错误，常量必须声明同时初始化
    //void test(){} //编译错误，抽象方法不能有方法体
}

//2)演示接口的实现
interface Inter1{ //----制定规范
    void show();
    void test();
}
class Aoo implements Inter1{
    public void show(){}//重写接口的抽象方法时，必须加public权限
    public void test(){}//----遵守规范
}

//3)演示接口的多实现
interface Inter2{
    void show();
}
interface Inter3 {
    void test();
}
abstract class Boo{
    abstract void say();
}
//重写超类和各种接口中的方法
class Coo extends Boo implements Inter2,Inter3{
    public void show(){}
    public void test(){}
    @Override
    void say() {}
}

//4)演示接口继承接口
interface Inter4{
    void show();
}
interface Inter5 extends Inter4{
    void test();
}
//接口Inter5继承了接口Inter4，拥有了它的方法，在Doo类实现时需要重写两个方法
class Doo implements Inter5{
    @Override
    public void show() {
        System.out.println(111);
    }
    @Override
    public void test() {
        System.out.println(222);
    }
}
