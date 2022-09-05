package Day06;
//数组
public class Demo01 {
    public static void main(String[] args) {
        /*是一种数据类型（引用类型）
          相同数据类型元素的集合
        */
        //定义：
        //1)
        //声明一个整型数组arr，包含10个整型元素，默认值都为0
        int[]arr=new int[10];
        //声明一个整型数组arr1，包含三个整形元素，值分别为5,8,10
        int[]arr1=new int[]{5,8,10};

        //2)
        // 初始化、取值：给数组中的元素进行初始化赋值和取值
        int[]a=new int[4];//声明一个整型数组a，包含4个整型元素，默认值都为0
        int[]b={1,3,5};//声明一个整型数组b，包含1,3,5三个整型元素
        int[]c=new int[]{1,3,5};//3个数标号按顺序0-1-2
        c[2]=10;//把整型数组中标号2的值修改为10
        System.out.println(c[0]);//系统访问输出整型数组c中标号0的值1
        System.out.println(c[1]);//系统访问输出整型数组c中标号1的值3
        System.out.println(c[2]);//系统访问输出整型数组c中标号2的值经修改为10

        //☆ArrayIndexOutOfBoundsException数组下标越界异常
        //◦数组下标范围为0到(数组长度-1)，超出范围则发生如上的异常
        //System.out.println(c[3]);//系统会报错，(下标越界异常)

        int[]d;//声明一个整型数组d
        //d={1,3,5}//编译错误
        d=new int[]{1,3,5};//正确，声明之后直接使用整形数组d，设定长度或赋值

        //3)
        // 访问：访问的是数组中的元素
        //通过(数组名.length)可以获取数组的长度(元素的个数)
        int[]brr=new int[4];
        System.out.println(brr.length);//输出整型数组brr的长度为4

        //4)
        // 通过下标/索引来访问数组中的元素
        //下标从0开始，最大到(数组的长度arr.length-1)
        int[]crr=new int[4];//声明一个整形数组crr，包含4个整形元素，默认值都为0
        crr[0]=111;//给整型数组crr中第0个元素赋值为111
        crr[1]=222;//给整型数组crr中第1个元素赋值为222
        crr[2]=333;//给整型数组crr中第2个元素赋值为333
        crr[3]=444;//给整型数组crr中第3个元素赋值为444
        //下标从0开始，最大到数组的长度-1-----(从第0个到第4-1=3个)
        System.out.println(crr[3]);//系统访问整型数组crr标号3(最后一个)的元素
        System.out.println(crr[crr.length-1]);//访问最后一个即3的元素

        //5)
        //遍历/迭代:从头到尾挨个走一遍，
        //沿着某条搜索路线，依次对每个元素均做一次且仅做一次访问，利用循环将数组中存放的元素依次输出
        int[]drr=new int[10];//声明一个整形数组drr，包含10个整型元素
        for(int i=0;i<drr.length;i++){//遍历drr数组，i的作用域仅在括号内若加分号循环结束，编译错误
            drr[i]=100;//给每一个整型数组中的元素都赋值为100，因后面随机赋值故此步不能体现
            //drr[i]代表drr中的每一个元素
            //系统将整型数组中的所有整型元素变为0-99的随机数
            drr[i]=(int)(Math.random()*100);
            System.out.println(drr[i]);//输出每一个随机整型元素的值
        }
        System.out.println("倒着输出");
        for(int i=drr.length-1;i>=0;i--){//下标顺序由drr.length-1到0，倒输
            System.out.println(drr[i]);
        }
    }
}
