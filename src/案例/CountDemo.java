package 案例;

import java.util.Scanner;

// 简易版计算器
public class CountDemo {
    public static void main(String[] args) {
        System.out.println("请选择要计算的类别：");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int result = 0; // 默认结果为0
        while (!type.equalsIgnoreCase("exit")) {
            System.out.println("请输入第一个数字：");
            Scanner scanner1 = new Scanner(System.in);
            int index1 = scanner1.nextInt();
            System.out.println("请输入第二个数字：");
            Scanner scanner2 = new Scanner(System.in);
            int index2 = scanner2.nextInt();
            switch (type) {
                case "+":
                    result = index1 + index2;
                    break;
                case "-":
                    result = index1 - index2;
                    break;
                case "*":
                    result = index1 * index2;
                    break;
                case "/":
                    result = index1 / index2;
                    break;
                default:
                    System.out.println("您输入的计算类型不符合规则，请重新输入：");
            }
            System.out.println("结果是：" + result);
            System.out.println("请选择要计算的类别：");
            Scanner scanner4 = new Scanner(System.in);
            type = scanner4.nextLine();
        }
    }
}
