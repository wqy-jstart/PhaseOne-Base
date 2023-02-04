package 异常.Exception.CheckedException;

/**
 * 检查异常----线程中断异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class InterruptedException {
    public static void main(String[] args) {
        try {
            System.out.println("开始计数！");
            int start = 0;
            while (true) {
                if (start < 10) {
                    start++;
                    Thread.sleep(1000);
                    System.out.println(start);
                } else {
                    System.out.println("计数结束！");
                    break;
                }
            }
        }catch (java.lang.InterruptedException e){
            e.printStackTrace();
        }
    }
}
