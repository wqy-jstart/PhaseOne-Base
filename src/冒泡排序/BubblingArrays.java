package 冒泡排序;

import java.util.Arrays;

public class BubblingArrays {
    public static void main(String[] args) {
        int[] arr = {60, 40, 70, 20, 50, 80};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //[20, 40, 50, 60, 70, 80]
    }
}
