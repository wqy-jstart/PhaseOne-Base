package apiDay02;

/**
 *Object的演示
 */
public class ObjectDemo {
    public static void main(String[] args) {
        /*
          调用Object类的equals()，内部还是在使用==比较地址
          若相比较对象的属性值是否相同，我们认为Object的equals()并不能满足需求
          因此常常需要重写equals()
         */
        Point p1 = new Point(100,200);
        Point p2 = new Point(100,200);
        System.out.println(p1);
        //因为Point类重写了toString()方法，故输出值
        System.out.println(p1.toString());
        System.out.println(p1==p2); //false，==比较的是地址
        //因为Point类重写了equals()，所以此处调用的是重写之后equals(),比较的是属性值是否相同
        System.out.println(p1.equals(p2)); //true

        /*
          输出引用时会默认调用Object类的toString()方法
          该方法返回的字符串格式为：类的全称@地址
          但通常这个返回结果对我们的开发是没有意义的
          我们真正想输出的应该是对象的属性值，我们认为Object类的toString()并不能满足
          因此我们通常需要重写toString()方法来返回具体的属性值
         */
        Point p = new Point(100,200);
        System.out.println(p); //输出引用时会默认调用Object类的toString()方法
        //重写前apiDay02.Point@1b6d3586地址，重写后为具体的属性值
        System.out.println(p.toString());
        System.out.println("======================================================");

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1);
        //String类已经重写了toString()方法来比较内容(属性值)是否相同
        System.out.println(s1.toString());
        //String类已经重写了equals()来比较内容(属性值)是否相同
        System.out.println(s1.equals(s2));//true

        StringBuilder builder1 = new StringBuilder("hello");
        StringBuilder builder2 = new StringBuilder("hello");
        System.out.println(builder1);
        //StringBuilder类中重写了toString()的方法
        System.out.println(builder1.toString());
//StringBuilder类没有重写equals(),因此调用的还是Object类的equals(),比较的还是地址
        System.out.println(builder1.equals(builder2));//false
        //s1与builder1的类型不同，所以equals()一定为false
        System.out.println(s1.equals(builder1));//引用类型不同，false
    }
}
