package 案例;
import java.util.Scanner;//导入扫描仪
public class Addition {//创建Addition类
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//新建扫描仪
        int score = 0;//声明一个增型变量score（分数）并初始化赋值为0
        for (int i = 1; i <= 10; i++) {//利用嵌套循环分步执行程序
            int a=(int)(Math.random()*100);//系统随机生成0-99的数字a
            int b=(int)(Math.random()*100);//系统随机生成0-99的数字b
            int result=a+b;//声明一个整型变量result并赋值为a+b的和(存储正确答案)
            System.out.println("("+i+")"+a+"+"+b+"=?");//出题
            System.out.println("算吧！----输入-1可提前结束。");
            int answer =scan.nextInt();//等待用户输入答案
            if(answer==-1){//若答案为-1则直接跳出程序
                break;
            }
            if(answer==result){//如果答案正确
                System.out.println("下一题！");//系统向外输出下一题“
                score+=10;
            }else{//否则答案错误
                System.out.println("下一题！");//系统向外输出“下一题”
            }
        }
        System.out.println("你最终的得分为："+score);//十次后结算最终分数
    }
}
