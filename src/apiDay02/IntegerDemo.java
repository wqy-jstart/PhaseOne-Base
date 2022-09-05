package apiDay02;

/**
 * 包装类型的演示
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //1)利用包装类来获取基本数据类型的极限值
        int MAX1 = Integer.MAX_VALUE; //获取int的最大值
        int MIN1 = Integer.MIN_VALUE; //获取int的最小值
        System.out.println("int类型的最大值为："+MAX1+",最小值为："+MIN1);
        long MAX2 = Long.MAX_VALUE; //获取long的最大值
        long MIN2 = Long.MIN_VALUE; //获取long的最小值
        System.out.println("long类型的最大值为："+MAX2+",最小值为："+MIN2);

        //2)包装类可以将字符串类型转换为对象的基本类型
        String s1 = "19";//-------字符串类型的19
        int age = Integer.parseInt(s1); //字符串类型s1——>int型age
        System.out.println(age); //19---int类型
        String s2 = "123.456";//--------字符串类型的123.456
        double price = Double.parseDouble(s2); //字符串类型s2——>double型price
        System.out.println(price); //123.456---double类型
        System.out.println("===========================================================");

        //3)触发自动装箱特性，会编译为：Integer i = Integer.valueOf(5);
        Integer i =5; //基本类型到包装类型---装箱
        //触发自动拆箱特性，会被编译为：int j = i.intValue();
        int j = i;//包装类型到基本类型------拆箱
        System.out.println(j);

        //4)手动装箱和拆箱
        Integer i1 = new Integer(5);//基本类型到包装类型---装箱
        Integer i2 = new Integer(5);
        int i5 = i1.intValue(); //包装类型到基本类型------拆箱
        System.out.println(i5); //输出拆箱后的值
        System.out.println(i1==i2); //false ==比较的是地址
        //包装类中重写了equals(),比较属性值相同,结果为true
        System.out.println(i1.equals(i2)); //true

        //Integer.valueOf()会复用-128到127一个字节范围内的数据-----使用valueOf()更多一些
        Integer i3 = Integer.valueOf(5);
        Integer i4 = Integer.valueOf(5);
        System.out.println(i3==i4); //true 若大于范围内则比较对象地址
        System.out.println(i3.equals(i4)); //true 比较内容相同
    }
}
