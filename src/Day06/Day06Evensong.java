package Day06;

import java.util.Arrays;

public class Day06Evensong {
    public static void main(String[] args) {
        //1)封装一个generate方法
        //2)用于生成指定长度的int数组
        //3)数组的元素为0到指定范围的随机数
        //4)并将该数组返回
        /*
        int[] a = generate(5,10); //5个元素，0到10之间的随机数
        for(int i=0;i<a.length;i++){ //模拟对返回值的后续操作
            System.out.println(a[i]);
        }
         */

        //1)封装一个getMaxNum方法
        //2)用于查找指定数组元素的最大值
        //3)并将最大值返回

        int[] a = {26,58,45,39,97,1};
        int m1 = getMaxNum(a);
        System.out.println(m1);

        int[] b = {5,9,4,2,8};
        int m2 = getMaxNum(b);
        System.out.println(m2);
        System.out.println("===================================================");

        int[] c =generate(10,100);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println(Arrays.toString(c));
    }

    //查找数组元素的最大值
    public static int getMaxNum(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //依据自变量参数，创建不同长度(元素个数)和大小的数组
    public static int[] generate(int len,int max){
        int[] arr = new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*(max+1));
        }
        return arr;
    }
}
/*
常见面试题:
1.java的8种基本数据类型是什么?(简述java的8种基本数据类型)
  答:8种基本数据类型包括:byte,short,int,long,float,double,boolean,char
    1)byte:字节型，用于存储整数的，占用1个字节，范围-128到127
    2)short:短整型，用于存储整数的，占用2个字节，范围-32768到32767
    3)int:最常用的整型，用于存储整数的，占用4个字节，范围-2^31到2^31-1
    4)long:长整型，用于存储较大的整数，占用8个字节，范围-2^63到2^63-1
    5)float:单精度浮点数，用于存储小数的，占用4个字节，不能表示精确的值
    6)double:双精度浮点数，最常用的存储小数的类型，占用8个字节，不能表示精确的值
    7)boolean:布尔型，存储true或false，占用1个字节
    8)char:字符型，采用Unicode字符编码格式，存储单个字符，占用2个字节
2.switch能作用在哪些类型的变量上?
  答:可以作用于:byte、short、int、char、String、枚举类型，其余类型都是不允许的
*/


/*
1.数组:
  8)数组的排序:
    8.1)Arrays.sort(arr); //对arr进行升序排列
2.方法:函数、过程
  1)封装一段特定的业务逻辑功能
  2)尽可能的独立，一个方法只干一件事
  3)可以被反复调用多次
  4)减少代码重复，有利于代码的维护
3.方法的定义:五要素
   修饰词 返回值类型 方法名(参数列表){
     方法体
   }
4.方法的调用:
  1)无返回值: 方法名(有参传参);
  2)有返回值: 数据类型 变量 = 方法名(有参传参);
5.return:
  1)return 值; //1.1)结束方法的执行  1.2)返回结果给调用方
    ---------用在有返回值的方法中
  2)return;    //2.1)结束方法的执行
    ---------用在无返回值的方法中(在某种特定条件下提前结束方法)
*/

