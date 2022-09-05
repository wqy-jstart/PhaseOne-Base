package OODay01;
//学生测试类
//八种基本数据类型----------体现不出属性和方法
//数组-----------引用数据类型
//类------------引用数据类型
//一个类可以存在多个对象
//同一个包中的类可以直接访问
public class StudentTest {
    public static void main(String[] args) {
        //创建一个学生对象
        //引用类型变量可以实现一个类中的属性和方法，可由不同变量的对象使用
        //
        //数据类型  引用数据类型  指向     对象
        Student      zs        =  new Student();//声明一个Student类型的引用zs，指向了一个学生对象
        //访问成员变量
        zs.name="张三";
        zs.age=34;
        zs.address="宁波";
        zs.interesting="打篮球";
        //调用方法
        zs.study();
        zs.say();
        zs.sayHi();
        zs.sayHello();
        System.out.println("==================================");

        Student ls=new Student();
        ls.name="李四";
        ls.age=35;
        ls.address="黑龙江";
        ls.interesting="玩游戏";
        ls.study();
        ls.say();
        ls.sayHi();
        ls.sayHello();

    }
}
