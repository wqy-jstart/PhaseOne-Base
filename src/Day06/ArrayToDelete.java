package Day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 数组的删除
 * 在Java中数组数据引用类型对于删除是不合适的，因为数组在内存中是定长且连续的，不易删除
 * 这里提供三种不同的方法来删除数组(因为对象是数组，所以都很麻烦！)
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.1.11
 */
public class ArrayToDelete {

    /**
     * 第一种方式：替换缩容法
     *
     * @param nums 自定义数组
     * @param num  要删除的元素
     */
    private void arrayToDel01(int[] nums, int num) {
        System.out.println("原数组：" + Arrays.toString(nums) + "原数组的长度为：" + nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                nums[i] = nums[nums.length - 1];
                nums = Arrays.copyOf(nums, nums.length - 1);
            }
        }
        System.out.println("原数组：" + Arrays.toString(nums) + "现数组的长度为：" + nums.length);
    }

    /**
     * 第二种方式：下标复制法
     * @param nums 自定义数组
     * @param index 自定义要删除的下标
     */
    private void arrayToDel02(int[] nums, int index) {
        System.out.println("原数组：" + Arrays.toString(nums) + "原数组的长度为：" + nums.length);
        int[] newArray = new int[nums.length - 1];// 定义一个新数组，长度为删除后的数组
        for (int i = 0; i < newArray.length; i++) {
            if (index < 0 || index >= nums.length) {
                throw new RuntimeException("元素越界...");
            }
            if (i < index) { // 如果当前i在要删除的元素下标之前，则直接赋值
                newArray[i] = nums[i];
            } else { // 如果在要删除的元素下标之后，对应的值向后一位
                newArray[i] = nums[i + 1];
            }
        }
        System.out.println("现数组：" + Arrays.toString(newArray) + "现数组的长度为：" + newArray.length);
    }

    /**
     * 第三种方法：集合API-remove()删除法(或者迭代)
     * @param nums 需要的数组对象(这里数据类型只能是String或包装类)
     * @param index 删除的元素下标
     */
    private void arrayToDelete03(int[] nums , int index){
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);// 先将int[]转换成Integer[]
        List<Integer> list = Arrays.asList(integers); // 将数组转成List集合
        System.out.println("数组删除元素前："+list);
        List<Integer> arrayList = new ArrayList<>(list); // 将List集合转成ArrayList对象，并向上造型
        arrayList.remove(index); // 根据下标删除集合中的元素
        System.out.println("数组删除元素后："+arrayList);
    }

    // main()测试
    public static void main(String[] args) {
        ArrayToDelete arrayToDelete = new ArrayToDelete();
        // 数组在内存中是定长且连续的，多个方法调用同一个数组对象会导致数组不一致的现象
        int[] testNums1 = {1,2,3,4,5,6,7,8};
        int[] testNums2 = {1,2,3,4,5,6,7,8};
        int[] testNums3 = {1,2,3,4,5,6,7,8};
        int num = 4;
        int index = 3;
        // 第一种测试：
        System.out.println("=============================================");
        arrayToDelete.arrayToDel01(testNums1,num);
        System.out.println("=============================================");
        // 第二种测试：
        System.out.println("=============================================");
        arrayToDelete.arrayToDel02(testNums2,index);
        System.out.println("=============================================");
        // 第三种测试：
        System.out.println("=============================================");
        arrayToDelete.arrayToDelete03(testNums3,index);
        System.out.println("=============================================");
    }
}
