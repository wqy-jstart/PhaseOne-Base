package 枚举类型;

/**
 * 迭代枚举元素
 * 利用枚举类中的values()方法返回一个枚举数组进行迭代
 */
enum Direction{
    EAST,SOUTH,WEST,NORTH
}
public class EnumDemo3 {
    //可以用增强for语句来迭代元素
    public static void main(String[] args) {
        for (Direction myDir : Direction.values()){
            System.out.println(myDir);
        }
    }
}
