package 抽象类和接口;

public class SmallWork implements Works {
    @Override
    public void work() {
        System.out.println("我是小工，我正在施工....");
    }

    @Override
    public void lunch() {
        System.out.println("我正在吃午饭...");

    }
}
