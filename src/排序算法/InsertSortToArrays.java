package 排序算法;

import java.util.Arrays;

/**
 * 插入排序
 * 算法原理：
 * <span>
 * 将一组元素分为排序部分和未排序部分,
 * 将未排序部分的第一个元素与排序部分进行两两比较最终实现插入到指定位置,
 * 依次循环最终以某种顺序进行排列
 * </span>
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.1.31
 */
public class InsertSortToArrays {
    public static void main(String[] args) {
        int[] arr = {60, 40, 70, 20, 50, 80};
        for (int i = 1; i < arr.length; i++) {
            // j表示插入元素的实时下标
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {// 实时下标要大于零且小于前面的数才会递减
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
        // [20, 40, 50, 60, 70, 80]
    }
}
