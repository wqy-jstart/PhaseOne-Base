package Day05;
//for结构的演示
public class ForDemo {
    public static void main(String[] args) {
        //(1)
        for(int i=1,j=5;i<=5;i+=2,j-=2){//i为循环变量
            System.out.println(j );
        }


        //(2)
        for(int times=0;times<5;times++){
            System.out.println("行动是成功的阶梯");//此步写在for语句里面，则每一步判断为true的值都会输出，知道false结束循环
        }


        //(3）
        int a=1;//先声明
        int sum=0;
        for(a=1;a<=100;a++){//for内为循环变量三要素（初始化，条件，改变）
            sum+=a;//语句块

        }
        System.out.println("1+2+3+4+5+...+100="+sum);//此步写在外面，只输出最后判断为true的值。

        /*
        执行过程;
        a=1  sum=0  true, a=2  sum=0+1;
        a=2  true  a=3  sum=0+1+2;
        a=3  true  a=4  sum=0+1+2+3;
        ....
        ....
        a=100  true a=101 sum=0+1+2+3+4+....+100
        a=101  false执行结束
         */

        //(4)用for来求8的阶乘
        int num=1;
        for(int i=1;i<=8;i++){
            num*=i;
        }
        System.out.println("num="+num);


        /*
        执行过程：
        num=1 i=1 true num=1*1 i=2;
        i=2  true  num=1*1*2 i=3;
        i=3  true  num=1*1*2*3  i=4；
        ....
        i=8  true  num=1*2*3*4*...*8 i=9；
        i=9  false执行结束
         */

        //(5)for的特殊格式------了解
        //1乘到9
        int b=1;
        for(;b<=9;b++){
            System.out.println(b+"*9="+b*9);
        }

        for(int c=1;c<=9;c++){
            System.out.println(c+"*9="+c*9);
        }

        /*
        for (;;){//无循环条件为死循环
            System.out.println("好好学习，天天向上！");
        }
        */

        int a1;
        for (a1 = 0; a1 < 6; a1++) {
            a1 = 3;//如果a1在此修改为3，则输出值都为3，不管循环怎么改变
        }
        System.out.println(a1);
    }
}
