package apiDay01;
//7)
/**
 * int IndexOf(String s):
 * 检索给定的字符串s在当前字符串中首字母第一次出现的位置
 * int lastIndexOf(String s):
 * 检索给定的字符串s在当前字符串中最后一次出现的位置
 *
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //                      111111------与下面相连形成一个十位数字
        //            0123456789012345
        String str = "thinking in java";
        int index = str.indexOf("in"); //检索in在str中首字母第一次出现的位置
        System.out.println(index); //2

        index =str.indexOf("in",3);//从下标为3的位置开始找in首字母第1次出现的位置
        System.out.println(index); //5
        index =str.indexOf("in",10);//从下标为10的位置开始找in首字母第1次出现的位置
        System.out.println(index); //-1

        index = str.indexOf("abc"); //若字符串在str中不存在，则返回-1
        System.out.println(index); //-1
        System.out.println("====================================================");

        index = str.lastIndexOf("in"); //找in最后一次出现的位置
        System.out.println(index);  //9
    }
}
