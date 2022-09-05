package 封装;

public class StudentsDemo {
    public static void main(String[] args) {
        Students s =new Students();//创建对象，实例化Student类
        //没有构造方法，需通过实例化对象对成员变量属性一一访问
        s.setName("武清源");//通过外部方法给实例化对象的属性name赋值为“武清源”
        s.setAge(19);//通过外部方法给实例化对象的属性age赋值为19
        s.study();//通过对象直接访问成员方法say
        s.say();
    }
}
