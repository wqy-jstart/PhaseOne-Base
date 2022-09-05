package OODay03;
//测试类，运行程序
public class UploadDemo {
    public static void main(String[] args) {
        Eoo o1 = new Eoo();//--------超类
        o1.e=1;
        o1.show();
        //o1.f=1;//编译错误，父类对象不能访问子类对象
        //o1.test();//编译错误，无法访问子类

        Foo o2 = new Foo();//---------子类
        o2.f=1;
        o2.test();
        o2.e=1;//正确，派生类可以访问父类
        o2.show();//正确
        //超类引用类型可以new它本身及它子类的对象，但只能调用自己的属性和方法
        //相反，子类可以以自身为引用类型new对象，也可以以超类为引用类型new对象
        //能点出来什么，取决于引用类型------Java规定
        Eoo o3 = new Foo();//一个子类对象Foo是父类Eoo类型
        o3.e=1;
        o3.show();
        //o3.f=2;//编译错误。o3是Eoo类型，所以只能访问Eoo里面的属性和方法
        //o3.test(); //编译错误
    }
}
