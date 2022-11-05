package Day06;
//数组的操纵

import java.util.Arrays;//导入操纵数组工具包

public class Demo02 {
    public static void main(String[] args) {
        //1)数组的复制：
        int[] a = {10, 20, 30, 40, 50};//起始数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("=======================================");
        int[] b = {1, 2, 3, 4, 5};//目标数组
        // a:源数组
        // srcPoc：原数组的起始下标
        // b:目标数组
        // destPos：目标数组的起始下标
        // length：要复制的长度(元素的个数)，不能超过起始数组和目标数组的长度，否则数组下标越界异常
        // 复制的元素会由你设定的目标数组起始下标开始从前到后顺序占用目标数组的下标，
        // 不够的由目标数组按照下标位置用自己的元素向后补缺，总长不变
        System.arraycopy(a, 1, b, 1, 3);//灵活性好
        for (int i = 0; i < b.length; i++) {//遍历数组，是数组按顺序输出的前提
            System.out.println(b[i]);//整型数组按顺序输出自身整型元素
        }
        System.out.println("========================================");

        //2)常规复制：
        int[] c = {10, 20, 30, 40, 50};
        //c:原数组
        //d:目标数组
        //newLength:目标数组的长度(元素个数),该值设置多少，目标数组就有多长
        //---若目标数组长度>源数组长度，则末尾补默认值
        //---若目标数组长度<源数组长度，则将末尾的截掉
        int[] d = Arrays.copyOf(c, 7);//灵活性差
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        System.out.println("=========================================");

        //3)数组的扩容：
        int[] e = {10, 20, 30, 40, 50};
        e = Arrays.copyOf(e, e.length + 1);
        for (int i = 0; i < e.length; i++) {
            //原本整型数组的长度为5，后经e.length+1,将数组长度扩增为6
            System.out.println(e[i]);
        }
        System.out.println("========================================");

        //4)数组的排序：(升序、降序)
        double[] arr = new double[10];//声明一个浮点型数组brr，包含10个浮点型元素，默认值为0.0
        for (int i = 0; i < arr.length; i++) {//遍历浮点型数组brr
            arr[i] = (double) (Math.random() * 100);//将浮点型数组brr中的所有元素设为0-99的随机数
            System.out.println(arr[i]);//系统按顺序输出浮点型数组中的所有元素
        }
        Arrays.sort(arr);//对brr进行升序排列
        System.out.println("排序后的数据");
        for (int i = 0; i < arr.length; i++) {//遍历排列后的浮点型数组brr
            System.out.println(arr[i]);//系统输出排序后数组brr的所有元素
        }
        System.out.println("倒序输出");
        for (int i = arr.length - 1; i >= 0; i--) {//遍历排列后的浮点型数组brr
            System.out.println(arr[i]);//系统输出排序后数组brr的所有元素
        }
        System.out.println("==========================================");

        //5)扩展(排序、打印、填充)
        int[] brr = {46, 34, 89, 14, 53, 72, 37, 90, 10, 7};
        Arrays.sort(brr);//将数组brr中的元素按升序排列
        //打印输出
        System.out.println(Arrays.toString(brr)); //打印排序后的数组元素Arrays.toString()
        //遍历输出
        for (int i = 0; i < brr.length; i++) {//遍历数组brr中的元素
            System.out.println(brr[i]);//顺序输出遍历排序后数组brr的所有元素，(加"ln"一列)
        }

        //数组填充
        //fromlndex：填充起始下标
        //tolndex：填充到第几个数(非下标)
        //val：填充内容
        Arrays.fill(brr, 2, 8, 100);
        System.out.println(Arrays.toString(brr));//打印数组arr元素
        for (int i = 0; i < brr.length; i++) {//遍历数组arr
            System.out.print(brr[i] + "\t");//顺序输出遍历后数组arr的所有元素，("不加ln"一排，加"\t"空格)
        }
        System.out.println(" ");
        //求和
        int sum = 0;
        for (int i = 0; i < brr.length; i++) {
            sum += brr[i];
        }
        System.out.println(sum);
    }
}


