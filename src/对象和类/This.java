package 对象和类;

public class This {//创建this类
    public  int x=10;//定义成员变量
    public  int y=15;

    public void sum(){//void(空)没有返回值//方法
        int z=this.x+this.y;//通过this点取成员变量
        System.out.println("x+y="+z);
    }
    public void sum(int h){//非静态变量，需要创建对象来传参
        System.out.println(h);
    }

    public static void main(String[] args) {
        This t=new This();
        t.sum();
        t.sum(40);//传参
    }
}
