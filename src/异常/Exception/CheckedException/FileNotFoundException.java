package 异常.Exception.CheckedException;

import java.io.File;
import java.io.FileInputStream;

/**
 * 检查异常----文件找不到的异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class FileNotFoundException {

    public static void main(String[] args) {
        File file = new File("D:\\m");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("触发文件找不到的异常");
        }
    }
}
