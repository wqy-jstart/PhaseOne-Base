package Test;

// 演示重写
public class Override {
    public static void main(String[] args) {
        B b = new B();
        b.a1();
        System.out.println(b.a3());// 方法被重写，只有返回！！！
    }
}

class A{
    public void a1(){
        System.out.println("公开空返回");
    }

    private void a2(){
        System.out.println("私有空返回");
    }

    public int a3(){
        System.out.println("公开有返回");
        return 3;
    }
}

class B extends A{
    @java.lang.Override
    public int a3() {
        return 1;
    }
}
