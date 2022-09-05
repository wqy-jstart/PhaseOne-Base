package OODay06;
//成员内部类的演示
/*成员内部类：应用率低，了解
    ◦类中套类，外面的称为外部类，里面的称为内部类
    ◦内部类通常只服务于外部类，对外不具备可见性
    ◦内部类对象只能在外部类中创建
    ◦内部类中可以直接访问外部类的成员(包括私有的)，在内部类中有个隐式的引用指向了创建它的外部类对象------外部类名.this
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        Mama m = new Mama();
        m.b.show();
        //Baby b = new Baby(); //编译错误，内部类对外不具备可见性
    }
}
class Mama{//外部类
     private String name="武清源";
     Baby b = new Baby(); //内部类对象通常在外部类中创建
     class Baby{ //内部类,在外部类中new对象
         void show(){
             System.out.println(name);
             System.out.println(Mama.this.name);
         }
     }
}
