package 枚举类型;
//枚举类型用enum来修饰
/*
Java 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割。
 */
//枚举类型用enum来修饰
public class ColorDemo {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        Color c2 = Color.BLUE;
        System.out.println(c2);
        Color c3 = Color.GREEN;
        System.out.println(c3);
    }
}
enum Color
{
    RED, GREEN, BLUE;
}
