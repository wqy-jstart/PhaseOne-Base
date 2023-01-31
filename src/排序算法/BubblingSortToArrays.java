package 排序算法;

import java.util.Arrays;

/**
 * 冒泡排序
 * 算法原理：
 * 给出一组数据，通过前后比较，最终排出结果
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2022.10.7
 */
public class BubblingSortToArrays {
    public static void main(String[] args) {
        int[] arr = {60, 40, 70, 20, 50, 80};
        // 嵌套遍历第一个元素和第二个元素比较
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                // 前后数据进行比较
                if(arr[j]>arr[j+1]){ // 如果前一个数据比后一个数据大
                    int a = arr[j];// 定义一个中间量交换两个数据
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //[20, 40, 50, 60, 70, 80]
    }
}
