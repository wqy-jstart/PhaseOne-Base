package 练习;

public class Demo1 {
    public void Aoo(){
        System.out.println("123445554");
    }
    public void Boo(){
        System.out.println("23241412414");
    }
}
//利用Demo匿名内部类重写Aoo和Boo普通方法时可以选择性重写
class Test{
    public static void main(String[] args) {
        Demo1 d = new Demo1(){
            @Override
            public void Aoo() {
                System.out.println("1234");
            }

            @Override
            public void Boo() {
                System.out.println("abcde");
            }
        };
    }
}