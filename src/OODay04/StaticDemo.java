package OODay04;

public class StaticDemo {
    public static void main(String[] args) {
        Aoo a = new Aoo();//静态块在new第一次对象时只执行一次
        System.out.println("=======================================");
        Aoo b = new Aoo();//不走静态块，走语句块和构造方法
    }
}

class Aoo{
    static {//加载类时被执行
        System.out.println("静态块");
    }
    {//new对象时执行
        System.out.println("语句块");
    }
    Aoo(){//new对象之后执行
        System.out.println("构造方法");
    }
}










