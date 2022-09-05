package apiDay01;
//3)
/**
 * String toUpperCase():
 * 将当前字符串中的英文部分给转换为全大写
 * String toLowerCase():
 * 将当前字符串中的英文部分给转换为全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java！";
        String upper=str.toUpperCase(); //将str中的英文部分转换为全大写，并存入upper中
        System.out.println(upper); //我爱JAVA！

        String lower = str.toLowerCase(); //将str中的英文部分转换为全小写，并存入lower中
        System.out.println(lower); //我爱java！
    }
}
