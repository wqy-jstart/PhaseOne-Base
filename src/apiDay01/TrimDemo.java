package apiDay01;
//2)
/**
 * String trim():
 * 去除两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str ="     hello world    "; //String为不可变
        System.out.println(str);//    hello world
        str = str.trim();  //去除str两边得空白字符，并将去除之后的新的对象存储到str中
        System.out.println(str); //hello world
    }
}
