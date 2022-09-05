package 方法重载;
//同一个类中的多个方法可以有相同的名字，但参数列表(类型，顺序，个数)不同，即方法重载
//重载是面向对象的一个基本特性---------方便用户的调用
public class Overload {
    //一个普通的方法，不带参数
    //没有返回值、修饰符、非静态变量，需创建方法来调用
    void test(){//省略修饰符，即默认
        System.out.println("No parameters");
    }
    //重载上面的方法，并且带了一个整型参数
    void test(String name){
        System.out.println("姓名:"+name);//此方法的作用是自定义name输出姓名
    }
    //重载上面的方法，并且带了两个整型参数
    void test(int a,int b){
        System.out.println("a and b:"+a+" "+b);//此方法的作用是自定义参数，输出两个参数
    }
    //重载上面的方法，并且带了一个双精度参数
    double test(double a){
        System.out.println("aouble a:"+a);//此方法的作用是自定义浮点型变量，输出该变量
        return a;
    }

    public static void main(String[] args) {//main方法
        Overload overload =new Overload();//创建对象，实例化Overload
        //没有返回值，有参传参
        overload.test();//通过对象直接访问方法输出相应内容
        overload.test("武清源");//通过对象直接访问方法并给相应变量在符合其数据类型的条件下赋值
        overload.test(2,3);//通过对象直接访问方法并给相应多个变量在符合其数据类型的条件下赋值
        double b=2.5;
        double c=overload.test(b);
        System.out.println(c);
        overload.test(2.0);//通过对象直接访问方法并给相应double型变量赋值
    }
}
