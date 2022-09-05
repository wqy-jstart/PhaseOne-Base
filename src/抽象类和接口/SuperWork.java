package 抽象类和接口;

public class SuperWork implements Works {
    @Override
    public void work() {
        System.out.println("我是超级工，我正在测量....");
    }

    @Override
    public void lunch() {
        System.out.println("我正在吃午饭....");
    }
}
