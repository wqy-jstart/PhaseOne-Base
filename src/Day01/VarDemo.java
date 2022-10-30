package Day01;

public class VarDemo {//VarDemo必须用大驼峰命名法（首字母大写）类名
    public static void main(String[] args) {
        //变量的声明：——相当于在银行开账户
        int a;//声明一个变量a
        int b,c,d;//声明三个整数的变量，名为b，c，d
        //重复inta；编译错误，变量不能同名
        int e = 250;//声明变量e并赋值为250
        int f;//声明变量f
        f = 250;//给变量f赋值为250
        f = e+360;//修改变量f的值为360
        System.out.println(f);//系统向外输出变量f的值
        int g =5000,h=10000;//声明整型变量g和h并赋值为5000和10000
        int i = g+1000;//g本身基础之上加1000
        System.out.println(i);//系统向外输出变量i的值
        int j= h-4000;//取出变量h的值10000减去4000之后赋值给整形变量j
        System.out.println(j);//系统向外输出变量j的值
        int score,myScore,myJavaScore;//小驼峰命名法（变量名）
        int Score,MyScore,MyJavaScore;//大驼峰命名法（类名）
    }
}
