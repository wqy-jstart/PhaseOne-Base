package 包装和拆装;
//自动装箱与拆箱
public class Automatic {
    public static void main(String[] args) {
        int m=500;//Integer属于int的包装类携带属性和方法，可以被调用
        Integer obj=m;//自动装箱（与强转类型相似）
        System.out.println("obj="+obj);
        int n=obj;//自动拆箱
        System.out.println("n="+n);

        Integer obj1=500;
        System.out.println("obj 等价于 obj1？"+obj.equals(obj1));
    }
}
