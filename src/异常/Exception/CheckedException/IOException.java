package 异常.Exception.CheckedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 检查异常----IO流异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class IOException {

    public static void main(String[] args) {
        try {
            File file = new File("D:\\Auth\\1674474634230多用户文档管理系统.md");
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            int d;
            while ((d = isr.read()) != -1) {
                System.out.print((char) d);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
            System.out.println("出现IO流的异常");
        }
    }
}
