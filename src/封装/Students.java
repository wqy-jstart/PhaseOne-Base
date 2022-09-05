package 封装;

public class Students {//创建一个Student类
    private  String name;//私有修饰符，声明成员变量name
    private  int age;
    //公有方法访问私有属性
    public String getName() {//外部通过此方法访问name属性
        return name;
    }

    public void setName(String name) {//该方法使外部设置私有属性name
        this.name = name;//成员变量与局部变量名相同时，使用this关键字进行区分
    }

    public int getAge() {//外部通过此方法访问age属性
        return age;
    }

    public void setAge(int age) {//该方法使外部设置私有属性age
        this.age = age;
    }
    //此方法可以被外部直接调用
    public void study(){//非静态，无返回值的公开方法，需创建对象来调用
        System.out.println("好好学习，天天向上！");
    }
    public void say(){//非静态，无返回值的公开方法，需创建对象来调用
        System.out.println("姓名为："+name+"年龄为："+age);
    }
}
