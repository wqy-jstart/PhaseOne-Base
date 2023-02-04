package 递归;

/**
 * 斐波那契数列的递归场景
 * 公式: f(n) = f(n-1) + f(n-2)
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class FeiBoNaQi {
    // 测试循环
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            System.out.println("(" + n + ")：" + f(n));
        }
    }

    // 逻辑方法
    private static long f(int n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return f(n - 1) + f(n - 2);
    }

    /*
     n=1 -->  f(n) = 1;
     n=2 -->  f(n) = f(1) + f(0) = 1;
     n=3 -->  f(n) = f(2) + f(1) = 2;
     n=4 -->  f(n) = f(3) + f(2) = 3;
     ...
     */
}
