package apiDay04;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 该类是为了演示List集合转化为String字符串的几种方式
 * 应用场景：
 * 在业务中通常前端的数据会以JSON字符串的格式传递给后端，
 * 后端拿到的只能是对象，所以利用List集合去操作，响应字符串的格式
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.1.30
 */
public class ListToString {
    public static void main(String[] args) {
        // 第一种方式(原生)
        List<String> list = Arrays.asList("wqy","wj","yaw","rl","wjx","sz");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            sb.append(",");
        }
        String str1 = sb.substring(0, sb.length() - 1);
        System.out.println(str1);

        // 第二种方式(String类的方法)
        String str2 = String.join(",", list);
        System.out.println(str2);

        // 第三种方式(StringUtils中的方法)
        String str3 = StringUtils.join(list, ",");
        System.out.println(str3);

        // 第四种方式(Java 1.8 --Stream流)
        String str4 = list.stream().collect(Collectors.joining(","));
        System.out.println(str4);

        String str5 = list.stream().collect(Collectors.joining(",", "{", "}"));
        System.out.println(str5);
    }
}
