package 对象和类;

public class Dog {//创建一个Dog的类
    String name;//声明成员变量name
    int age;//声明成员变量age
    public Dog(String name,int age){//构造方法
//用this关键字引用调用成员方法，括号内为形参，作用域为整个方法体，是局部变量
        this.name=name;//利用对象传参给name和age再赋值给成员变量
        this.age=age;
    }
    public void bark(){//创建成员方法bark
        System.out.println("汪汪，不要过来");
    }
    public void hungry(){//创建成员方法hungry
        System.out.println("主人，我饿了");
    }

    public static void main(String[] args) {//使用main方法，程序的入口
        Dog d=new Dog("卡拉",3);//创建对象，并为对象的属性赋值
        //d.name="卡拉";//通过对象直接访问成员变量name并赋值为卡拉
        //d.age=3;//通过对象直接访问成员变量age并赋值为3
        System.out.println("名字为："+d.name+";年龄为："+d.age);
        d.bark();//通过对象直接访问成员方法bark
        d.hungry();//通过对象直接访问成员方法hungry
    }
}
