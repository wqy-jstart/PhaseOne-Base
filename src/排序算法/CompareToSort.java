package 排序算法;

import java.util.Arrays;

/**
 * 比较排序算法的耗时
 *
 * @author java@wqy
 * @version 0.0.1
 * @since 2023.1.31
 */
public class CompareToSort {
    public static void main(String[] args) {
        // 插入10000条数据
        int[] ary = new int[10000];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int) (Math.random() * 30000);
        }
        // 获取当前时间
        long start = System.currentTimeMillis();
        // 冒泡排序----122ms
//        for (int i = 0; i < ary.length - 1; i++) {
//            for (int j = 0; j < ary.length - 1 - i; j++) {
//                if (ary[j] > ary[j + 1]) {
//                    int temp = ary[j];
//                    ary[j] = ary[j + 1];
//                    ary[j + 1] = temp;
//                }
//            }
//        }
        // 选择排序----74ms
        // i表示对该位置求最小值
//        for (int i = 0; i < ary.length - 1; i++) {
//            int min = i;// 记录最小值下标
//            for (int j = i + 1; j < ary.length; j++) {
//                if (ary[j] < ary[min]) {
//                    min = j;
//                }
//            }
//            // 将min指向的元素和i位置的元素互换
//            if (min != i){
//                int tmp = ary[i];
//                ary[i] = ary[min];
//                ary[min] = tmp;
//            }
//        }
        // 插入排序----34ms
//        for (int i = 1; i < ary.length; i++) {
//            // j表示插入元素的实时下标
//            for (int j = i; j > 0 && ary[j] < ary[j - 1]; j--) {// 实时下标要大于零且小于前面的数才会递减
//                int tmp = ary[j];
//                ary[j] = ary[j - 1];
//                ary[j - 1] = tmp;
//            }
//        }
        System.out.println(Arrays.toString(ary));

        long end = System.currentTimeMillis();
        System.out.println("排序完成！耗时：" + (end - start) + "ms");
    }
}
