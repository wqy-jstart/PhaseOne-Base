package 多态;

public class FightTest {
    public static void main(String[] args) {
        //创建各类对象，并且利用相应对象进行调用攻击方法指令
        IFight soldier=new Soldier();//父类引用指向子类对象
        soldier.attack("海豹突击队");
        IFight tank =new Tank();//父类引用指向子类对象
        tank.attack("M1A3新型主战坦克");
        IFight f35=new F35();//父类引用指向子类对象
        f35.attack("F35 隐形歼击机");
    }
}
