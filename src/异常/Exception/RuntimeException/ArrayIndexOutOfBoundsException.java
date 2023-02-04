package 异常.Exception.RuntimeException;

/**
 * 非检查异常----数组下标越界异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arr[5]);
    }
}
