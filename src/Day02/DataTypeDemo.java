package Day02;
//变量数据类型之间的关系：
//byte<short<int<long<float<double
// ....... <char<.......
public class DataTypeDemo { //声明一个类名DataTypeDemo
    public static void main(String[] args) { //声明一个main方法，程序的入口
        //1.数据类型
        /*
        byte c=127;
        short d=10000;
        int  b=1000000000;
        long a=10000000000L;
        float e=300000000.12f;//加f与double相同
        //double f=3000000000;//3000000000默认为int类型因超过范围故会报错
        double f=30000000000.4;//浮点型直接量带小数点为浮点型
        /*
         */
        /*
        //1)int:整型，4个字节，-21个多亿到21个多亿
        int a = 25; //25称为整数直接量，默认int类型
        //int b = 10000000000; //编译错误，100亿默认为int类型，但超出int范围了
        //int c = 3.14; //编译错误，整型变量中只能装整数
        System.out.println(5/2); //2
        System.out.println(2/5); //0
        System.out.println(5/2.0); //2.5
        int d = 2147483647; //int的最大值
        d = d+1;
        System.out.println(d); //-2147483648(int最小值)，发生溢出了，溢出是需要避免的
        */

        /*
        //2)long:长整形，8个字节，很大很大很大
        long a= 25L;//25L为长整形直接量
        //long b=10000000000；//编译错误，100亿默认为int型，但超范围了
        long c=10000000000L;//100亿L为长整形

        //运算时若有可能溢出，建议在第一个数字后加L
        long d=1000000000*2*10L;
        System.out.println(d);//200亿
        long e =1000000000*3*10L;
        System.out.println(e);//不是300亿
        long f=1000000000L*3*10;
        System.out.println(f);//300亿
        */
        /*
        //3)double:浮点型，直接写成小数的都为double，8个字节，很大很大很大
        double a=3.14;//3.14为浮点数直接量，默认为double型
        float b=3.14F;//3.14F为float型直接量
        double c=3.0,d=1.9;
        System.out.println(c-d);//0.1000000000000009，有可能发生舍入误差
        ☆
        double b=5/2.0;
        double c=8/3;
        System.out.println(b);//有小数，结果保留小数得2.5
        System.out.println(c);//无小数，结果保留该数据类型形式小数点后的数抹去得2.0
        */

        /*
        //4)boolean布尔型，1个字节
        boolean a=true;//true为boolean直接量
        System.out.println(a);//true
        boolean b=false;//false为布尔型直接量
        System.out.println(b);//false
        //boolean c=25;//编译错误，只能存储true或false
        */


        //5)char:字符型，2个字节
        char c1 = '女'; //字符女
        System.out.println(c1);
        char c2 = 'f';  //字符f
        System.out.println(c2);
        char c3 = '6';  //字符6
        System.out.println(c3);
        char c4 = ' ';  //空格符
        System.out.println(c4);
        //char c5 = 女; //编译错误，字符型直接量必须放在单引号中
        //char c6 = ''; //编译错误，必须有字符
        //char c7 = '女性'; //编译错误，只能有1个字符

        char c8 = 65; //0到65535之间
        System.out.println(c8); //println输出时会依据c8的数据类型显示
        //若c8为char型，则显示字符---A
        //若c8为int型，则显示数字---65
        char c9 ='2';//'0'=48——>'2'=50
        System.out.println(c9);//输出时依据数据类型char，故结果为2
        //若c9为char型，则显示引号内原本字符----2
        //若c9为int型，则显示数字码----50
        char c10 = '\\';
        System.out.println(c10); //\


        //2.类型间转换
        /*
        int a=5;
        long b=a;//long>int故int转long自动转
        int c=(int)b;//long>int故long转int强制转
        System.out.println(c);

        long d =5;
        double e=5;//long转double（小转大）直接转
        long f=10000000000L;
        int g=(int)f;//long转int（大转小）强制转由于长整形变量f数值（100亿）大于int范围（21亿）故输出结果会溢出
        System.out.println(g);//结果溢出

        double h =25.987;//25.987为浮点型直接量
        int i =(int)h;//double转int（大转小）强制转，有可能丢失精度
        System.out.println(i);//25丢失精度
        */

        /*
        两点规则：
       ◾整数直接量可以直接赋值给byte,short,char，但不能超出范围
       ◾byte,short,char型数据参与运算时，系统一律自动将其转换为int再运算

        byte b1=5;//范围为-128--127之间
        byte b2=6;
        byte b3=(byte)(b1+b2);
        System.out.println(2+2);//4
        System.out.println(2+'2');//52
        System.out.println('2'+'2');//100
        System.out.println('2');//没有运算直接输出字符类型的2
        */
    }
}
