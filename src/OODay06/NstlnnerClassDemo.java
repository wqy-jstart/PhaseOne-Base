package OODay06;
//匿名内部类的演示应用率高-----------------大大简化代码
//◦若想创建一个类(派生类)的对象，并且对象只创建一个，此时该类不必命名，称为匿名内部类
//◦匿名内部类中不能修改外面变量的值，因为在此处该变量默认为final(最终的)
//◦利用匿名内部类给抽象类创建派生类，(派生类的身份，没有名字)
public class NstlnnerClassDemo {
    public static void main(String[] args) {
        //1)创建了Aoo的一个派生类，但是没有名字
        //2)为该派生类创建了一个对象，名为o1
        //3)大括号中的为派生类的类体
        Aoo o1 = new Aoo() {//为Aoo的派生类创建一个对象名为o1
            void say(){//-------重写
                System.out.println("名字是"+name+",年龄为"+age);
            }
        };
        o1.say();//用对象名调用重写超类后的方法
        //1)创建了Aoo的一个派生类，但是没有名字
        //2)为该派生类创建了一个对象，名为o2
        //3)大括号中的为派生类的类体
        Aoo o2 = new Aoo(){
            void say(){
                System.out.println("名字是"+name+",年龄为"+age+",喜欢"+like);
            }
        };
        o2.like="打篮球";//利用对象名给继承超类的like属性赋值
        o2.say();//用对象名调用重写超类后的方法

        int num=5;
        //1)创建了Boo的一个派生类，但是没有名字
        //2)为该派生类创建了一个对象，名为o3
        //3)大括号中的为派生类的类体
        Boo o3 = new Boo(){//利用匿名内部类创建一个Boo的派生类名为o3
            void show(){//在类体内重写超类方法
                System.out.println("showshow");
                //num = 66; //编译错误，匿名内部类中不能修饰外面变量的值，因为在此处默认为final的
            }
        };
        o3.show();
    }
}
abstract class Boo{//抽象类中方法不完整，不能new对象
    abstract void show();//该方法被重写
}
abstract class Aoo{
    String name="wqy";
    int age=19;
    String like;
    abstract void say();
}