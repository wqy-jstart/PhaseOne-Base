package 枚举类型;

/**
 * 枚举类型的方法：
 * values(), ordinal() 和 valueOf() 方法
 */
enum Color3{
    RED,GREEN,BLACK,BLUE
}
public class EnumDemo5 {
    public static void main(String[] args) {
        //调用values()-----返回一个枚举数组
        Color3[] arr = Color3.values();

        //迭代枚举数组arr
        //调用ordinal()方法查看索引返回一个int值
        for (Color3 col : arr) {
            //查看索引
            System.out.println(col + " At Index: " + col.ordinal());
        }

        //使用valueOf() 返回枚举常量,不存在的报异常IllegalArgumentException不合法参数异常
        System.out.println(Color3.valueOf("RED"));
    }
}
