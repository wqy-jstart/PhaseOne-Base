package Day04;

import java.util.Scanner;
         /*switch...case结构：多条路
           优点：效率高、结构清晰
           缺点：只能对整数判断相等
           break：跳出switch
           常见面试题：switch可以作用于什么类型的数据上
           -------------------------byte,short,int,char,String,枚举类型
          */
public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//新建扫描仪
        System.out.println("请选择功能：1.取款 2.存款 3.查询余额 0.退卡");
        int cammand = scan.nextInt();//系统扫描一个整数给cammand（变量）

        switch (cammand){
            case 1:
                System.out.println("取款操作...");
                break;
            case 2:
                System.out.println("存款操作...");
                break;
            case 3:
                System.out.println("查询余额操作...");
                break;
            case 0:
                System.out.println("退卡操作...");
            default://输入数字若非以上四种，则进入此步运行结果“输入错误”
                System.out.println("输入错误");
        }
    }
}
