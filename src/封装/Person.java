package 封装;
//封装：将属性私有化，提供共有的方法访问私有的属性
public class Person {//创建Person类
    //封装属性：把属性设置为私有
    private String name;//声明私有的字符串型变量name，成员变量
    private int age;//声明私有整型变量age，成员变量
    //公有的方法访问私有的属性
    public String getName() { //外部通过此方法访问name属性
        return name;
    }

    public void setName(String name) {//该方法使外部赋值给私有属性name
        this.name = name;//成员变量与局部变量名相同时利用this关键字来区分
    }

    public int getAge() { //外部通过此方法访问age属性
        return age;
    }

    public void setAge(int age) { //该方法使外部赋值给私有属性age
        this.age = age;
    }
    void say(){//此方法可以被外部直接调用
        System.out.println("我叫"+name+"，今年"+age+"岁了！");
    }

    public static void main(String[] args) {//main方法
        Person person=new Person();//创建对象，实例化Person类
        person.setName("武清源");//通过开放方法给实例化对象的name属性赋值
        person.setAge(19);//通过开放方法给实例化对象的age属性赋值
        person.say();//调用实例化对象的方法
    }
}
