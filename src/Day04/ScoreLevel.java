package Day04;
import java.util.Scanner;
        /*分支结构：
         ◦if...else if结构：多条路
         ◾语法：
          if(boolean-1){
         语句块1
          }else if(boolean-2){
         语句块2
          }else if(boolean-3){
         语句块3
          }else{
         语句块4
          }
         ◾执行过程：
        判断boolean-1，若为true则执行语句块1(结束)，若为false则
        再判断boolean-2，若为true则执行语句块2(结束)，若为false则
        再判断boolean-3，若为true则执行语句块3(结束)，若为false则    执行语句块4(结束)
         ◾说明：
        语句块1/2/3/4，只能执行其中之一------------多选1
        */
public class ScoreLevel {//score：成绩
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩");
        double score = scan.nextDouble();
        System.out.println("你的成绩为："+score);
        //带数（-25,888,95,85,65,45）
        if(score<0 || score>100) {
            System.out.println("成绩不合法，请重新输入！");
        }
        if (score == 100) {
            System.out.println("你的成绩为满分---你超越了99.99%的学生！");
        } else if (score >= 90) {
            System.out.println("A-优秀---你超越了87.6%的学生！");
        } else if (score >= 80) {
            System.out.println("B-良好---你超越了76.5%的学生！");
        } else if (score >= 60) {
            System.out.println("C-中等---你超越了52.3%的学生！");
        } else {
            System.out.println("D-不及格---你超越了31.2%的学生！");
        }
    }
}
