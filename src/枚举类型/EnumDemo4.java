package 枚举类型;

/**
 * 在switch语句中使用枚举类
 */
enum Color2{
    RED,BLUE,YELLOW,BLACK
}
public class EnumDemo4 {
    public static void main(String[] args) {
        Color2 myVar = Color2.BLUE;
        switch (myVar){
            case RED:
                System.out.println("这是红色！");
                break;
            case BLUE:
                System.out.println("这是蓝色！");
                break;
            case YELLOW:
                System.out.println("这是黄色！");
                break;
            case BLACK:
                System.out.println("这是黑色！");
                break;
        }
    }
}
