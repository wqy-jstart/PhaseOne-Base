package 抽象类和接口;

public class WorkTest {
    public static void main(String[] args) {
        SmallWork s=new SmallWork();
        s.work();
        s.lunch();
        SuperWork S=new SuperWork();
        S.work();
        S.lunch();
    }
}
