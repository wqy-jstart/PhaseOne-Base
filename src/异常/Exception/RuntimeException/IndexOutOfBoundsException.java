package 异常.Exception.RuntimeException;

import java.util.ArrayList;
import java.util.List;

/**
 * 非检查异常----下标越界异常
 *
 * @author java@Wqy
 * @version 0.0.1
 * @since 2023.2.4
 */
public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(5));
    }
}
