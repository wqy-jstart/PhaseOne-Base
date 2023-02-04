package 异常.Exception.RuntimeException;

/**
 * 非检查异常----类型转换异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class ClassCastException {
    public static void main(String[] args) {
        Parent parent = new Son(); // 先将Son造型称Parent
        Daughter d = (Daughter) parent; // 再讲造型后的引用转换为Daughter
        System.out.println(d);
    }
}

class Parent{}

class Son extends Parent{}

class Daughter extends Parent{}
