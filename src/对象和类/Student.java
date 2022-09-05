package 对象和类;

public class Student {//创建一个学生类
    String name;//声明成员变量name
    int age;//声明成员变量age
    public void study(){//创建成员方法study
        System.out.println("好好学习，天天向上！");
    }
    public void dohomework(){//创建成员方法dohomework
        System.out.println("键盘敲烂，月薪过万！");
    }
    public void print(){
        System.out.println("姓名为："+name+"；年龄为："+age);
    }

    public static void main(String[] args) {//使用main方法
        Student s=new Student();//创建对象
        s.name="武清源";//通过对象名直接访问成员变量name并赋值为“武清源”
        s.age=19;//通过对象名直接访问成员变量age并赋值为19
        s.print();
        s.study();//通过对象名直接访问成员方法study
        s.dohomework();//通过对象名直接访问成员方法dohomework
    }
}
