package 枚举类型;
//枚举类型用enum来修饰
/*
Java 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割。
 */
enum Color1 {//声明一个枚举类,用关键字enum来修饰
    RED, GREEN, BLUE
}
public class EnumDemo1 {
    public static void main(String[] args) {
        //利用类名打点调用常量,使用类名来接收
        Color1 c1 = Color1.RED;
        System.out.println(c1);
        Color1 c2 = Color1.BLUE;
        System.out.println(c2);
        Color1 c3 = Color1.GREEN;
        System.out.println(c3);
    }
}

