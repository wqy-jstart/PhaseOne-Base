package OODay04;
//重写的特殊情况演示
public class Restaurant {
    public static void main(String[] args) {
       //Doo o1=new Doo();继承父类方法直接调用并且执行
       //o1.zuocan();//做中餐
        //Doo o2 = new Doo();重写方法被调用，看对象类型
        //o2.zuocan();//做西餐
        Coo o1 = new Coo();//重写中调用了超类的方法
        o1.zuocan();//做中餐，做西餐
    }
}
class Coo{
    void zuocan(){
        System.out.println("做中餐");
    }
}
class Doo extends Coo{
   // void zuocan(){
     //   System.out.println("做西餐");
    //}
    void zuocan(){
        super.zuocan();//利用super调用超类方法
        System.out.println("做西餐");
    }
}
