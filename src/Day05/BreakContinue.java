package Day05;
//
public class BreakContinue {
    public static void main(String[] args) {
        //1.break语句：(跳出当前一次循环）
        //（1）
        int i=0;
        while(i<4){
            i++;
            if(i==2){
               break;
            }
            System.out.println(i);//1
        }
        /*
        执行过程：
        i=0  true， i=1  false；
        i=1  true， i=2  true-----break执行结束，系统输出a的值。
         */
        //（2)
        for(int h=1;h<=10;h++){
            if(h==4){//在某种特定条件下，提前结束循环
                break;
            }
            System.out.println(h+"*9="+h*9);
        }
        /*
        执行过程：
        h=1  true  1*9=9;
        h=2  true  2*9=18;
        h=3  true  3*9=27;
        h=4  true 结束循环
         */


        //2.continue语句：跳过循环体中的某一次循环
        //（1)
        int a=0;
        while(a<4){
            a++;
            if(a==2){
                continue;
            }
            System.out.println(a);//1 3 4
        }
        /*
        执行过程：
        a=0  true, a=1  false;
        a=1  true, a=2  true----continue;
        a=2  true, a=3  false;
        a=3  true, a=4  false;
        a=4  false结束执行，系统输出a的值。
         */
        //(2)
        for(int j=1;j<=10;j++){
            if(j%3==0){
                continue;
            }
            System.out.println(j+"*9="+j*9);
        }
        /*
        执行过程：
        j=1  true  1*9=9, j=2;
        j=2  true  2*9=18, j=3;
        j=3  true  跳过   , j=4;
        j=4  true  4*9=36, j=5;
        j=5  true  5*9=45, j=6;
        j=6  true  跳过     j=7;
        j=7  true  7*9=63， j=8;
        j=8  true  8*9=72, j=9;
        j=9  true  跳过     j=10;
        j=10 true  10*9=90, j=11;
        j=11 false 循环结束
         */
        for (int j = 1; j <= 10; j++) {
            if (j%3!=0) {
                System.out.println(j + "*9=" + (j * 9));
            }
        }
    }
}
