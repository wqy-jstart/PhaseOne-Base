package Day04;
import java.util.Scanner;//1.导入一个扫描仪
//Scanner的演示
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//2.新建扫描仪
        System.out.println("请输入年龄：");
        int age = scan.nextInt();//3.系统扫描一个整数给age
        System.out.println("请输入商品价格：");
        double price = scan.nextDouble();//3.扫描一个小数给price
        System.out.println("年龄为："+age+",价格为："+price);
    }
}
