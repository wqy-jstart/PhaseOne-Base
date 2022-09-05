package apiDay01;
//5)
/**
 * boolean startsWith(String s):
 * 判断当前字符串是否是以给定的字符串开始的
 * boolean endsWith(String s);
 * 判断当前字符是否是以给定的字符串(s)结束的
 */
public class StarsWithDemo {
    public static void main(String[] args) {
        String str = "thinking in java"; //java编程思想(经典书)
        boolean starts =str.startsWith("think"); //判断str是否以think开头的
        System.out.println(starts); //true

        boolean ends = str.endsWith(".png");  //判断str是否以.png结尾的
        System.out.println(ends); //false
    }
}
