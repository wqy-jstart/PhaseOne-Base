package 异常.Error;

/**
 * 演示栈内存异常
 * 思路：
 * 递归太深
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class StackOverflowError {
    public static void main(String[] args) {
        f(10);
    }

    private static long f(long n) {
        return f(n) - f(n - 1);
    }
}
