package 继承;
//父类，超类，基类
public class Person {
    private String name;//声明私有的字符串型成员变量name
    private int age;//声明私有的字符串型成员变量age
    //公有的方法访问私有的属性
    public String getName() {//外部通过此方法读取私有属性name,非静态方法，有返回值，需创建对象后调用
        return name;
    }

    public void setName(String name) {//外部通过此方法给私有属性name赋值
        this.name = name;
    }

    public int getAge() {//外部通过此方法读取私有属性age
        return age;
    }

    public void setAge(int age) {//外部通过此方法给私有属性age赋值
        this.age = age;
    }
    public void say(){//外部可以直接调用此方法
        System.out.println("我会说话");
    }
}
