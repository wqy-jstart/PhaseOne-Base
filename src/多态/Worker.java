package 多态;

public class Worker implements IWorker{

    @Override
    public void work() {
        System.out.println("我是普工，正在流水线上装配！");

    }

    @Override
    public void lunch() {
        System.out.println("我是普工，我正在吃午饭！");
    }
}
