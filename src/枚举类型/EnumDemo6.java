package 枚举类型;

/**
 * 枚举类成员
 * 枚举跟普通类一样可以用自己的变量、方法和构造函数，
 * 构造函数只能使用 private 访问修饰符，所以外部无法调用。
 * 枚举既可以包含具体方法，也可以包含抽象方法。
 * 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。
 */
enum Color4{
    RED,GREEN,BLUE;
    //构造方法
    private Color4(){ //构造方法默认私有
        System.out.println("独属于Color4的构造方法！");
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo(){
        System.out.println("这是颜色枚举类型！");
        System.out.println("该枚举类的类型为："+Color4.class);//利用反射返回一个Class对象
    }
}
public class EnumDemo6 {
    public static void main(String[] args) {
        Color4 c = Color4.RED;//实例化枚举类后自动调用私有构造方法
        System.out.println(c);
        c.colorInfo();
    }
}
