package 继承;
//父类，超类，基类
public class Person1 {
    private String name;
    private int age;
    public Person1(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("我的名字是："+this.name);
        System.out.println("我的年龄是："+this.age);
    }
}
