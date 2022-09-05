package OODay04;
//子类继承超类，new派生类类对象。
//静态块属于类，在类被加载期间自动执行，一个类只被加载一次，所以静态块也只执行一次
//1）超类静态块     2）派生类静态块
//3）超类语句块和构造方法    4）派生类语句块和构造方法
public class EntendsTest {
    public static void main(String[] args) {
        Poo o1 = new Poo();
        System.out.println("=========================");
        Joo o2 = new Joo();
        System.out.println("==========================");
        Poo o3 = new Poo();
    }
}
class Joo{//-----------------超类
    static {
        System.out.println("超类静态块");
    }
    {
        System.out.println("超类语句块");
    }
    Joo(){
        System.out.println("超类构造方法");
    }
}
class Poo extends Joo{//---------------
    static {
        System.out.println("派生类静态块");
    }
    {
        System.out.println("派生类语句块");
    }
    Poo(){
        System.out.println("派生类构造方法");
    }
}
