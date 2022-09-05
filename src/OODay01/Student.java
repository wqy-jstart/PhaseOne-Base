package OODay01;
//学生类------凡是基于对象所抽象出来的类，都不需要main
//string默认值为null
//int默认值为0
//double默认值为0.0
public class Student {//类是对象的模板
    //成员变量------描述对象的属性
    String name;//-------默认值为null
    int age;//--------默认值为0
    String address;
    String interesting;
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
