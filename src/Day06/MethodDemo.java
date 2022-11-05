package Day06;

import java.util.Arrays;

//方法的演示
//方法名：小驼峰命名法
/*
   （1）调用方法：
 ◦无返回值时：直接调方法名(有参传参);
 ◦有返回值时：声明(数据类型+变量名)=方法名(有参传参);-----需要将void换成你要返回的类型
  返回之后无论是值还是数组，可以对其进行任意操作-------节省代码量，结构清晰
   （2）何时有返回值？何时没有返回值？
  ---方法操作完成后:
  1)若还需要用到方法中的某个数据---------有返回值
  2)若不需要用到方法中的数据------------无返回值
*/
public class MethodDemo {
    public static void main(String[] args) {//main方法，程序的入口
        //无返回值
        //1）
        say();
        //2）
        sayHi("武清源");

        sayHello("武清源", 19);
        System.out.println("================================");
        //有返回值
        //3）
        double a = getNum();//getNum为调用方，相当于return后的数8.88
        System.out.println(a);
        //4）
        int b = plus(3, 4);
        System.out.println(b);
        int m = 5, n = 6;
        int c = plus(m, n);//传递的是m和n里面的数
        System.out.println(c);//11-----模拟对返回值的后续操作
        //5）
        System.out.println("================================");
        int[] d = testArray();//调用方法，用来使用
        System.out.println(d.length);//数组中的数已经在方法中填充完毕，此步是输出数组长度
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + "\t");//依次输出填充后数组中的所有元素
        }
        System.out.println(" ");//换行
        System.out.println(Arrays.toString(d));
        //6）方法中的嵌套调用
        a();//111,333,222
        System.out.println(444);//444
    }

    //1）无参无返回值:
    public static void say() {
        System.out.println("大家好，我叫武清源，今年19岁了！");
    }

    //2）有参无返回值:--------比较灵活，参数在相应数据类型下可以改变
    public static void sayHi(String name) {
        System.out.println("大家好，我叫" + name + "，今年19岁了！");
    }

    public static void sayHello(String name, int age) {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了！");
    }

    //3）无参有返回值
    public static double getNum() {
        //有返回值的方法中，必须得有return，
        //并且return后的那个数据类型还必须与返回值类型匹配
        //return"abc";//编译错误，返回值类型不匹配
        return 8.88;//1）结束方法进行  2）返回结果给调用方
    }

    //4）有参有返回值
    public static int plus(int num1, int num2) {
        int num = num1 + num2;
        return num;//返回的是num里面的值
        //return num1+num2;返回的是num1与num2的和
    }

    //5）无参有返回值
    public static int[] testArray() {//这个方法的目的是填充10个0-99以内的随机数,并且按升序排列
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        //return arr[0];//编译错误，因arr[0]是int型，不是int[]型，需返回int[]型才行
        return arr;//1）结束方法进行 2）返回结果给调用方以使用
    }

    //6）方法中的嵌套调用
    public static void a() {
        System.out.println(111);
        b();
        System.out.println(222);
    }

    public static void b() {
        System.out.println(333);
    }
}


