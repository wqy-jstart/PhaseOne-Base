package 多态;

public class Soldier implements IFight{//士兵实现进攻的接口

    @Override
    public void attack(String order) {//实现攻击的指令
        System.out.println(order+"发射达姆弹...");
    }
}
