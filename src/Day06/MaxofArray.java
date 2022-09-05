package Day06;
//求数组元素的最大值，并将最大值放在数组最后一个元素的下一个位置，排序输出
import java.util.Arrays;//导入操纵数组方法包
//整个过程都在main方法中进行，数组arr定义并初始化以及遍历排序输出之后，可以以此为基础进行修改
//因为是随机数，因此每一次执行，数组中的元素都会在0-99之间改变
public class MaxofArray {//创建类
    public static void main(String[] args) {
        int[] arr = new int[10];//声明一个整型数组arr，包含10个整形元素，默认值为0
        for (int i = 0; i < arr.length; i++) {//遍历数组arr中的元素
            arr[i] = (int) (Math.random() * 100);//将数组中的所有元素设为0-99的随机数
            System.out.println(arr[i]);//系统按顺序输出整型数组arr中的所有元素
        }
        int MAX = arr[0];//假设整型变量MAX等于数组arr下标为0(第一个)的元素
        for (int i = 1; i < arr.length; i++) {//遍历除第一个元素以外的剩余元素
            if (arr[i] > MAX) {//如果剩余元素中存在大于MAX的元素
                MAX = arr[i];//则用最大的元素来修改MAX的值
            }
        }
        System.out.println("最大值为：" + MAX);//不断循环修改直到存在一个最大的元素
        System.out.println("============================================");
        arr = Arrays.copyOf(arr, arr.length + 2);//将数组arr中的元素扩容+1
        arr[arr.length - 1] = MAX;//扩容后的最后一个元素赋值给MAX
        for (int i = 0; i < arr.length; i++) {//遍历扩容后的数组arr
            System.out.println(arr[i]);//输出遍历扩容后的整型数组arr
        }
        System.out.println("=============================================");

        //扩展(排序、打印、填充)
        Arrays.sort(arr);//将数组arr进行升序排列
        System.out.println(Arrays.toString(arr));//打印数组元素Arrays.toString()
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//遍历并依次输出该数组arr
        }

        //数组填充
        //fromlndex：填充起始下标
        //tolndex：填充到第几个数(非下标)
        //val：填充内容
        Arrays.fill(arr,2,8,100);//包括下标2，不包括下标8
        System.out.println(Arrays.toString(arr));//打印数组arr元素
        for (int i = 0; i < arr.length; i++) {//遍历数组arr
            System.out.print(arr[i]+"\t");//输出遍历后数组arr的所有元素
        }
    }
}
