package apiDay01;
//6)
/**
 * char charAt(int index):
 * 返回当前字符串指定位置上的字符-----根据位置找字符
 */
public class CharAtDemo {
    public static void main(String[] args) {
        //                      111111------与下面相连形成一个十位数字
        //            0123456789012345
        String str = "thinking in java";
        char c =str.charAt(9); //获取str中下标/索引为9所对应的字符
        System.out.println(c); //i
        char d =str.charAt(8);
        System.out.println(d); //空格
    }
}
