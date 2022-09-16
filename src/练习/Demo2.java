package 练习;
//测试创建对象时调用构造方法的规律
class A{
    static {
        System.out.println("A");
    }
    A(){
        System.out.println("a");
    }
}
class B extends A{
    static {
        System.out.println("B");
    }
    B(){
        System.out.println("b");
    }
}

public class Demo2 {
    public static void main(String[] args) {
//        A a = new A();//Aa
//        A a = new B();//ABab
        B b = new B();//ABab
    }
}
