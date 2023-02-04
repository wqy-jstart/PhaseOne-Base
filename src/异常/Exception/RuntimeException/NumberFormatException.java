package 异常.Exception.RuntimeException;

/**
 * 非检查异常----数字格式化异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class NumberFormatException {
    public static void main(String[] args) {
        String str = "1a";
        System.out.println(Integer.parseInt(str));
    }
}
