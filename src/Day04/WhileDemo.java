package Day04;
//while结构的演示
public class WhileDemo {
    public static void main(String[] args) {
        /*
        1.while结构:
         1)语法：
            while(boolean){
                语句块
            }
          2）执行过程：
            判断Boolean的值，若为true则执行语句块，
            再判断Boolean的值，若为true则再执行语句块，
            再判断Boolean的值，若为true则再执行语句块，
            再判断Boolean的值，若为false则结束。
         */

        //1）输出五次“行动是成功的阶梯”  三个要素缺一不可
        int times=0;     //1)循环变量的初始化
        while(times <5){ //2)循环的条件
            System.out.println("行动是成功的阶梯");
            times++;     //3)循环变量的改变
        }
        System.out.println("结束执行...");

        /*
         ☆执行过程：----带数
                      times=0
          true  输出   times=1
          true  输出   times=2
          true  输出   times=3
          true  输出   times=4
          true  输出   times=5
          false while 循环结束
          输出继续执行
         */

        //2）输出乘以9的乘法表
        int num =1;
        while(num<=11){
            System.out.println(num+"*9="+num*9);
            num+=2;
        }
        System.out.println("结束执行...");

        /*
        执行过程：-----带数
                          num=1
        true  输出  1*9=9, num=3;
        true  输出  3*9=27, num=5;
        true  输出  5*9=45， num=7；
        true  输出  7*9=63， num=9；
        true  输出  9*9=81， num=11；
        true  输出  11*9=99， num=13;
        false  输出  继续执行
         */

        //3）跑三圈
        int run=0;
        while (run<=3){
            System.out.println("圈数为："+run);
            run+=1;
        }
        System.out.println("结束执行...");

        /*
        执行过程：----带数
                            run=0；
        true  输出  圈数为0， run=1；
        true  输出  圈数为1， run=2；
        true  输出  圈数为2， run=3；
        true  输出  圈数为3， run=4；
        false  输出  结束执行
        */

        //4）打印机打印六份简历
        int bum =0;
        while (bum<=6){
            System.out.println("份数为："+bum);
            bum+=1;
        }
        System.out.println("结束执行...");

        /*
        true  输出  份数为0， bum=1;
        true  输出  份数为1， bum=2；
        true  输出  份数为2， bum=3；
        true  输出  份数为3， bum=4；
        true  输出  份数为4， bum=5；
        true  输出  份数为5， bum=6；
        true  输出  份数为6， bum=7；
        false  输出  结束执行
         */


        //5)
        int a=1;
        int sum=0;
        while(a<=100){
            sum+=a;
            a++;
        }
        System.out.println("1+2+3+4+5...+100="+sum);
        /*
        执行过程：
        a=1  sum=0 true sum=0+1 a=2;
        a=2  true sum=0+1+2 a=3;
        ....
        ....
        a=100  true  sum=0+1+2+3+4+5...+100 a=101；
        false 结束执行
         */
    }
}
