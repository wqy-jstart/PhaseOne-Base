package 异常.Exception.CheckedException;

/**
 * 检查异常----类找不到的异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class ClassNotFoundException {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String1");
        } catch (java.lang.ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("出现了类找不到的异常!");
        }
    }
}
