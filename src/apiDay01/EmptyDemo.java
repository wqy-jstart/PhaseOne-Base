package apiDay01;

/**
 * 判断是否为空的方法boolean isEmpty()
 */
public class EmptyDemo {
    public static void main(String[] args) {
        String a = "Hello Java!";
        boolean b = a.isEmpty();
        System.out.println(b);//false
        String c = "";//空串
        boolean d = c.isEmpty();
        System.out.println(d);//true
        String e = " ";//空格
        boolean f = e.isEmpty();
        System.out.println(f);//false
    }
}
