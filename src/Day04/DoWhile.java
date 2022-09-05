package Day04;
//DoWhile的演示
public class DoWhile {
    public static void main(String[] args) {
        int a=1;
        int sum=0;
        do{
            sum+=a;
            a++;
        }while(a<=100);
        System.out.println("1+2+3+4+5+...+100="+sum);

        int b=1;
        do{
            System.out.println(b+"*9="+b*9);
            b++;
        }while(b<10);

    }
}
