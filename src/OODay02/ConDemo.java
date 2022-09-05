package OODay02;
//构造方法的演示
public class ConDemo {
    public static void main(String[] args) {
        Student zs=new Student("张三",23,"廊坊");
        Student ls=new Student("李四",25,"黑龙江");
        zs.study();
        zs.say();
        zs.sayHi();
        zs.sayHello();
        ls.study();
        ls.say();
        ls.sayHi();
        ls.sayHello();
    }
}
