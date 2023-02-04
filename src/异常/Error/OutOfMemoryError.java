package 异常.Error;

import java.util.Arrays;

/**
 * 演示堆内存异常
 * 思路：
 * 创建大对象
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class OutOfMemoryError {

    public static void main(String[] args) {
        int[] arr = new int[1000000000];// 10亿大小的数组对象
        System.out.println(arr);
    }
}
