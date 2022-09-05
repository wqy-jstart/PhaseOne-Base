package 对象和类;

public class ThisDemo01 {
    public String name;//公开修饰并声明成员变量
    public int age;

    public ThisDemo01(String name){//方法名与类名相同为构造方法，定义两个局部变量
        this.name=name;//将局部变量(形式参数)赋值给成员变量
        age=3;
    }
    public void say(){//没有返回值的方法，非静态变量，需创建对象来使用此方法
        System.out.println("网站的名字是："+name+"，已经成立了："+age+"年");
    }

    public static void main(String[] args) {
        //调用构造方法并且传递实际参数给name(局部变量)=this.name(成员变量)
        ThisDemo01 thisDemo01=new ThisDemo01("www.uxnd.com");
        thisDemo01.say();
    }
}
