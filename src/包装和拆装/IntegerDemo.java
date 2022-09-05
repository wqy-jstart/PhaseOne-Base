package 包装和拆装;
//实例化一个包装类
public class IntegerDemo {
    public static void main(String[] args) {
        int m=500;//声明一个整型变量m，并赋值为500
        Integer obj=new Integer(m);//int——>Integer包装，通过Integer类的构造方法将int装箱
        System.out.println("obj="+obj);
        int n=obj.intValue();//通过Integer类的value()方法将Integer拆箱
        System.out.println("n"+n);

        Integer obj1=new Integer(500);
        System.out.println("obj等价于obj？"+obj.equals(obj1));
    }
}
