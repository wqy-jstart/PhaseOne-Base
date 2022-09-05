package 案例;
//九九乘法表
//嵌套循环，外层走一次，内层走所有次
//循环中套循环，常常多行多列时使用，一般外层控制行，内层控制列
public class NineDemo {
    public static void main(String[] args) {
        //外层每循环一次，内层走完所有次，每一次都由初始值1开始增长进行
        for (int num = 1; num <= 9; num++) {
            //被外层束缚，根据外层的值来决定增长极限
            for (int i = 1; i <= num; i++) {
                //此步在第二层for循环内，num的值决定输出次数
                System.out.print(num+"*"+i+"="+(num*i)+"\t");
            }// 加上ln后按列排，去掉ln后按行排，“\t”为水平制表位，固定占8位，空格
            System.out.println( );//每当循环一个回合后，换行
        }
    }
}
/*
执行过程：
num=1 true,i=1 true. i=2 false——>1*1=1;换行
num=2 true,i=1 true. i=2 true. i=3 false——>1*2=2,2*2=4;换行
num=3 true,i=1 true. i=2 true. i=3 true. i=4 false——>1*3=3,2*3=6,3*3=9;换行
......
......
num=9 true,i=1 true. i=2 true. i=3 true. i=4 true·····i=9 true. i=10 false——>1*9=9,2*9=18···9*9=81;
 */
