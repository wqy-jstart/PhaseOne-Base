package OODay02;
//构造方法的演示
//构造方法可以实现一次构造，多个对象进行使用，属性不同可添加参数进行传递
public class Student {//Student类就是我们自己造的一种引用类型
    //成员变量------描述对象的属性
    String name;//-------默认值为null
    int age;//--------默认值为0
    String address;
    String interesting;
    Student(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
        interesting="打游戏";
    }
    void study(){
        System.out.println(name+"在学习...");
    }
    void say(){
        System.out.println("大家好，我叫"+name+",我今年"+age+"岁了！");
    }
    void sayHi(){
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，住在"+address);
    }
    void sayHello(){
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了，住在"+address+",喜爱"+interesting);
    }
}
