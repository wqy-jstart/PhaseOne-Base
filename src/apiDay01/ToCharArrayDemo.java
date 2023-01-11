package apiDay01;

import java.util.Arrays;

/**
 * 演示toCharArray()方法
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.1.11
 */
public class ToCharArrayDemo {
    public static void main(String[] args) {
        String str = "I Love Java!";
        char[] chars = str.toCharArray();
        System.out.println("结果为："+ Arrays.toString(chars));
        // 结果为：[I,  , L, o, v, e,  , J, a, v, a, !]
    }
}
