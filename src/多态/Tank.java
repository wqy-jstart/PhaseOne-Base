package 多态;

public class Tank implements IFight{//坦克实现进攻的接口

    @Override
    public void attack(String order) {//实现攻击的指令
        System.out.println(order+"发射破甲弹...");
    }
}
