package OODay08;

/**
 * 测试类，程序运行
 */
public class MuLtiTypeDemo {
    public static void main(String[] args) {
        //1)条件1：引用所指向的对象，就是该类型
        //2)条件2：引用所指向的对象，实现了该接口或继承了该类
        Aoo o = new Boo(); //向上造型------o所指向的对象为Boo，引用类型为Aoo
        Boo o1 = (Boo) o;  //引用o所指向的对象，就是Boo的类型-----满足条件1
        Inter o2 = (Inter) o;//引用o所指向的对象，实现了Inter的接口---满足条件2
        Aoo o5 = o;  //引用o所指向的对象，继承了Aoo的类-----满足条件2
        //Coo o3 = (Coo) o; //o所指向的对象Boo跟Coo没有关系，运行时会发生ClassCastException异常
        if(o instanceof Coo){//若o所指向的对象跟Coo满足任一条件
            Coo o4 = (Coo) o; //则可以强转为Coo类型
        }else { //否则
            System.out.println("o不是Coo类型"); //输出内容
        }
    }
}
