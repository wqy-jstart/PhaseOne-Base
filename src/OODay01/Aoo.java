package OODay01;
//方法的重载(overload/overloading)：-----------更加方便用户的访问
//发生在同一类中，方法名相同，参数列表不同
//编译器在编译时会根据方法的签名自动绑定方法
public class Aoo {
    public static void main(String[] args) {
    }
    void show(){}
    void show(String name){}
    void show(int age){}
    void show(String name,int age){}
    void show(int age,String name){}
    //int show(){return 1;}//编译错误，重载与返回值类型int无关
    //void show(String address){}//编译错误，重载与参数名称无关
}
