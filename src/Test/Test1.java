package Test;

public class Test1 {
    public static void main(String[] args) {
        Aoo b1 = new Aoo(1);
        Aoo b2 = new Boo(0);
    }
}
class Aoo{
    static String name="小明";
    static{
        System.out.println(name+"的成绩为:");
    }
    public Aoo(int b){
        System.out.println(b);
    }
}
class Boo extends Aoo{
    static String name="李华";
    static {
        System.out.println(name+"的成绩为:");
    }
    double result;
    double a = 89.5;
    public Boo(int d){
        super(90);
        System.out.println(result = a/d);
    }
}