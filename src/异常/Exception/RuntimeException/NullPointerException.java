package 异常.Exception.RuntimeException;

/**
 * 非检查异常----空指针异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class NullPointerException {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.isEmpty());
    }
}
