package 多态;
//实现接口使用关键字implements
public class F35 implements IFight{//战斗机实现进攻的接口

    @Override
    public void attack(String order) {//实现攻击指令
        System.out.println(order+"发射AIM-120型中程空空导弹...");
    }
}
