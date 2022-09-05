package 案例;
import java.util.Scanner;
//猜数字小游戏
        /*
        Math.random()--------------0.0到0.9999999999999999...
        *1000----------------------0.0到999.99999999999999...
        +1-------------------------1.0到1000.9999999999999...
        (int)----------------------1到1000
        */
        //变量的作用域：从声明到包着它最近的括号结束
public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random()*100+1);//藏数，1到100之内的随机数
        System.out.println(num);//作弊

        //带数与目标随机数的关系并进入执行
        int guess1;//扩大作用范围,从声明到main方法内执行结束
        do{ System.out.println("猜吧！");//进入有三种情况，用if..elseif
            guess1 = scan.nextInt();             //用户输入数值

            if(guess1>num){                      //如果大于系统随机数num
                System.out.println("数值太大了！");  //系统向外输出“数值太大了”
            }else if(guess1<num){                //否则如果小于系统随机数num
                System.out.println("数值太小了！");  //系统向外输出“数值太小了”
            }else{                              //否则以上两点都不符合
                System.out.println("恭喜你猜对了！");//系统向外输出“恭喜你猜对了”
            }

        }while(guess1!=num);//系统判断用户输入的值guess，若不等于num则为true继续往上循环，若等于num则为false，程序结束



        //带数判断与目标随机数的关系并进入执行
        System.out.println("猜吧！");
        int guess2 = scan.nextInt();            //接收用户输入的数值
        // while(当什么的时候)当guess不等于num的时候（true）执行内部条件两种情况，用if...else
        while(guess2!=num){

            if(guess2>num){                     //如果guess的值大于num
                System.out.println("数值太大了");//系统向外输出“数值太大了”
            }else{                             //否则(相当于guess的值小于num)
                System.out.println("数值太小了");//系统向外输出“数值太小了”
            }

            System.out.println("猜吧！");       //系统继续向外输出“猜吧！”
            guess2 = scan.nextInt();            //继续向内部输出让系统扫描
        }                                      //当猜中时while时即（false）自动结束
        System.out.println("恭喜你猜对了！");    //系统输出“恭喜你猜对了！”
    }
}
