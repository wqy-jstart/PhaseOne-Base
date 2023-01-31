package 排序算法;

import java.util.Arrays;

/**
 * 选择排序
 * 算法原理:
 * <span>
 *     通过从0记录最小值的下标，遍历除该下标以外的元素，若更小，则改变下标并交换位置
 * </span>
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.1.31
 */
public class SelectSortToArrays {
    public static void main(String[] args) {
        int[] ary = {60, 40, 70, 20, 50, 80};
        // i表示对该位置求最小值
        for (int i = 0; i < ary.length - 1; i++) {
            int min = i;// 记录最小值下标
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] < ary[min]) {
                    min = j;
                }
            }
            // 将min指向的元素和i位置的元素互换
            if (min != i){
                int tmp = ary[i];
                ary[i] = ary[min];
                ary[min] = tmp;
            }
        }
        System.out.println(Arrays.toString(ary));
    }
}
